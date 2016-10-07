create table Tag(
	t_id int primary key,			--编号	
	t_name varchar2(100) not null,	--标签名
	t_count  int				--标签下所对应的网址数量
);
alter table Tag rename column t_c1ount to t_count;
select * from Tag
create sequence seq_t_id
       increment by 1
       start with 10
       nomaxvalue
       nocycle;
       
insert into Tag
select 1, 'java', 2 from dual union
select 2, 'struts', 1 from dual union
select 3, 'oracle', 1 from dual ;
create table Favorite(
	f_id int primary key,   			--网址编号
	f_label varchar2(1000) not null,   --网站名
	f_url varchar2(300) not null,   --地址
	f_tags varchar2(1000),        --分类标签名，以“，”类分割
	f_desc varchar2(2000)         --描述
);

select count(1) from tag where t_name='java'
create sequence seq_f_id
       increment by 1
       start with 100
       nomaxvalue
       nocycle;
insert into Favorite 
select 1, 'Apache Struts', 'http://struts.apache.org', 'java,struts', 'struts官方网站' from dual union
select 2, 'Oracle', 'http://www.oracle.com', 'java,oracle', 'oracle官方网站' from dual;