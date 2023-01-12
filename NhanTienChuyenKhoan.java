/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atmcodebyjava;

/**
 *
 * @author KINHTHANH
 */
public class NhanTienChuyenKhoan {
    private String soTaiKhoan;
    private ThongTinCaNhan thongTinCaNhan;
  
    public NhanTienChuyenKhoan(ThongTinCaNhan thongTinCaNhan) {
        this.soTaiKhoan = "2064529680";
        this.thongTinCaNhan = thongTinCaNhan;
    }

    @Override
    public String toString() {
        return    "........THONG TIN NGUOI NHAN TIEN......"+ "\n" + thongTinCaNhan;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    
    
    
    
    
}
