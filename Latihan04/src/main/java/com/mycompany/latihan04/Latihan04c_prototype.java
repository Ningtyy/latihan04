/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan04;
import java.util.Scanner;
/**
 *
 * @author Bening Tyas
 */
public class Latihan04c_prototype {
    String nama;
    String progdi;
    int nilai;
    String nhuruf;
    
    public void inputData(){
        Scanner data = new Scanner(System.in);   
        
        System.out.print("Nama :");
        nama = data.nextLine();
        
        System.out.print("Program Studi :");
        progdi = data.nextLine();
        
        System.out.print("Nilai :");
        nilai = data.nextInt();
    } 
    
    public void nilaihuruf(){
        if (nilai >= 85 && nilai <= 100){
            nhuruf = "A";
        }
        else if (nilai < 85 && nilai >= 70){
            nhuruf = "B";
        }
        
        else if (nilai < 70 && nilai >= 60){
            nhuruf = "C";
        }
        
        else if (nilai < 60 && nilai >= 50){
            nhuruf = "D";
        }
        
        else if(nilai < 50 && nilai >= 0){
            nhuruf = "E";
        }
        else {
            nhuruf = "eror";
        }
    }
}
