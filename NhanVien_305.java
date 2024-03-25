/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buivovankhoa_501230305;
import java.util.*;
/**
 *
 * @author FPTSHOP
 */
public abstract class NhanVien_305 {
    protected String Manhanvien, Tennhanvien, Diachi;
    protected double Hesoluong, LCB = 2000000;
    
    abstract double Hesoluong();

    Scanner kb = new Scanner(System.in);
    public String getManhanvien() {
        return Manhanvien;
    }

    public void setManhanvien(String Manhanvien) {
        this.Manhanvien = Manhanvien;
    }

    public String getTennhanvien() {
        return Tennhanvien;
    }

    public void setTennhanvien(String Tennhanvien) {
        this.Tennhanvien = Tennhanvien;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public double getHesoluong() {
        return Hesoluong;
    }

    public void setHesoluong(double Hesoluong) {
        this.Hesoluong = Hesoluong;
    }

    public double getLCB() {
        return LCB;
    }

    public void setLCB(double LCB) {
        this.LCB = LCB;
    }
    
    protected double ThanhTien(){
        return 0;
    }
    
    protected void Xuat(){
        System.out.print(getManhanvien()+" - "+getTennhanvien()+" - "+getDiachi()+" - "+getHesoluong()+" - ");
    }
}
