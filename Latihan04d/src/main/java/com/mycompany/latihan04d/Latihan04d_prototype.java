/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan04d;

import java.util.Scanner;

/**
 *
 * @author Bening Tyas
 */
public class Latihan04d_prototype {
    String nama;
    int nopel;
    int pakai;
    int biaya;
    
    public void inputData(){
        Scanner data = new Scanner(System.in);   
        
        System.out.print("Nama :");
        nama = data.nextLine();
        
        System.out.print("No. Pelanggan :");
        nopel = data.nextInt();
        
        System.out.print("Pemakaian Air :");
        pakai = data.nextInt();
    } 
    
    public void total(){
        if (pakai <= 10)
            biaya = pakai * 1000;
        
        else if (pakai > 10 && pakai <=20)
            biaya = ((pakai - 10) * 2000) + (10 * 1000);
        
        else if (pakai > 20)
            biaya = ((pakai - 20) * 5000) + (10 * 2000) + (10 * 1000);
        
    }   
    
    
}
