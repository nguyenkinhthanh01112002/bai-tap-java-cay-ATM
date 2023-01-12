/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atmcodebyjava;

/**
 *
 * @author KINHTHANH
 */
public class TheAtm
{
    private String soTaiKhoan;
    private long soTienKhaDung;
    private ThongTinCaNhan thongTinCaNhan;
    private String maPin;

    public TheAtm(ThongTinCaNhan thongTinCaNhan)
    {
        this.maPin = "1234";
        this.soTaiKhoan = "1031356730";
        this.soTienKhaDung = 10000000;
        this.thongTinCaNhan = thongTinCaNhan;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public long getSoTienKhaDung() {
        return soTienKhaDung;
    }

    public ThongTinCaNhan getThongTinCaNhan() {
        return thongTinCaNhan;
    }
    public String getMaPin()
    {
        return maPin;
    }
    @Override
    public String toString() {
        return thongTinCaNhan+"\n"+"SO DU TAI KHOAN = "+soTienKhaDung;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public void setSoTienKhaDung(long soTienRutVaNhan) {
        this.soTienKhaDung = soTienRutVaNhan;
    }
    public void setMaPin(String maPinMoi)
    {
        this.maPin = maPinMoi;
    }
    
    
}
