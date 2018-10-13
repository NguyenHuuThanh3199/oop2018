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
public class Main {
    public static void main(String [] argv )
    {
        System.out.println("===========Test HOa Qua===========");
        HoaQua Hoaqua=new HoaQua();
        Hoaqua.setHamLuongChatBQ(0.05);
        HoaQua Hoaqua1=new HoaQua();
        Hoaqua1.setHamLuongChatBQ(0.5);
        System.out.println("So sanh ham luong chat bao quan: "+Hoaqua.sosanhHamLuongChatBaoQuan(Hoaqua1));
        Hoaqua.print();
        
        
        
        
        System.out.println("============Test Cam=============");
        Cam cam=new Cam();
        cam.setGiaBan(50000);
        cam.setSanLuong(10);
        Cam cam1=new Cam();
        cam1.setGiaBan(30000);
        cam1.setSanLuong(20);
        cam1.SoSanhSanLuong(cam);
        cam1.soSanhGiaBan(cam);
        
        
        System.out.println("===========Test Tao==============");
        Tao tao =new Tao();
        
        
        System.out.println("===========Test Cam Thanh Phong============");
        CamThanhPhong camthanhphong=new CamThanhPhong();
        
        
        System.out.println("===========Test Cam Sanh===========");
        CamSanh camsanh =new CamSanh();
        
        
    }
}
