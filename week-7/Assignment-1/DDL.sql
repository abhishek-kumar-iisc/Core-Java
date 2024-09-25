show databases;
create database if not exists myTweeter;

use myTweeter;
create table if not exists tweetDetails(
	tweetId int unsigned primary key auto_increment,
    tweet text,
    createdAt date     
);
create table if not exists userDetails(
	userId int unsigned primary key auto_increment,
    tweetId int unsigned,
    followers int unsigned,
    following int unsigned,
   constraint foreign key(tweetId) references tweetDetails(tweetId)
);

create table if not exists userFollow(
	userId int unsigned,
    followId int unsigned,
   constraint foreign key(userId) references userDetails(userId),
   constraint foreign key(followId) references userDetails(userId)
);
create table if not exists tweetLikes(
	userId int unsigned,
    tweetId int unsigned,
    likes int unsigned ,
   constraint foreign key(userId) references userDetails(userId),  
   constraint foreign key(tweetId) references tweetDetails(tweetId)
);

create table if not exists tweetComments(
	userId int unsigned,
    tweetId int unsigned,
    comments text,
   constraint foreign key(userId) references userDetails(userId),  
   constraint foreign key(tweetId) references tweetDetails(tweetId)
);


drop table tweetComments;
drop table tweetLikes;
drop table userFollow;
drop table userDetails;
drop table tweetDetails;
