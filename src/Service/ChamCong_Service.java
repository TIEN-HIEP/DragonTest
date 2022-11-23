package Service;

import java.sql.*;
import DB_Ketnoi.Connect;
import java.util.ArrayList;
import Model.ChamCong;
import javax.swing.JOptionPane;

public class ChamCong_Service {

    private Connect db = new Connect();

    public ArrayList<ChamCong> getGrade() {
        ArrayList<ChamCong> list = new ArrayList<>();
        try {
            Connection con = db.connect();
            Statement s = con.createStatement();
            String query = "SELECT ChamCong.MaNV,HoTen,SoCong,NghiPhep, KhongPhep,tien FROM dbo.NhanVien JOIN dbo.ChamCong ON ChamCong.MaNV = NhanVien.MaNV";
            ResultSet result = s.executeQuery(query);
            while (result.next()) {
                ChamCong gr = new ChamCong();
                gr.setManv(result.getString("MaNV"));
                gr.setTennv(result.getString("HoTen"));
                gr.setSocong(result.getInt("SoCong"));
                gr.setNghiphep(result.getInt("NghiPhep"));
                gr.setKhongphep(result.getInt("KhongPhep"));
                gr.setLuong(result.getFloat("tien"));
                list.add(gr);
            }
            con.close();// đóng kết nối 
            s.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public int addGrade(ChamCong gr) {
        try {
            Connection con = db.connect();
            PreparedStatement sttm = null;
            String SQL = "INSERT INTO dbo.ChamCong(MaNV,SoCong,NghiPhep,KhongPhep,tien)VALUES(?,?,?,?,?)";
            sttm = con.prepareStatement(SQL);

            sttm.setString(1, gr.getManv());
            sttm.setInt(2, gr.getSocong());
            sttm.setInt(3, gr.getNghiphep());
            sttm.setInt(4, gr.getKhongphep());
            sttm.setFloat(5, gr.getLuong());


            int kq = sttm.executeUpdate();
            if (kq == 1) {
                JOptionPane.showMessageDialog(null, "theem thanh cong");
            }
            con.close();// đóng kết nối 
            sttm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int deleteGrade(ChamCong gr) {
        try {
            Connection con = db.connect();
            PreparedStatement sttm = null;
            String SQL = "DELETE FROM  dbo.ChamCong WHERE MaNV=?";
            sttm = con.prepareStatement(SQL);
            sttm.setString(1, gr.getManv());
            int kq = sttm.executeUpdate();
            if (kq == 1) {
                JOptionPane.showMessageDialog(null, "xoa thanh cong");
            }
            con.close();// đóng kết nối 
            sttm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int UpadateGrade(ChamCong gr) {
        try {
            Connection con = db.connect();
            PreparedStatement sttm = null;
            String SQL = "UPDATE dbo.ChamCong SET SoCong=?,nghiPhep=?,KhongPhep=?,tien=? WHERE MaNV=?;";
            sttm = con.prepareStatement(SQL);
            sttm.setInt(1, gr.getSocong());
            sttm.setInt(2, gr.getNghiphep());
            sttm.setInt(3, gr.getKhongphep());
            sttm.setFloat(4, gr.getLuong());
            sttm.setString(5, gr.getManv());
            int kq = sttm.executeUpdate();
            if (kq == 1) {
                JOptionPane.showMessageDialog(null, "update thanh cong");
            }
            con.close();// đóng kết nối 
            sttm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
