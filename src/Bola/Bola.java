/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bola;

/**
 *
 * @author l
 */
import java.lang.Math;
public class Bola {
  private double jarijari;
  public Bola(double jarijari){
      this.jarijari=jarijari;
  }
  public void setjarijari(double jarijari){
      this.jarijari=jarijari;
  }
  public void showdiameter(){
    System.out.println("Diameter        = "+jarijari*2);
}
    public void showjarijari(){
    System.out.println("Jari-Jari       = "+jarijari);
}

  public void showluasbola(){
    System.out.println("Luas Permukaan  = "+(4/3*Math.PI*Math.pow(jarijari,3)));
  }
  public void showvolume(){
    System.out.println("Volume Bola     = "+(4*Math.PI*Math.pow(jarijari,2)));
  }
  
  
  
  }
  

