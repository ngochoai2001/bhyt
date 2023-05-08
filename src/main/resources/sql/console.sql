INSERT INTO bhyt.health_insurance_card
(code, date_end, date_start, district, dob, gender, id_card_num, name, phone, province)
VALUES ('012034034', '2023-05-04', '2022-05-04', 'Quận Thanh Xuân', '23-05-2001',
        'Nữ', '001430120', 'Trần Thị Ngọc Hoài', '0868478340', 'Thành phố Hà Nội');
INSERT INTO bhyt.health_insurance_card
(code, date_end, date_start, district, dob, gender, id_card_num, name, phone, province)
VALUES ('012034023', '2023-05-04', '2021-05-04', 'Quận Thanh Xuân', '04-08-2001',
        'Nữ', '0014303120', 'Phạm Hà Anh', '0868478340', 'Thành phố Hà Nội');
INSERT INTO bhyt.health_insurance_card
(code, date_end, date_start, district, dob, gender, id_card_num, name, phone, province)
VALUES ('01234023', '2023-05-04', '2021-05-04', 'Quận Thanh Xuân', '13-04-2001',
        'Nữ', '0013403120', 'Bùi Thị Thùy Dương', '0868478340', 'Thành phố Hà Nội');
INSERT INTO bhyt.health_insurance_card
(code, date_end, date_start, district, dob, gender, id_card_num, name, phone, province)
VALUES ('0120323', '2023-05-04', '2021-05-04', 'Quận Thanh Xuân', '25-01-2001',
        'Nam', '0026303120', 'Trần Anh Minh', '0868478340', 'Thành phố Hà Nội');
INSERT INTO bhyt.health_insurance_card
(code, date_end, date_start, district, dob, gender, id_card_num, name, phone, province)
VALUES ('01203223', '2023-05-04', '2021-05-04', 'Quận Thanh Xuân', '11-01-2001',
        'Nam', '00163120', 'Hoàng Việt Vương', '0868478340', 'Thành phố Hà Nội');
INSERT INTO `bhyt`.`health_insurance_card` (`code`, `date_end`, `date_start`, `district`, `dob`, `gender`, `id_card_num`, `name`, `phone`, `province`) VALUES ( '111111', '2023-02-02', '2001-02-02', 'Quận Ba Đình', '1998-2-2', 'Nam', '0123456789', 'Linh1', '0333682546', 'Thành phố Hà Nội');
INSERT INTO `bhyt`.`health_insurance_card` ( `code`, `date_end`, `date_start`, `district`, `dob`, `gender`, `id_card_num`, `name`, `phone`, `province`) VALUES ( '222222', '2023-02-02', '2001-02-02', 'Quận Ba Đình', '1998-2-2', 'Nam', '0123456789', 'Linh2', '0333682546', 'Thành phố Hà Nội');
INSERT INTO `bhyt`.`health_insurance_card` ( `code`, `date_end`, `date_start`, `district`, `dob`, `gender`, `id_card_num`, `name`, `phone`, `province`) VALUES ( '333333', '2023-02-02', '2001-02-02', 'Quận Ba Đình', '1998-2-2', 'Nam', '0123456789', 'Linh3', '0333682546', 'Thành phố Hà Nội');
INSERT INTO `bhyt`.`health_insurance_card` ( `code`, `date_end`, `date_start`, `district`, `dob`, `gender`, `id_card_num`, `name`, `phone`, `province`) VALUES ( '444444', '2023-02-02', '2001-02-02', 'Quận Ba Đình', '1998-2-2', 'Nam', '0123456789', 'Linh4', '0333682546', 'Thành phố Hà Nội');
INSERT INTO `bhyt`.`health_insurance_card` ( `code`, `date_end`, `date_start`, `district`, `dob`, `gender`, `id_card_num`, `name`, `phone`, `province`) VALUES ( '555555', '2023-02-02', '2001-02-02', 'Quận Ba Đình', '1998-2-2', 'Nam', '0123456789', 'Linh5', '0333682546', 'Thành phố Hà Nội');

INSERT INTO `bhyt`.`health_insurance_card` ( `code`, `date_end`, `date_start`, `district`, `dob`, `gender`, `id_card_num`, `name`, `phone`, `province`) VALUES ( '666666', '2022-02-02', '2002-02-02', 'Thành phố Hà Giang', '1998-2-2', 'Nam', '0123456789', 'Linh6', '0333682546', 'Tỉnh Hà Giang');
INSERT INTO `bhyt`.`health_insurance_card` ( `code`, `date_end`, `date_start`, `district`, `dob`, `gender`, `id_card_num`, `name`, `phone`, `province`) VALUES ('777777', '2022-02-02', '2002-02-02', 'Thành phố Hà Giang', '1998-2-2', 'Nam', '0123456789', 'Linh7', '0333682546', 'Tỉnh Hà Giang');
INSERT INTO `bhyt`.`health_insurance_card` ( `code`, `date_end`, `date_start`, `district`, `dob`, `gender`, `id_card_num`, `name`, `phone`, `province`) VALUES ( '888888', '2022-02-02', '2002-02-02', 'Thành phố Hà Giang', '1998-2-2', 'Nam', '0123456789', 'Linh8', '0333682546', 'Tỉnh Hà Giang');
INSERT INTO `bhyt`.`health_insurance_card` ( `code`, `date_end`, `date_start`, `district`, `dob`, `gender`, `id_card_num`, `name`, `phone`, `province`) VALUES ( '999999', '2022-02-02', '2002-02-02', 'Thành phố Hà Giang', '1998-2-2', 'Nam', '0123456789', 'Linh9', '0333682546', 'Tỉnh Hà Giang');
--

INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '1500000', '800000', '2000-4-2', 'MONTH', 'VISA', 'DONE', '200000', '2000-6-2', '1');
INSERT INTO `bhyt`.`health_insurance_bill` ( `base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '1500000', '800000', '2000-7-2', 'MONTH', 'VISA', 'DONE', '200000', '2000-9-2', '1');
INSERT INTO `bhyt`.`health_insurance_bill` ( `base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '1500000', '800000', '2000-10-2', 'MONTH', 'VISA', 'DONE', '200000', '2000-12-2', '1');
INSERT INTO `bhyt`.`health_insurance_bill` ( `base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '1500000', '800000', '2000-1-2', 'MONTH', 'VISA', 'DONE', '200000', '2001-3-2', '1');

INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '1500000', '800000', '2003-4-2', 'MONTH', 'VISA', 'DONE', '200000', '2003-6-2', '4');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '1500000', '800000', '2003-7-2', 'MONTH', 'VISA', 'DONE', '200000', '2003-9-2', '4');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '1500000', '800000', '2003-1-2', 'MONTH', 'VISA', 'DONE', '200000', '2003-3-2', '4');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '1500000', '800000', '2003-10-2', 'MONTH', 'VISA', 'DONE', '200000', '2004-12-2', '4');

INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '1500000', '800000', '2020-4-2', 'MONTH', 'VISA', 'DONE', '200000', '2020-6-2', '3');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ('1500000', '800000', '2020-7-2', 'MONTH', 'VISA', 'DONE', '200000', '2020-9-2', '3');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '1500000', '800000', '2020-1-2', 'MONTH', 'VISA', 'DONE', '200000', '2020-3-2', '3');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '1500000', '800000', '2020-10-2', 'MONTH', 'VISA', 'DONE', '200000', '2001-12-2', '3');



INSERT INTO `bhyt`.`health_insurance_card` ( `code`, `date_end`, `date_start`, `district`, `dob`, `gender`, `id_card_num`, `name`, `phone`, `province`) VALUES ( '100000', '2022-02-02', '2002-02-02', 'Quận Ba Đình', '1998-2-2', 'Nam', '0123456789', 'Linh10', '0333682546', 'Tỉnh Hà Giang');

INSERT INTO `bhyt`.`health_insurance_card` ( `code`, `date_end`, `date_start`, `district`, `dob`, `gender`, `id_card_num`, `name`, `phone`, `province`) VALUES ( '110000', '2021-02-02', '2003-02-02', 'Quận Hoàn Kiếm', '1998-2-2', 'Nam', '0123456789', 'Linh11', '0333682546', 'Thành phố Hà Nội');
INSERT INTO `bhyt`.`health_insurance_card` ( `code`, `date_end`, `date_start`, `district`, `dob`, `gender`, `id_card_num`, `name`, `phone`, `province`) VALUES ( '120000', '2021-02-02', '2003-02-02', 'Quận Hoàn Kiếm', '1998-2-2', 'Nam', '0123456789', 'Linh12', '0333682546', 'Thành phố Hà Nội');
INSERT INTO `bhyt`.`health_insurance_card` ( `code`, `date_end`, `date_start`, `district`, `dob`, `gender`, `id_card_num`, `name`, `phone`, `province`) VALUES ( '130000', '2021-02-02', '2003-02-02', 'Quận Hoàn Kiếm', '1998-2-2', 'Nam', '0123456789', 'Linh13', '0333682546', 'Thành phố Hà Nội');
INSERT INTO `bhyt`.`health_insurance_card` ( `code`, `date_end`, `date_start`, `district`, `dob`, `gender`, `id_card_num`, `name`, `phone`, `province`) VALUES ('140000', '2021-02-02', '2003-02-02', 'Quận Hoàn Kiếm', '1998-2-2', 'Nam', '0123456789', 'Linh14', '0333682546', 'Thành phố Hà Nội');
INSERT INTO `bhyt`.`health_insurance_card` ( `code`, `date_end`, `date_start`, `district`, `dob`, `gender`, `id_card_num`, `name`, `phone`, `province`) VALUES ('150000', '2021-02-02', '2003-02-02', 'Quận Hoàn Kiếm', '1998-2-2', 'Nam', '0123456789', 'Linh15', '0333682546', 'Thành phố Hà Nội');

INSERT INTO `bhyt`.`health_insurance_card` ( `code`, `date_end`, `date_start`, `district`, `dob`, `gender`, `id_card_num`, `name`, `phone`, `province`) VALUES ( '160000', '2020-02-02', '2004-02-02', 'Thành phố Hà Giang', '1998-2-2', 'Nam', '0123456789', 'Linh16', '0333682546', 'Tỉnh Hà Giang');
INSERT INTO `bhyt`.`health_insurance_card` ( `code`, `date_end`, `date_start`, `district`, `dob`, `gender`, `id_card_num`, `name`, `phone`, `province`) VALUES ( '170000', '2020-02-02', '2004-02-02', 'Thành phố Hà Giang', '1998-2-2', 'Nam', '0123456789', 'Linh17', '0333682546', 'Tỉnh Hà Giang');
INSERT INTO `bhyt`.`health_insurance_card` ( `code`, `date_end`, `date_start`, `district`, `dob`, `gender`, `id_card_num`, `name`, `phone`, `province`) VALUES ( '180000', '2020-02-02', '2004-02-02', 'Thành phố Hà Giang', '1998-2-2', 'Nam', '0123456789', 'Linh18', '0333682546', 'Tỉnh Hà Giang');


INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '1000000', '45000', '2023-4-1', 'MONTH', 'MASTERCARD', 'PROCESSING', '0', '2023-5-1', '5');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '1000000', '45000', '2023-3-1', 'MONTH', 'CASH', 'DONE', '0', '2023-4-1', '5');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '1000000', '45000', '2023-3-1', 'MONTH', 'CASH', 'DONE', '0', '2023-4-1', '6');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '1000000', '45000', '2023-4-1', 'MONTH', 'MASTERCARD', 'NONE', '0', '2023-5-1', '6');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '1000000', '45000', '2023-5-1', 'MONTH', 'MASTERCARD', 'PROCESSING', '0', '2023-6-1', '5');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '1000000', '45000', '2023-5-1', 'MONTH', 'MASTERCARD', 'NONE', '0', '2023-6-1', '6');


INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '1000000', '45000', '2023-3-1', 'MONTH', 'MASTERCARD', 'NONE', '0', '2023-3-31', '3');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '1000000', '45000', '2023-3-1', 'MONTH', 'MASTERCARD', 'NONE', '0', '2023-3-31', '4');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '30000000', '450000', '1992-1-1', 'MONTH', 'MASTERCARD', 'NONE', '0', '1992-1-31', '21');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '20000000', '300000', '1992-1-1', 'MONTH', 'MASTERCARD', 'NONE', '0', '1992-1-31', '22');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '10000000', '150000', '1992-1-1', 'MONTH', 'MASTERCARD', 'NONE', '0', '1992-1-31', '23');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '30000000', '450000', '1992-1-1', 'MONTH', 'MASTERCARD', 'DONE', '0', '1992-1-31', '21');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '20000000', '300000', '1992-1-1', 'MONTH', 'MASTERCARD', 'DONE', '0', '1992-1-31', '22');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '10000000', '150000', '1992-1-1', 'MONTH', 'MASTERCARD', 'DONE', '0', '1992-1-31', '23');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '30000000', '450000', '2020-12-1', 'MONTH', 'MASTERCARD', 'DONE', '0', '2020-12-1', '21');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '20000000', '300000', '2020-12-1', 'MONTH', 'MASTERCARD', 'DONE', '0', '2020-12-1', '22');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '10000000', '150000', '2020-12-1', 'MONTH', 'MASTERCARD', 'DONE', '0', '2020-12-1', '23');

INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '30000000', '450000', '2020-12-1', 'MONTH', 'MASTERCARD', 'PROCESSING', '0', '2020-12-1', '21');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '20000000', '300000', '2020-12-1', 'MONTH', 'MASTERCARD', 'PROCESSING', '0', '2020-12-1', '22');
INSERT INTO `bhyt`.`health_insurance_bill` (`base_salary`, `fee`, `from_date`, `insurance_type`, `payment_method`, `payment_status`, `pension_salary`, `to_date`, `insurance_card_id`) VALUES ( '10000000', '150000', '2020-12-1', 'MONTH', 'MASTERCARD', 'PROCESSING', '0', '2020-12-1', '23');


 
