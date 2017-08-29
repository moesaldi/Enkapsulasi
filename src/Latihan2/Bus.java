/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author p61112286
 */
public class Bus {
    
    private int penumpang;
    private int maxpenumpang;
    
    public Bus(int maxpenumpang){
    this.maxpenumpang = maxpenumpang;
    penumpang=0;
    
    }
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if(temp>= maxpenumpang){
            System.out.println("Penumpang melebihi kuota");
        }
        else{
            this.penumpang = temp;
        }
    }
        public void cetak(){
            System.out.println("Penumpang bus sekarang adalah "+penumpang);
            System.out.println("Penumpang seharusnya ada "+maxpenumpang);
            
        }
    }


