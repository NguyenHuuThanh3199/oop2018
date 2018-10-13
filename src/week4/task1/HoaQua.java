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
public class HoaQua {
    public final double hamluongCBQchuan=0.1;
    private double hamLuongChatBQ =0;// tren 1kg
    private String maSanPham=null;

    public double getHamLuongChatBQ() {
        return hamLuongChatBQ;
    }

    public void setHamLuongChatBQ(double hamLuongChatBQ) {
        this.hamLuongChatBQ = hamLuongChatBQ;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }
    public boolean yeucauchatbaoquan()
    {
        if(this.hamLuongChatBQ>hamluongCBQchuan) return false;
        return true;
    }
    public int sosanhHamLuongChatBaoQuan(HoaQua other)
    {
        if(this.hamLuongChatBQ>other.hamLuongChatBQ) return 1;
        else if(this.hamLuongChatBQ<other.hamLuongChatBQ)  return -1;
        return 0;
    }
    public void print()
    {
        System.out.println("Hoa qua co ham luong chat bao quan: "+this.hamLuongChatBQ+
                            "\nMa San pham: "+this.maSanPham);
    }
}
