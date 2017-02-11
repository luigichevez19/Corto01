/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;



/**
 *
 * @author Luis
 */

public class Ejercicio {
   int numero,numero2,numero3,contador;

    public void setContador(int contador) {
        this.contador = contador;
    }
   String imagen1,imagen2,imagen3;

    public String getImagen1() {
        return imagen1;
    }

    public void setImagen1(String imagen1) {
        this.imagen1 = imagen1;
    }

    public String getImagen2() {
        return imagen2;
    }

    public void setImagen2(String imagen2) {
        this.imagen2 = imagen2;
    }

    public String getImagen3() {
        return imagen3;
    }

    public void setImagen3(String imagen3) {
        this.imagen3 = imagen3;
    }
public Ejercicio ()
 {
       contador = 0;
 }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }
  
   public String calculo()
   {
       contador++;
       if(contador < 5)
       {
 numero = (int) (Math.random()*8+0);
       }
       else
       {
       numero = 7;
       }
    switch(numero)
    {
        case 0:
       imagen1 = "src/com/sv/udb/Imagenes/1486845413_number_0_green.png";
                break;
        case 1:
        imagen1 = "src/com/sv/udb/Imagenes/1486845430_number_1_green.png";    
                break;
        case 2:
        imagen1 = "src/com/sv/udb/Imagenes/1486845445_number_2_green.png";    
                break;
        case 3:
        imagen1 = "src/com/sv/udb/Imagenes/1486845472_number_3_green.png";    
                break;
        case 4:
        imagen1 = "src/com/sv/udb/Imagenes/1486845489_number_4_green.png";    
                break;
        case 5:
        imagen1 = "src/com/sv/udb/Imagenes/1486845511_number_5_green.png";    
                break;
        case 6:
        imagen1 = "src/com/sv/udb/Imagenes/1486845532_number_6_green.png";    
                break;
        case 7:
        imagen1 = "src/com/sv/udb/Imagenes/1486845565_number_7_green.png";    
                break;    
                
    }  
   return imagen1;
   }
   public String calculo2()
   {
   if(contador < 5)
       {
 numero2 = (int) (Math.random()*8+0);
       }
       else
       {
       numero2 = 7;
       }
    switch(numero2)
    {
        case 0:
        imagen2 = "src/com/sv/udb/Imagenes/1486845413_number_0_green.png";
                break;
        case 1:
         imagen2 = "src/com/sv/udb/Imagenes/1486845430_number_1_green.png"; 
                break;
        case 2:
        imagen2 = "src/com/sv/udb/Imagenes/1486845445_number_2_green.png";    
                break;
        case 3:
        imagen2 = "src/com/sv/udb/Imagenes/1486845472_number_3_green.png";    
                break;
        case 4:
        imagen2 = "src/com/sv/udb/Imagenes/1486845489_number_4_green.png";    
                break;
        case 5:
        imagen2 = "src/com/sv/udb/Imagenes/1486845511_number_5_green.png";    
                break;
        case 6:
        imagen2 = "src/com/sv/udb/Imagenes/1486845532_number_6_green.png";    
                break;
       case 7:
        imagen2 = "src/com/sv/udb/Imagenes/1486845565_number_7_green.png";    
                break;
                     
                
    }
    return imagen2;
   }
   public String calculo3()
   {
      if(contador < 5)
       {
 numero3 = (int) (Math.random()*8+0);
       }
       else
       {
       numero3 = 7;
       }
    switch(numero3)
    {
        case 0:
         imagen3 = "src/com/sv/udb/Imagenes/1486845413_number_0_green.png";
                break;
        case 1:
        imagen3 = "src/com/sv/udb/Imagenes/1486845430_number_1_green.png";    
                break;
        case 2:
        imagen3 = "src/com/sv/udb/Imagenes/1486845445_number_2_green.png";    
                break;
        case 3:
        imagen3 = "src/com/sv/udb/Imagenes/1486845472_number_3_green.png";    
                break;
        case 4:
        imagen3 = "src/com/sv/udb/Imagenes/1486845489_number_4_green.png";    
                break;
        case 5:
        imagen3 = "src/com/sv/udb/Imagenes/1486845511_number_5_green.png";    
                break;
        case 6:
        imagen3 = "src/com/sv/udb/Imagenes/1486845532_number_6_green.png";    
                break;
        case 7:
        imagen3 = "src/com/sv/udb/Imagenes/1486845565_number_7_green.png";    
                break;
                
    } 
   return imagen3;
   }
}
