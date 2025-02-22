create table if not exists catayst_fatca_account_response(
fatca_id Integer not null,
fatca_owner varchar(255) null,
active_account char null,
fatca_type_id Integer null,
fatca_type varchar(255) null,
fatca_status varchar(255) null,
fatca_description Integer null,
authorizer_count Integer null,
auth_country varchar(255) null,
auth_region_code Integer null,
exceptions varchar(255) null,
status varchar(255) null,
remarks varchar(255) null,
constraint catayst_fatca_account_response_pk primary key(fatca_id));