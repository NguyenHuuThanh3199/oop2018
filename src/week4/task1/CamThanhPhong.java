/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task1;

/**
 *
 * @author Huu Thanh
 */
public class CamThanhPhong extends Cam{
    private boolean trongnuoc;
    private boolean xuatkhau;
    
    public boolean isTrongnuoc() {
        return trongnuoc;
    }

    public void setTrongnuoc(boolean trongnuoc) {
        this.trongnuoc = trongnuoc;
    }

    public boolean isXuatkhau() {
        return xuatkhau;
    }

    public void setXuatkhau(boolean xuatkhau) {
        this.xuatkhau = xuatkhau;
    }
    public String khuVucThuongMai()
    {
        if(this.trongnuoc==true&&this.xuatkhau==true) return "Trong nuoc Va quoc te";
        else if(this.trongnuoc==true&&this.xuatkhau==false) return "Chi trong nuoc, khong xuat khau";
        else if(this.trongnuoc==false &&this.xuatkhau==true) return "chi xuat khau, khong co trong nuoc";
        return "khong co gia tri thuong mai";
    }
}
