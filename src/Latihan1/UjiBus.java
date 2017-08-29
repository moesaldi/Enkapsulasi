/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author p61112286
 */
public class UjiBus {
    public static void main(String[] args) {
                Bus busmini = new Bus();
		busmini.penumpang = 5;
		busmini.maxpenumpang=15;
		busmini.cetak();
		busmini.penumpang=busmini.penumpang+5;
		busmini.cetak();
		busmini.penumpang=busmini.penumpang-2;
		busmini.cetak();
		busmini.penumpang=busmini.penumpang+8;
		busmini.cetak();
	}	
}
