
package Model;


public class NhanVien {
    private String manv;
    private String tensv;
    private String email;
    private String sdt;
    private int gt;
    private String diachi;
    private String hinh;
    

    public NhanVien() {
    }

    public NhanVien(String manv, String tensv, String email, String sdt, int gt, String diachi, String hinh) {
        this.manv = manv;
        this.tensv = tensv;
        this.email = email;
        this.sdt = sdt;
        this.gt = gt;
        this.diachi = diachi;
        this.hinh = hinh;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getGt() {
        return gt;
    }

    public void setGt(int gt) {
        this.gt = gt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }
    

    
}
