CREATE DATABASE DRAGON_BALLS_PROJECT;
USE DRAGON_BALLS_PROJECT;
GO
DROP DATABASE DRAGON_BALLS_PROJECT
-- Tạo bảng

CREATE TABLE USERS(
username varchar(50) primary key,
password varchar(50),
role varchar(20)
)

CREATE TABLE NhanVien(
MaNV varchar(50) PRIMARY KEY,
HoTen NVARCHAR(50),
Email NVARCHAR(50),
SoDT VARCHAR(15),
GioiTinh BIT,
DiaChi NVARCHAR(100),
Hinh NVARCHAR(50)
);

CREATE TABLE ChamCong(
ID INT IDENTITY(1,1) PRIMARY KEY,
MaNV varchar(50), 
SoCong int, --số công
NghiPhep int,  --số ngày phép
KhongPhep int, --số ngày không phép 
tien float, -- tiền lương
FOREIGN KEY (MaNV) REFERENCES dbo.NhanVien(MaNV),
check (tien>0)
)

INSERT INTO USERS
values ('ADMIN1','123','nhanvien'),
('ADMIN2','123','chamcong')
SELECT * FROM dbo.USERS
INSERT INTO NhanVien(MaNV,HoTen,GioiTinh,SoDT,DiaChi,Email,Hinh)
values
('PH28948',N'Nguyễn Việt Toàn',0,'082412412',N'Hải Dương - Việt Nam','toannvph28948@fpt.edu.vn','User.jpg'),
('PH28985',N'Đinh Thị Quỳnh Nga',1,'0234567891',N'Ninh Bình -Việt Nam','ngadtqph28985@fpt.edu.vn','User.jpg'),
('PH28986',N'Trịnh Thị Thủy',1,'0213456789',N'Thanh Hóa - Tiểu Vương Quốc','thuyttph28986@fpt.edu.vn','User.jpg'),
('PH28990',N'Nguyễn Thị Phương Anh',1,'0348055118',N'Số 36 , Dư Dụ ,Thanh Thùy , Thanh Oai , Hà Nội','anhnptph28990@fpt.edu.vn','phanh.jpg'),
('PH28993',N'Nguyễn Tiến Vinh',0,'023456723',N'Thanh Cao - Thanh Oai - Hà Nội','vinhntph28993@fpt.edu.vn','Uer.jpg'),
('PH29011',N'Nguyễn Tùng Dương',0,'0988353709',N'Số 18 - Ngõ 406 - Xuân Phương - Nam Từ Liêm','duongntph29011@fpt.edu.vn','duong.jpg'),
('PH29035',N'Phạm Quang Anh',0,'0897654321',N'Ninh Bình - Việt Nam','anhpqph29035@fpt.edu.vn','quanh.jpg'),
('PH29085',N'Hoàng Văn Cam',0,'032213132',N'Mỹ Đức - Hà Nội','camhvph29085@fpt.edu.vn','cam.png'),
('PH29126',N'Vương Thị Thúy Hiền',1,'0123456789',N'Đông Anh - Hà Nội','hienvttph29126@fpt.edu.vn','hien.jpg'),
('PH29450',N'Nguyễn Tiến Hiệp',0,'0868998237',N'Thanh Trì - Hà Nội','hiepntph29450@fpt.edu.vn','hiep.png')


INSERT INTO chamcong
values
('PH28948',28,0,2,10000000),
('PH28985',27,2,1,12000000),
('PH28986',29,0,1,11000000),
('PH28990',25,4,1,13000000),
('PH28993',27,2,1,12000000),
('PH29011',26,3,1,15000000),
('PH29035',29,0,1,11000000),
('PH29085',28,1,1,12000000),
('PH29126',26,2,2,14000000),
('PH29450',27,1,2,10000000)

SELECT * FROM dbo.USERS
SELECT * FROM dbo.NhanVien 

SELECT ChamCong.MaNV,HoTen,SoCong,NghiPhep, KhongPhep,tien FROM dbo.NhanVien JOIN dbo.ChamCong ON ChamCong.MaNV = NhanVien.MaNV
UPDATE dbo.ChamCong SET SoCong=29,nghiPhep=0,KhongPhep=2,tien=10000000 WHERE MaNV='PH28948';
SELECT * FROM dbo.ChamCong