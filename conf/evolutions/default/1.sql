# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table hackfest (
  id                        bigint not null,
  title_hack                varchar(255),
  description               varchar(255),
  date                      varchar(255),
  constraint pk_hackfest primary key (id))
;

create sequence hackfest_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists hackfest;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists hackfest_seq;

