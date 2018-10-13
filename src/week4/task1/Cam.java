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
public class Cam extends HoaQua{
   private double giaBan;//dong
   private double sanLuong;//tan

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double getSanLuong() {
        return sanLuong;
    }

    public void setSanLuong(double sanLuong) {
        this.sanLuong = sanLuong;
    }

   public int SoSanhSanLuong(Cam other)
   {
       if(this.sanLuong>other.sanLuong) return 1;
       else if(this.sanLuong<other.sanLuong) return -1;
       return 0;
   }
   public int soSanhGiaBan(Cam other)
   {
       if(this.giaBan>other.giaBan) return 1;
       else if(this.giaBan<other.giaBan) return -1;
       return 0;
   }
   
}
