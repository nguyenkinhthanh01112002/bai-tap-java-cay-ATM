/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atmcodebyjava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author KINHTHANH
 */
public class CacChucNangAtm 
{
    Scanner sc = new Scanner(System.in);
    private ArrayList<TheAtm> theAtm;
    public CacChucNangAtm()
    {
        this.theAtm = new ArrayList<TheAtm>();
    }
    public void themVaoDanhMucThe(TheAtm theAtm)
    {
        this.theAtm.add(theAtm);
    }
    public String saoKeTaiKhoan()
    {
        return this.theAtm.get(0).toString();
    }
    public void rutTien(long soTienCanRut)
    {
        if(soTienCanRut%1000==0&&(this.theAtm.get(0).getSoTienKhaDung()>0))
        {
            if(soTienCanRut<=this.theAtm.get(0).getSoTienKhaDung())
            {
               long tienCon = this.theAtm.get(0).getSoTienKhaDung()-soTienCanRut;
                this.theAtm.get(0).setSoTienKhaDung(tienCon);
                System.out.println("so du kha dung cua quy khach sau khi thuc hien giao dich : "+this.theAtm.get(0).getSoTienKhaDung());
            }
            else
            {
                System.out.println("tai khoan cua quy khach khong du de thuc hien giao dich nay");
            }
        }
       else
        {
            System.out.println("menh gia vua nhap ngan hang chung toi khong the giao dich");
        }
    }
    public void chuyenTien(long soTienCanChuyen)
    {
        if(soTienCanChuyen%1000==0&&(this.theAtm.get(0).getSoTienKhaDung()>0))
        {
            if(soTienCanChuyen<=this.theAtm.get(0).getSoTienKhaDung())
            {
                long tienCon = this.theAtm.get(0).getSoTienKhaDung()-soTienCanChuyen;
                this.theAtm.get(0).setSoTienKhaDung(tienCon);
                System.out.println(".....quy khach da thuc hien thanh cong giao dich......");
                System.out.println("so du kha dung cua tai khoan sau khi thuc hien giao dich : "+this.theAtm.get(0).getSoTienKhaDung());
            }
        }
        else
        {
            System.out.println("menh gia vua nhap ngan hang chung toi khong the giao dich");
        }
    }
    public void nopTien(long soTienCanNop)
    {
        if(soTienCanNop>0&&soTienCanNop%1000==0)
        {
            long tienThemVao = soTienCanNop+this.theAtm.get(0).getSoTienKhaDung();
            this.theAtm.get(0).setSoTienKhaDung(tienThemVao);
            System.out.println("chuc mung quy khach da nop thanh cong so tien: "+soTienCanNop);
        }
        else
        {
            System.out.println("quy khach vui long kiem tra lai thong tin da nhap");
            System.out.println("ngan hang chung toi khong the the hien giao dich voi menh gia da nhap");
        }
    }
    public void doiMaPin(String maPinMoi)
    {
        this.theAtm.get(0).setMaPin(maPinMoi);
        System.out.println(".....chuc mung ban da doi ma pin thanh cong.....");
    }
    public void guiTietKiem(long soTienGui)
    {
        boolean check ;
        if(soTienGui>0&&soTienGui%1000==0)
        {
            if(soTienGui<=this.theAtm.get(0).getSoTienKhaDung())
            {
                long soTienCon = this.theAtm.get(0).getSoTienKhaDung()-soTienGui;
                this.theAtm.get(0).setSoTienKhaDung(soTienCon);
                do
                {
                    check = true;
                    System.out.print("nhap vao so thang ban muon gui: ");
                    try{
                        int thang = Integer.parseInt(sc.nextLine());
                        double tongTien = soTienGui*(Math.pow(1+(double)19/200,(double)thang));
                        System.out.println("so tien ban se co sau "+thang+" thang = "+(tongTien));
                    }
                   catch(NumberFormatException e)
                   {
                       check = false;
                       System.out.println("so thang ban nhap khong hop le");
                   }
                }
                while(check==false);
            }
        }
    }
    
}
