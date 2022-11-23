
package Service;
import Model.User;
import java.sql.*;
import DB_Ketnoi.Connect;
import java.util.ArrayList;
public class User_Service {
    private Connect db=new Connect();
    public ArrayList<User> getUser(){
        ArrayList<User> list = new ArrayList<>();
        try {
            Connection con=db.connect();// mở kết nối mới đến database
            Statement s= con.createStatement();// tạo statement từ  connection
            String query="Select * FROM USERS";
            ResultSet result=s.executeQuery(query);
            while(result.next()){// nếu còn dữ liệu thì trả về true k trả về false
                User u = new User();
                u.setUser(result.getString("username"));// gán username database cho user class
                u.setPass(result.getString("password"));
                u.setRole(result.getString("role"));
                list.add(u);   // add user vào list       
            }
            con.close();// đóng kết nối 
            s.close();
            return list;
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public boolean updatepass(String user,String pass,String passmoi){
        try {
            String sql="UPDATE USERS SET Password=? WHERE USERNAME=? AND PASSWORD=?";
            Connection con=db.connect();
            PreparedStatement ps=con.prepareStatement(sql);
            
           
            ps.setString(1, passmoi);
            ps.setString(2, user);
            ps.setString(3, pass);
           
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
