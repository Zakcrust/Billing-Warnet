/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     12/05/2019 13:42:36                          */
/*==============================================================*/

/*
drop table if exists BILLING_DETAIL;

drop table if exists BILLING_WARNET;

drop table if exists DIGUNAKAN;

drop table if exists MELAKUKAN;

drop table if exists MEMBER;

drop table if exists OPERATOR;

drop table if exists TRANSAKSI;

/*==============================================================*/
/* Table: BILLING_DETAIL                                        */
/*==============================================================*/
create table BILLING_DETAIL
(
   NO_KOMPUTER          int not null,
   ID_BILLING           int not null,
   JUMLAH_WAKTU         time not null,
   TOTAL_BAYAR          bigint not null,
   PROGRAM_TERLIHAT     varchar(100) not null,
   KECEPATAN_KONEKSI    varchar(100) not null,
   primary key (NO_KOMPUTER)
);

/*==============================================================*/
/* Table: BILLING_WARNET                                        */
/*==============================================================*/
create table BILLING_WARNET
(
   ID_BILLING           int not null,
   ID_OPERATOR          int not null,
   PAKET_BILLING        varchar(100) not null,
   primary key (ID_BILLING)
);

/*==============================================================*/
/* Table: DIGUNAKAN                                             */
/*==============================================================*/
create table DIGUNAKAN
(
   ID_BILLING           int not null,
   ID_MEMBER            int not null,
   primary key (ID_BILLING, ID_MEMBER)
);

/*==============================================================*/
/* Table: MELAKUKAN                                             */
/*==============================================================*/
create table MELAKUKAN
(
   ID_MEMBER            int not null,
   ID_TRANSAKSI         int not null,
   primary key (ID_MEMBER, ID_TRANSAKSI)
);

/*==============================================================*/
/* Table: MEMBER                                                */
/*==============================================================*/
create table MEMBER
(
   ID_MEMBER            int not null,
   NAMA_MEMBER          varchar(100) not null,
   GENDER_MEMBER        bool not null,
   EMAIL_MEMBER         varchar(50) not null,
   primary key (ID_MEMBER)
);

/*==============================================================*/
/* Table: OPERATOR                                              */
/*==============================================================*/
create table OPERATOR
(
   ID_OPERATOR          int not null,
   NAMA_OPERATOR        varchar(100) not null,
   NOHP_OPERATOR        varchar(20) not null,
   GENDER_OPERATOR      bool not null,
   primary key (ID_OPERATOR)
);

/*==============================================================*/
/* Table: TRANSAKSI                                             */
/*==============================================================*/
create table TRANSAKSI
(
   ID_TRANSAKSI         int not null,
   ID_OPERATOR          int not null,
   TANGGAL_TRANSAKSI    datetime not null,
   JUMLAH_NOMINAL       bigint not null,
   JUMLAH_DISKON        bigint not null,
   primary key (ID_TRANSAKSI)
);

alter table BILLING_DETAIL add constraint FK_MEMILIKI foreign key (ID_BILLING)
      references BILLING_WARNET (ID_BILLING) on delete restrict on update restrict;

alter table BILLING_WARNET add constraint FK_MENGELOLA foreign key (ID_OPERATOR)
      references OPERATOR (ID_OPERATOR) on delete restrict on update restrict;

alter table DIGUNAKAN add constraint FK_DIGUNAKAN foreign key (ID_BILLING)
      references BILLING_WARNET (ID_BILLING) on delete restrict on update restrict;

alter table DIGUNAKAN add constraint FK_DIGUNAKAN2 foreign key (ID_MEMBER)
      references MEMBER (ID_MEMBER) on delete restrict on update restrict;

alter table MELAKUKAN add constraint FK_MELAKUKAN foreign key (ID_MEMBER)
      references MEMBER (ID_MEMBER) on delete restrict on update restrict;

alter table MELAKUKAN add constraint FK_MELAKUKAN2 foreign key (ID_TRANSAKSI)
      references TRANSAKSI (ID_TRANSAKSI) on delete restrict on update restrict;

alter table TRANSAKSI add constraint FK_MENDATA foreign key (ID_OPERATOR)
      references OPERATOR (ID_OPERATOR) on delete restrict on update restrict;

