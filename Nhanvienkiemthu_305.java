/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buivovankhoa_501230305;

/**
 *
 * @author FPTSHOP
 */
public class Nhanvienkiemthu_305 extends NhanVien_305 {

    private double phucap;

    public double Hesoluong() {
        return Hesoluong;
    }

    protected void Nhap() {
        System.out.println("Nhap tien phu cap: ");
        phucap = kb.nextDouble();
    }

    protected double ThanhTien() {
        return (LCB * Hesoluong) + phucap;
    }

    protected void Xuat() {
        System.out.println(ThanhTien());
    }
}
