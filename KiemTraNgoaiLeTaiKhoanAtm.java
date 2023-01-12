/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atmcodebyjava;

/**
 *
 * @author KINHTHANH
 */
public class KiemTraNgoaiLeTaiKhoanAtm {
    public static void kiemTraSoTaiKhoan(String soTaiKhoan) throws NgoaiLeTaiKhoanAtm
    {
        String soTaiKhoanHopLe = "^[0-9]{10}$";
        boolean check = soTaiKhoan.matches(soTaiKhoanHopLe);
        if(check==false)
        {
            throw new NgoaiLeTaiKhoanAtm("so tai khoan ban vua nhap khong hop le");
        }
    }
}
