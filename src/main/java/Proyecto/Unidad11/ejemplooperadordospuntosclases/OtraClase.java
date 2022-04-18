/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Unidad11.ejemplooperadordospuntosclases;

import java.util.function.Function;

/**
 *
 * @author carlo
 */
public class OtraClase {
    
    public OtraClase() {
        
        
        
    }
    
     public  void funcionDePruebaNoEstatica(String param, Function<String,String> funcion ) {
        
       System.out.println(funcion.apply(param));
        
    }
    
     public  void noEstatica (Integer i, Function<Integer,Integer> funcion) {
     	
     	
     	System.out.println(funcion.apply(i));
     	
     }
   
    
}
