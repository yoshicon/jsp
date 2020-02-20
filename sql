sys

CREATE USER babo
IDENTIFIED BY bako
DEFAULT TABLESPACE worksp
TEMPORARY TABLESPACE TEMP;

GRANT  DELETE, INSERT, SELECT, UPDATE ON test TO babo;

alter user babo default tablespace TEST quota unlimited on TEST;
ex) alter user myuser default tablespace users quota unlimited on users;


CREATE USER baku
IDENTIFIED BY bako
DEFAULT TABLESPACE test
TEMPORARY TABLESPACE TEMP
GRANT CREATE SESSION CREATE TABLE
;


grant create session, create table to babo;

SELECT * From DBA_USERS;

drop user babo;

SELECT * FROM DBA_SYS_PRIVS
WHERE GRANTEE = 'babo';

SELECT * FROM DBA_ROLE_PRIVS
WHERE GRANTEE = 'sys';

CREATE TABLESPACE test
DATAFILE test 
SIZE 2048M 
AUTOEXTEND ON 
NEXT 4M MAXSIZE UNLIMITED
LOGGING PERMANENT EXTENT MANAGEMENT LOCAL AUTOALLOCATE
BLOCKSIZE 8K 
SEGMENT SPACE MANAGEMENT MANUAL 
FLASHBACK ON; 

CREATE TABLESPACE TEST
DATAFILE 'D:\HAK\app_data.dbf' SIZE 100M
AUTOEXTEND ON NEXT 10M ; 


/////////////////////////////////////////////////////////////////////////////////

babo


create table membertb(
	userName VARCHAR(25),
	userID   VARCHAR(25),
	userIW   VARCHAR(40),
	useraDDR VARCHAR(100)
);


create table membertb(
	userName VARCHAR(25),
	userId   VARCHAR(25),
	userPw   VARCHAR(40),
	userAddr VARCHAR(100)
);

select * from memberTB;

INSERT INTO membertb( username, userid, userpw, useraddr)
       VALUES ( '1', 'JACK', '35', 'zip' );

/*

	private String userName;
	private String userId;
	private String userPw;
	private String userAddr;

*/