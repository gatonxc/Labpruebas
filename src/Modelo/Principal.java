/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Julian Gato
 */
public class Principal {
    
        
    private static String categoria;
    private static String horas;
    
    public Principal(String cat,String hor) {
       categoria=cat;
       horas=hor;
    }    

    public static String getCategoria() {
        return categoria;
    }

    public static void setCategoria(String aCategoria) {
        categoria = aCategoria;
    }
    
    public static String getHoras() {
        return horas;
    }

    public static void setHoras(String aHoras) {
        horas = aHoras;
    }
}
