create table customers (
firstName varchar(30),
lastName varchar(30),
ssn integer,
DOB varchar(10),
username varchar(30),
pw varchar(30),
accountNum serial primary key,

);
create table admins (
username varchar(30) primary key,
pw varchar(30)
);
create table accounts (
accoutnNum integer primary key,
balance integer
);
select * from accounts;
select * from customers;
select * from accounts;

ALTER TABLE project_zero.accounts ADD CONSTRAINT accounts_fk FOREIGN KEY (account_num) REFERENCES project_zero.customers(account_num) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE project_zero.accounts DROP CONSTRAINT accounts_pk;

insert into admins values ('hbrown','romeo');

--CREATE OR REPLACE PROCEDURE deposit(acc IN integer, amount IN double)
--IS
--BEGIN
  --  UPDATE accounts -- TABLE
  --SET balance = balance + amount -- INCREASE BALANCE
  --  WHERE account_num = acc; -- DO THIS TO CORRECT USER
--END;
--commit;

--CREATE OR REPLACE PROCEDURE withdraw(acc IN integer, amount IN double)
--IS
--BEGIN
--    UPDATE accounts -- TABLE
--    SET balance = balance - amount -- DECREASE BALANCE
--    WHERE account_num = acc; -- DO THIS TO CORRECT USER
--END;
--commit;
