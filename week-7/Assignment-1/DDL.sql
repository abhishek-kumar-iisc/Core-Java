show databases;
create database if not exists myTweeter;

use myTweeter;

create table if not exists userDetails(
	userId int unsigned primary key auto_increment,
    username varchar(20) unique not null,
    firstname varchar(15) not null,
    lastname varchar(15),
    birthday date,
    emailId varchar(40) unique not null,
    phonenumber varchar(15) unique not null
);
create table if not exists tweetDetails(
	tweetId int unsigned primary key auto_increment  not null,
    tweet varchar(50),
    createdAt date,
    userId int unsigned  not null,
    constraint foreign key(userId) references userDetails(userId)
);
create table if not exists userFollow(
	userId int unsigned  not null,
    followId int unsigned  not null,
   constraint foreign key(userId) references userDetails(userId),
   constraint foreign key(followId) references userDetails(userId),
   check (userId<>followId),
   unique index(userId,followId)
);
create table if not exists tweetLikes(
	userId int unsigned not null,
    tweetId int unsigned not null ,
    likes int unsigned ,
   constraint foreign key(userId) references userDetails(userId),  
   constraint foreign key(tweetId) references tweetDetails(tweetId),
   check (likes = 1),
   unique index(userId, tweetId)
);

create table if not exists tweetComments(
	userId int unsigned not null,
    tweetId int unsigned not null,
    comments text,
   constraint foreign key(userId) references userDetails(userId),  
   constraint foreign key(tweetId) references tweetDetails(tweetId)
);

show table status;
show tables;
/*alter table userDetails drop column following;
alter table tweetDetails modify column tweet varchar(250);*/

drop table tweetComments;
drop table tweetLikes;
drop table userFollow;
drop table tweetDetails;
drop table userDetails;
