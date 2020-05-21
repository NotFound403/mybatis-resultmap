drop schema if exists `mybatis`;
create schema `mybatis`;
use `mybatis`;
DROP TABLE IF EXISTS `department`;
create table "department"
(
    "department_id"    VARCHAR(32) not null,
    "department_name"  VARCHAR(32),
    "department_level" INT,
    constraint "department_pk"
        primary key ("department_id")
);
DROP TABLE IF EXISTS `employee`;
create table "employee"
(
    "employee_id"   VARCHAR(32) not null,
    "employee_name"          VARCHAR(16),
    "job_number"    VARCHAR(32),
    "department_id" VARCHAR(32),
    "company_no"    INT,
    "level"         INT,
    "employee_type" INT default 0,
    constraint "employee_pk"
        primary key ("employee_id")
);

create unique index "employee_job_number_uindex"
    on "employee" ("job_number");

