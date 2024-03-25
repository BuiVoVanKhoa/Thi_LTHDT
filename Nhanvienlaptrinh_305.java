/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buivovankhoa_501230305;

/**
 *
 * @author FPTSHOP
 */
public class Nhanvienlaptrinh_305 extends NhanVien_305 {

    private String Loainhanvien;

    public String getLoainhanvien() {
        return Loainhanvien;
    }

    public void setLoainhanvien(String Loainhanvien) {
        this.Loainhanvien = Loainhanvien;
    }
    private double overtime, bonus;

    public double Hesoluong() {
        return Hesoluong;
    }

    protected void Nhap() {
        boolean flag;
        do {
            flag = false;
            System.out.println("Nhap loai nhan vien");
            System.out.println("1. Nhan vien LT");
            System.out.println("2. Nhan vien KT");
            System.out.println("Moi ban nhap loai nhan vien: ");
            int chon = kb.nextInt();
            switch (chon) {
                case 1:
                    Loainhanvien = "Nhan vien LT";
                    System.out.println("Nhap tien lam ngoai gio: ");
                    overtime = kb.nextDouble();
                    break;
                case 2:
                    Loainhanvien = "Nhan vien KT";
                    System.out.println("Nhap tien thuong them: ");
                    bonus = kb.nextDouble();
                    break;
                default:
                    System.out.println("Nhap sai. Vui long nhap lai..!");
                    flag = true;
            }
        } while (flag == true);

    }

    protected double ThanhTien() {
        if (Loainhanvien.equalsIgnoreCase("Nhan vien LT")) {
            return (LCB * Hesoluong) + overtime;
        } else {
            return (LCB * Hesoluong) + bonus;
        }
    }

    protected void Xuat() {
        super.Xuat();
        System.out.println(Loainhanvien + " - " + ThanhTien());
    }
}
