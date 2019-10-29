show databases;
use Twitter1_db;
insert into User(Handle,lastname,createdDate)
 values('anushakiru','anu','2019-07-07');
 insert into User(Handle,firstName,lastName,createdDate)
 values('ashwini0','ashwini','achu','2018-05-05'),
         ('getha','geetha','getu','2018-08-08'),
         ('mohan','moki','moi','2019-05-07'),
         ('manohar','manohar','AN','2017-08-07');
         
	update User 
    set firstname = 'anusha'
    where Handle = 'anushakiru';
    
insert into Tweet(Tweet_message,Tweet_createdDate,user_id)
values('WELCOME','2019-03-03','1'),
('Hi','2019-08-08','2'),
('BIRTHDAY','2018-05-06','4'),
('INDIAN WON','2016-07-07','5'),
('HI ASHWINI','2018-09-10','3');

insert into comment(comment_like,tweet_id,user_id)
values('3','14','1'),
('5','13','3'),
('1','11','5'),
('3','12','4'),
('7','11','2');


insert into likes(Tweet_id,user_id)
values('11','3'),
('12','4'),
('13','2'),
('14','5');

insert into followers(tweet_id,user_id)
values('11','1'),
('13','2'),
('15','3'),
('14','4');


insert into following(tweet_id,user_id)
values('15','4'),
('11','3'), 
('12','5'),
('13','1');


select * from User;
select * from Tweet;
select * from comment;
select * from Likes;
select * from followers; 
select * from following;
