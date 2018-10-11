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
public class Tao extends HoaQua{
    private boolean kichThuoc;//true neu dat tieu chuan, false neu khong dat.
    private String xuatXu;

    public boolean getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(boolean kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }
    public String Sosanhxuaxu(Tao other)
    {
        if(this.xuatXu.equals(other.xuatXu)) return "Same";
        return "Not Same";
    }
    @Override
    public void print()
    {
        System.out.println("xuat xu:"+this.xuatXu);
        if(this.kichThuoc==true) 
            System.out.println("Dat tieu chuen ve kich thuoc");
        else 
            System.out.println("Chua dat tieu chuan kich thuoc");
    }
}
