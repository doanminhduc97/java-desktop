create database DB_JDAD_Exam01;
go
use DB_JDAD_Exam01;
go
create table TblManufacturer(
	ManuId int identity(1,1),
	ManuName nvarchar(200),
	Address nvarchar(200),
	primary key(ManuId)
);
go
insert into TblManufacturer(ManuName, Address) 
values 
('Công ty Toyota Việt Nam', 'Phúc Yên – Vĩnh Phúc'), 
('Công ty cổ phẩn FPT', 'Cầu Giấy – Hà Nội'), 
('Công ty TNHH Samsung Electronics Việt Nam ', 'Yên Phong – Bắc Ninh');
go
create table TblProduct(
	ProId int identity(1,1),
	MenuId int not null,
	ProName nvarchar(200),
	YearMaking int,
	ExpireDate datetime,
	Price float,
	CONSTRAINT fk_id_Manufacturer
  FOREIGN KEY (MenuId)
  REFERENCES TblManufacturer (ManuId)
);