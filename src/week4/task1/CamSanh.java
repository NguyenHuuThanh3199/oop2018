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
public class CamSanh extends Cam{
    private boolean an;
    private boolean ban;

    public boolean isAn() {
        return an;
    }

    public void setAn(boolean an) {
        this.an = an;
    }

    public boolean isBan() {
        return ban;
    }

    public void setBan(boolean ban) {
        this.ban = ban;
    }
    public String mucDichSudung()
    {
        if(this.an==true&&this.ban==true) return "An va Ban";
        else if(this.an==true&&this.ban==false) return "chi an khong ban";
        else if(this.an==false && this.ban==true) return "chi ban khong an";
        else return "khong the su dung";
    }
}
