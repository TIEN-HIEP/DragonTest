/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.sql.*;
import DB_Ketnoi.Connect;
import java.util.ArrayList;
import Model.NhanVien;
import javax.swing.JOptionPane;

public class NhanVien_Serivce {

    private Connect db = new Connect();

    public ArrayList<NhanVien> getNV() {
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            Connection con = db.connect();
            Statement s = con.createStatement();
            String query = "SELECT * FROM dbo.NhanVien";
            ResultSet result = s.executeQuery(query);
            while (result.next()) {
                NhanVien st = new NhanVien();
                st.setManv(result.getString("MaNV"));
                st.setTensv(result.getString("HoTen"));
                st.setEmail(result.getString("Email"));
                st.setSdt(result.getString("SoDT"));
                st.setGt(result.getInt("GioiTinh"));
                st.setDiachi(result.getString("DiaChi"));
                st.setHinh(result.getString("Hinh"));
                list.add(st);
            }
            con.close();// đóng kết nối 
            s.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public int addNV(NhanVien st) {
        try {
            Connection con = db.connect();
            PreparedStatement sttm = null;
            String SQL = "INSERT INTO dbo.NhanVien VALUES(?,?,?,?,?,?,?)";
            sttm = con.prepareStatement(SQL);
            sttm.setString(1, st.getManv());
            sttm.setString(2, st.getTensv());
            sttm.setString(3, st.getEmail());
            sttm.setString(4, st.getSdt());
            sttm.setInt(5, st.getGt());
            sttm.setString(6, st.getDiachi());
            sttm.setString(7, st.getHinh());
            if (sttm.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "thêm thành công");
                return 1;
            }
            con.close();// đóng kết nối 
            sttm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int XoaNV(NhanVien st) {
        try {
            Connection con = db.connect();
            PreparedStatement sttm = null;
            String SQL = "DELETE FROM  dbo.NhanVien WHERE MaNV=?";
            sttm = con.prepareStatement(SQL);
            sttm.setString(1, st.getManv());
            if (sttm.executeUpdate() > 0) {
               
                return 1;
            }
              con.close();// đóng kết nối 
            sttm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int SuaNV(NhanVien st) {
        try {
            Connection con = db.connect();
            PreparedStatement sttm = null;
            String SQL = "UPDATE dbo.NhanVien SET HoTen=?,Email=?,SoDT=?,GioiTinh=?,DiaChi=?,Hinh=? WHERE MaNV=?";
             sttm = con.prepareStatement(SQL);      
            sttm.setString(1, st.getTensv());
            sttm.setString(2, st.getEmail());
            sttm.setString(3, st.getSdt());
            sttm.setInt(4, st.getGt());
            sttm.setString(5, st.getDiachi());
            sttm.setString(6, st.getHinh());
               sttm.setString(7, st.getManv());
            if (sttm.executeUpdate() > 0) {
               
                return 1;
            }
              con.close();// đóng kết nối 
            sttm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

}
