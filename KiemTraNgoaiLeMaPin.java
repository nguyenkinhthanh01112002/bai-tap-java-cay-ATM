/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atmcodebyjava;

/**
 *
 * @author KINHTHANH
 */
public class KiemTraNgoaiLeMaPin
{
    public static void kiemTra(String maPin) throws NgoaiLeMaPin
    {
        String maPinHopLe = "^[0-9]{4}$";
        boolean check = maPin.matches(maPinHopLe);
        if(check==false)
        {
            throw new NgoaiLeMaPin("ma pin vua nhap khong hop le");
        }
        
    }
    
    
}
