use myTweeter;
select * from userDetails;
select * from tweetDetails;
select * from tweetLikes;
select * from tweetComments;
select * from userFollow;
show create table userDetails;
show create table tweetDetails;


insert into userDetails (userId, username, firstname, lastname, birthday, emailId, phonenumber) values (10256,"alan@123","alan","stroke","1998-05-10","alanstroke01@gmail.com","958-658-9235");
insert into userDetails (userId, username, firstname, lastname, birthday, emailId, phonenumber) values (10255,"HarryPotter","harry","potter","1996-07-13","harry.potter@gmail.com","858-657-9455");
insert into userDetails (userId, username, firstname, lastname, birthday, emailId, phonenumber) values (10257,"jsonroy578","json","roy","1985-11-1","jsonroy578@gmail.com","789-346-9215");
insert into userDetails (userId, username, firstname, lastname, birthday, emailId, phonenumber) values (10259,"parkerkevin@123","kevin","parker","2000-03-07","parkerkevin@gmail.com","985-212-5686");
insert into userDetails (userId, username, firstname, lastname, birthday, emailId, phonenumber) values (10258,"starks","arya","stark","1999-02-16","aryastark@gmail.com","984-6525-2303");

insert into tweetDetails (tweetId,tweet,createdAt,userId) values (20256, "Hello world, We are connected now", curdate(),10256);
insert into tweetDetails (tweetId,tweet,createdAt,userId) values (20257, "Either way, we can all do with a bit more spark to help us perform miracles and live in joy.", curdate(),10256);
insert into tweetDetails (tweetId,tweet,createdAt,userId) values (20258, "When you can’t find the sunshine, be the sunshine", curdate(),10258);
insert into tweetDetails (tweetId,tweet,createdAt,userId) values (20259, "So, what if, instead of thinking about solving your whole life, you just think about adding additional good things. Just let your pile of good things grow", curdate(),10259);
insert into tweetDetails (tweetId,tweet,createdAt,userId) values (20260, "“It takes a great deal of bravery to stand up to our enemies, but just as much to stand up to our friends.” ", curdate(),10255);

insert into userFollow (userId, followId) values (10255, 10257);
insert into userFollow (userId, followId) values (10255, 10258);
insert into userFollow (userId, followId) values (10255, 10259); 
insert into userFollow (userId, followId) values (10256, 10255);
insert into userFollow (userId, followId) values (10256, 10257);
insert into userFollow (userId, followId) values (10256, 10258);
insert into userFollow (userId, followId) values (10257, 10255);
insert into userFollow (userId, followId) values (10257, 10256);
insert into userFollow (userId, followId) values (10257, 10258);
insert into userFollow (userId, followId) values (10257, 10259);
insert into userFollow (userId, followId) values (10258, 10255);
insert into userFollow (userId, followId) values (10258, 10257);
insert into userFollow (userId, followId) values (10258, 10256);
insert into userFollow (userId, followId) values (10259, 10258);
insert into userFollow (userId, followId) values (10259, 10257);

insert into tweetLikes(userId,tweetId,likes) values  (10256,20256,1);
insert into tweetLikes(userId,tweetId,likes) values  (10256,20257,1);
insert into tweetLikes(userId,tweetId,likes) values  (10256,20259,1);
insert into tweetLikes(userId,tweetId,likes) values  (10256,20256,1);

delete from userDetails where userId=1;
delete from tweetLikes where tweetId=20256;