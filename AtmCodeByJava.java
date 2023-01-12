/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atmcodebyjava;

import java.util.Scanner;

/**
 *
 * @author KINHTHANH
 */
public class AtmCodeByJava {

    public static void main(String[] args) 
    {
        //tao lop nhap tu ban phim
        Scanner sc = new Scanner(System.in);
        //tao doi tuong cua lop ThongTinCaNhan cua the
        ThongTinCaNhan thongTinCaNhan1 = new ThongTinCaNhan("NGUYEN KINH THANH","Nam","to 5 thon Tu Son xa Binh Trung huyen Thang Binh tinh Quang Nam");
        //tao doi tuong theAtm cua lop TheAtm
        TheAtm theAtm = new TheAtm(thongTinCaNhan1);
        //tao doi tuong cacChucNangAtm cua lop CacChucNangAtm de quan li cac chuc nang cua the
        CacChucNangAtm cacChucNangAtm = new CacChucNangAtm();
        //chuc nang them doi tuong the can quan li vao CacChucNangAtm de tien hanh thuc hien cac tinh nang cua the
        cacChucNangAtm.themVaoDanhMucThe(theAtm);
        //nhan tien chuyen khoan
        //tao tai khoan nhan tien chuyen khoan
        ThongTinCaNhan thongTinCaNhan2 = new ThongTinCaNhan("NGUYEN KINH DO","Nam","to 5 thon Tu Son xa Binh Trung huyen Thang Binh tinh Quang Nam");
        NhanTienChuyenKhoan nhanTienChuyenKhoan = new NhanTienChuyenKhoan(thongTinCaNhan2);
        boolean check;
        do
        {
            check = true;
            System.out.print("vui long nhap ma pin cua ban: ");
            try{
                 String maPin = sc.nextLine();
                  KiemTraNgoaiLeMaPin kiemTra = new KiemTraNgoaiLeMaPin();
                  kiemTra.kiemTra(maPin);
                  if(theAtm.getMaPin().equals(maPin)==true)
                  {
                      System.out.println("............CHAO MUNG BAN DEN VOI NGAN HANG JAVABANK..........");
                  }
            }
            catch(NgoaiLeMaPin e){
                check = false;
                System.out.println(""+e.getMessage());
            }
            
        }
        while(check==false);
        while(true)
        {
            System.out.println("1.Van tin tai khoan");
            System.out.println("2.Nop tien vao tai khoan");
            System.out.println("3.Chuyen tien");
            System.out.println("4.Rut tien");
            System.out.println("5.Doi ma pin");
            System.out.println("6.Tiet kiem ca nhan");
            System.out.println("0.Thoat");
            String button = sc.nextLine();
            switch(button)
            {
                case "1":
                {
                    System.out.println(""+cacChucNangAtm.saoKeTaiKhoan());
                    break;
                }
                case "2":
                {
                    do
                    {
                        check = true;
                        System.out.print("nhap vao so tai khoan cua ban: ");
                     
                        try
                        {
                             String soTaiKhoan = sc.nextLine();
                             KiemTraNgoaiLeTaiKhoanAtm kiemTraTaiKhoan = new KiemTraNgoaiLeTaiKhoanAtm();
                             kiemTraTaiKhoan.kiemTraSoTaiKhoan(soTaiKhoan);
                             do
                             {
                                 check = true;
                                try
                                {
                                     System.out.println("vui long nhap so tien ban muon nop: ");
                                     long tienCanNop = Long.parseLong(sc.nextLine());
                                     cacChucNangAtm.nopTien(tienCanNop);
                                }
                               catch(NumberFormatException e)
                               {
                                   check = false;
                                   System.out.println("so tien ban vua nhap khong hop le");
                               }
                             }
                             while(check==false);
                        }
                        catch(NgoaiLeTaiKhoanAtm e)
                        {
                            check = false;
                            System.out.println(""+e.getMessage());
                        }            
                    }
                    while(check==false);
                    break;
                }
                case "3":
                {
                    do
                    {
                        check = true;
                        try
                        {
                            System.out.print("nhap vao so tai khoan ban muon chuyen: ");
                            String soTaiKhoan = sc.nextLine();
                            KiemTraNgoaiLeTaiKhoanAtm kiemTraTaiKhoan = new KiemTraNgoaiLeTaiKhoanAtm();
                            kiemTraTaiKhoan.kiemTraSoTaiKhoan(soTaiKhoan);  
                            do
                            {
                                check = true;
                                try{
                                System.out.print("nhap vao so tien ban muon chuyen: ");
                                long tienCanChuyen = Long.parseLong(sc.nextLine());
                                if(nhanTienChuyenKhoan.getSoTaiKhoan().equals(soTaiKhoan)==true)
                                {
                                    System.out.println(""+nhanTienChuyenKhoan.toString());
                                    cacChucNangAtm.chuyenTien(tienCanChuyen);
                                }
                                else
                                {
                                    System.out.println("so tai khoan ban vua nhap khong dung");
                                    System.out.println("vui long chon so 3 neu ban muon thuc hien tiep giao dich");
                                }
                                }
                                            
                                catch(NumberFormatException e)
                               {
                                   check = false;
                                   System.out.println("so tien ban vua nhap khong hop le");
                               }
                            }
                            while(check==false);
                        }
                        catch(NgoaiLeTaiKhoanAtm e)
                        {
                            check = false;
                            System.out.println(""+e.getMessage());
                        }
                    }
                    while(check==false);
                    break;
                }
                case "4":
                {
                    do
                    {
                        check = true;
                        try
                        {
                            System.out.print("nhap vao so tien ban muon rut: ");
                            long tienMuonRut = Long.parseLong(sc.nextLine());
                            cacChucNangAtm.rutTien(tienMuonRut);
                        }
                        catch(NumberFormatException e)
                        {
                            check = false;
                            System.out.println("so tien ban vua nhap khong hop le");
                        }
                    }
                    while(check==false);
                    break;
                }
                case "5":
                {
                    
                     do
                        {
                            check = true;
                            System.out.print("vui long nhap ma pin cua ban: ");
                            try{
                                  String maPin = sc.nextLine();
                                  KiemTraNgoaiLeMaPin kiemTra = new KiemTraNgoaiLeMaPin();
                                  kiemTra.kiemTra(maPin);
                                  if(theAtm.getMaPin().equals(maPin)==true)
                                  {
                                      do
                                      {
                                          check = true;
                                          System.out.print("vui long nhap ma pin moi cua ban: ");
                                          try
                                          {
                                            maPin = sc.nextLine();
                                            kiemTra.kiemTra(maPin);
                                            cacChucNangAtm.doiMaPin(maPin);
                                          }
                                          catch(NgoaiLeMaPin e)
                                          {
                                              check = false;
                                              System.out.println(""+e.getMessage());
                                          }
                                      }                                     
                                      while(check==false);
                                   }
                                  else
                                  {
                                      check = false;
                                      System.out.println("ma pin ban vua nhap khong hop le");
                                  }
                            }
                            catch(NgoaiLeMaPin e){
                                check = false;
                                System.out.println(""+e.getMessage());
                            }

                        }
                        while(check==false);
                    break;
                }
                case "6":
                {
                    do
                    {
                        check = true;
                        System.out.print("nhap vao so tien ban muon gui tiet kiem: "); 
                        try{
                            long soTienGui = Long.parseLong(sc.nextLine());
                            cacChucNangAtm.guiTietKiem(soTienGui);
                        }
                        catch(NumberFormatException e)
                        {
                            check = false;
                            System.out.println("so tien ban nhap khong hop le");
                        }
                        
                    }
                    while(check==false);
                    break;
                }
                            
                default:
                {
                    System.out.println("du lieu khong hop le");
                    continue;
                }
            }
            
            
        }
    }
                
  }

