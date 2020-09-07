create table board_table (
	board_no			number 			primary key				(시퀀스를 쓸 것이다.)
	,member_id		    varchar2(20) 		not null
	,board_title		varchar2(200) 		not null
	,board_context		varchar2(2000)		not null
	,board_indate		date                default sysdate
	,board_hits		    number 			default 0	
	,originalfile		varchar2(200)							(원본파일명)
	,savedfile			varchar2(100)							(저장파일명)
	,constraint board_fk foreign key(member_id)
		references member_table(member_id) on delete cascade
);


create sequence board_seq;