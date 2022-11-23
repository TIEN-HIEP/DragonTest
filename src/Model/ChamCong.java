
package Model;

public class ChamCong {
    private String manv;
    private String tennv;
    private int socong;
    private int nghiphep;
    private int khongphep;
    private float luong;

    public ChamCong() {
    }

    public ChamCong(String manv, String tennv, int socong, int nghiphep, int khongphep, float luong) {
        this.manv = manv;
        this.tennv = tennv;
        this.socong = socong;
        this.nghiphep = nghiphep;
        this.khongphep = khongphep;
        this.luong = luong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public int getSocong() {
        return socong;
    }

    public void setSocong(int socong) {
        this.socong = socong;
    }

    public int getNghiphep() {
        return nghiphep;
    }

    public void setNghiphep(int nghiphep) {
        this.nghiphep = nghiphep;
    }

    public int getKhongphep() {
        return khongphep;
    }

    public void setKhongphep(int khongphep) {
        this.khongphep = khongphep;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    
    

 
    
}
