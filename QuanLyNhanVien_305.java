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
public class QuanLyNhanVien_305 {

    ArrayList<NhanVien_305> mang = new ArrayList<>();
    Scanner kb = new Scanner(System.in);

    void Menu() {
        int chon;
        do {
            System.out.println("1. Nhap thong tin nhan vien lap trinh");
            System.out.println("2. Xuat nhan vien lap trinh");
            System.out.println("3. Tinh tong thanh tien cua nhan vien KT co he so luong > 3");
            System.out.println("4. Sap xep nhan vien lap trinh tang dan theo ho ten");
            System.out.println("5. Thoat khoi chuong trinh");
            System.out.println("Moi ban chon: ");
            chon = kb.nextInt();
            kb.nextLine();
            switch (chon) {
                case 1:
                    NhanVien_305 nv = new Nhanvienlaptrinh_305(); // Down - casting
                    Nhapthongtinchung(nv);
                    Nhanvienlaptrinh_305 lt = (Nhanvienlaptrinh_305) nv;
                    lt.Nhap();
                    mang.add(nv);
                    break;
                case 2:
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof Nhanvienlaptrinh_305) {
                            Xuat();
                        }
                    }
                    break;
                case 3:
                    double Tong_TT = 0;
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof Nhanvienlaptrinh_305) {
                            Nhanvienlaptrinh_305 tam = (Nhanvienlaptrinh_305) mang.get(i);
                            if (tam.getLoainhanvien().equalsIgnoreCase("Nhan vien KT") && mang.get(i).Hesoluong > 3) {
                                Tong_TT += tam.ThanhTien();
                            }
                        }
                    }
                    System.out.println("Tong thanh tien cua nhan vien KT co he so luong > 3: " + Tong_TT);
                    break;
                case 4:
                    for (int i = 0; i < mang.size() - 1; i++) {
                        for (int j = i + 1; j < mang.size(); j++) {
                            if (mang.get(i).getTennhanvien().compareToIgnoreCase(mang.get(j).getTennhanvien()) > 0 && (mang.get(i) instanceof Nhanvienlaptrinh_305 && mang.get(j) instanceof Nhanvienlaptrinh_305)) {
                                NhanVien_305 nvlt = new Nhanvienlaptrinh_305();
                                nvlt = mang.get(i);
                                mang.set(i, mang.get(j));
                                mang.set(j, nvlt);
                            }
                        }
                    }
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof Nhanvienlaptrinh_305) {
                            mang.get(i).Xuat();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Cam on ban da su dung chuong trinh!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap sai. Vui long nhap lai..!");
            }

        } while (chon != 5);

    }

    void Nhapthongtinchung(NhanVien_305 nv) {
        boolean flag;
        // Nhập mã nhân viên
        String tam_Manhanvien;
        do {
            flag = false;
            System.out.println("Nhap ma nhan vien: ");
            tam_Manhanvien = kb.nextLine();
            // Kiểm tra trống
            if (tam_Manhanvien.length() == 0) {
                System.out.println("Ma nhan vien khong duoc de trong..!");
                flag = true;
            }
            // Kiểm tra trùng
            for (int i = 0; i < mang.size(); i++) {
                if (mang.get(i).getManhanvien().equalsIgnoreCase(tam_Manhanvien)) {
                    System.out.println("Ma nhan vien khong duoc trung..!");
                    flag = true;
                }
            }
        } while (flag == true);
        nv.setManhanvien(tam_Manhanvien);
        // Nhập tên nhân viên
        String tam_Tennhanvien;
        do {
            flag = false;
            System.out.println("Nhap ten nhan vien: ");
            tam_Tennhanvien = kb.nextLine();
            // Kiểm tra trống
            if (tam_Tennhanvien.length() == 0) {
                System.out.println("Ten nhan vien khong duoc de trong..!");
                flag = true;
            }
        } while (flag == true);
        nv.setTennhanvien(tam_Tennhanvien);

        // Nhập địa chỉ
        String tam_Diachi;
        do {
            flag = false;
            System.out.println("Nhap dia chi: ");
            tam_Diachi = kb.nextLine();
            // Kiểm tra trống
            if (tam_Diachi.length() == 0) {
                System.out.println("Dia chi khong duoc de trong..!");
                flag = true;
            }
        } while (flag == true);
        nv.setDiachi(tam_Diachi);

        // Nhập hệ số lương
        do {
            flag = false;
            try {
                System.out.println("Nhap he so luong: ");
                nv.setHesoluong(kb.nextDouble());
                if (nv.getHesoluong() < 0) {
                    throw new Exception();
                }
            } catch (Exception loi) {
                System.out.println("He so luong phai la so thuc");
                flag = true;
                kb.nextLine();
            }
        } while (flag == true);
    }

    void Xuat() {
        for (int i = 0; i < mang.size(); i++) {
            mang.get(i).Xuat();
        }
    }
}
