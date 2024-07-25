
package jpa.test;

import jpa.dao.CrudPersona;

public class personaTest {
    
    public static void main(String[] args){
    
        
        
        
        CrudPersona pdao = new CrudPersona();
          System.out.println(pdao.insertarPersona("MegaBater", "Bateria", 50000, "20/06/2019" , "21/06/2019", "holu"));
//        System.out.println(pdao.actualizarPersona(1,"MegaBater", "Bateria", 50000, "20/06/2019" , "21/06/2019", "holu"));
//        System.out.println(pdao.eliminarPersona(1));
        
    }
}
