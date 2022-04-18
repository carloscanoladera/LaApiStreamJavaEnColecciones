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
public class Clase {
	
	
	

    
   
    public static void funcionConParametroFunction(String param, Function<String,String> funcion ) {
        
       System.out.println(funcion.apply(param));
        
    }
    
    public  void funcionConParametroFunctionNoEstatica(String param, Function<String,String> funcion ) {
        
        System.out.println(funcion.apply(param));
         
     }
    
    public static String miFuncionEstatica(String param) {
        
        
        
        
        return param + " funcion ciudadana de primer nivel en Java";
    }
    
    
     public  String miFuncionNoEstatica(String param) {       
        
        
        
        return param + " funcion ciudadana de primer nivel en Java";
    }
     
     public void pasandoFuncionAMiClase(String cadena){ 
    	 
    	 funcionConParametroFunctionNoEstatica(cadena,this::miFuncionNoEstatica);
    	 	
     }
    
    
    public void pasandoFuncionAOtraClase(String cadena){ 
        
        OtraClase otra = new OtraClase();
        
        otra.funcionDePruebaNoEstatica(cadena, this::miFuncionNoEstatica);
        
    }
    
    

    

    
  
    
    public Clase () {
        
        
        
    }
    
    
    
    
      public static void main(String[] args) {
          
      
          
          Clase.funcionConParametroFunction("Cadena", (s)-> s + " " +s );
          
          Clase.funcionConParametroFunction("Funcion normal", Clase::miFuncionEstatica);        
          
                  
          
          Clase c1 = new Clase();
          
          c1.funcionConParametroFunctionNoEstatica("Funcion no estatica", c1::miFuncionNoEstatica);
          
          
          c1.pasandoFuncionAMiClase("No estatica en mi clase");
          
          OtraClase otra = new OtraClase();
          
          otra.funcionDePruebaNoEstatica("Funcion otra clase", c1::miFuncionNoEstatica);
          
          
        
          
          c1.pasandoFuncionAOtraClase("No estatica en otra clase");
          
         
          
           
      }
      
    
}
