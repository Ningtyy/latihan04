/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan04d;

/**
 *
 * @author Bening Tyas
 */
public class Latihan04d_main {
    public static void main(String[] args){
        System.out.println("Perhitungan Biaya Pemakaian Air");
        System.out.println("============================================");
        
        Latihan04d_prototype data = new Latihan04d_prototype();
        
        data.inputData();
        data.total();
        
        System.out.println("Biaya pakai : " + data.biaya);
        
        System.out.println("============================================");
    }
}
