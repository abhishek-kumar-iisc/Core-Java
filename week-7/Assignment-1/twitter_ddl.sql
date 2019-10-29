create database if not exists Twitter1_db;
use Twitter1_db;

show tables;

create table if not exists User(
id int unsigned primary key auto_increment,
Handle varchar(10) unique,
firstName varchar(20),
lastName varchar(20),
createdDate date
);

create table if not exists Tweet(
id int unsigned primary key auto_increment,
Tweet_message varchar(40),
Tweet_createdDate date,
user_id int unsigned,

constraint foreign key (user_id) references User(id)
);

create table if not exists Comment(
Comment_id int unsigned primary key auto_increment,
Comment_like int unsigned,
tweet_id int unsigned,
user_id int unsigned,

constraint foreign key (tweet_id) references Tweet(id),
constraint foreign key (user_id) references User(id)

);

create table if not exists Likes(
Likes_id int unsigned primary key auto_increment ,

tweet_id int unsigned,
user_id int unsigned,

constraint foreign key (tweet_id) references Tweet(id),
constraint foreign key (user_id) references User(id)


);


create table if not exists followers (
followers_id int unsigned primary key auto_increment,


tweet_id int unsigned,
user_id int unsigned,

constraint foreign key (tweet_id) references Tweet(id),
constraint foreign key (user_id) references User(id)
);

create table if not exists following(
following_id int unsigned primary key auto_increment,

tweet_id int unsigned,
user_id int unsigned,

constraint foreign key (tweet_id) references Tweet(id),
constraint foreign key (user_id) references User(id)
);


#drop table User;
#drop table Tweet;
#drop table Comment;
#drop table following;
#drop table followers;
#drop table Likes;
