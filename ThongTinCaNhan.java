/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atmcodebyjava;

/**
 *
 * @author KINHTHANH
 */
public class ThongTinCaNhan 
{
    private String ten;
    private String gioiTinh;
    private String diaChi;

    public ThongTinCaNhan(String ten,String gioiTinh,String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return   ten +"\n"  + gioiTinh + "\n" + diaChi;
    }

    public String getTen() {
        return ten;
    }


    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }
    
    
}
