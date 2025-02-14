create table if not exists catayst_fatca_account(
record_key Integer not null,
catayst_fatca_code Integer null,
catayst_fatca_code_position varchar(255) null,
catayst_fatca_code_length varchar(255) null,
fatca_digits_position varchar(255) null,
fatca_digits_length varchar(255) null,
with_holding_tax_position char null,
with_holding_tax_lengtn varchar(255) null,
required_tax_position varchar(255) null,
required_tax_length varchar(255) null,
fundraising_id_length varchar(255) null,
fundraising_space varchar(255) null,
pulse_space_name varchar(255) null,
future_market varchar(255) null,
constraint catayst_fatca_account_pk primary key(record_key));