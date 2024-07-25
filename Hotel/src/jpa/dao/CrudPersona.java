
package jpa.dao;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jpa.controlador.PersonaJpaController;
import jpa.entidad.Persona;

public class CrudPersona {
    private PersonaJpaController tjc = new PersonaJpaController();
    private Persona persona = new Persona();
    private String mensaje = "";
    
    public String insertarPersona(String nombre, String apellido, int edad, String ciudad, String fecha_de_ingreso, String fecha_de_salida){
        try
        {
            persona.setIdPersona(Integer.BYTES);
            persona.setNombre(nombre);
            persona.setApellido(apellido);
            persona.setEdad(edad);
            persona.setCiudad(ciudad);
            persona.setHoraDeIngreso(fecha_de_ingreso);
            persona.setHoraDeSalida(fecha_de_salida);
            tjc.create(persona);
            mensaje = "Guardado correctamente";
        }catch(Exception e){
        
            System.out.println("Mensaje en guardar: " + e.getMessage());
            mensaje = "No se pudo guardar la informacion";
            
        }
        return mensaje;
    }
    
        public String actualizarPersona(int id, String nombre, String apellido, int edad, String ciudad, String fecha_de_ingreso, String fecha_de_salida){
        try
        {
            persona.setIdPersona(Integer.BYTES);
            persona.setNombre(nombre);
            persona.setApellido(apellido);
            persona.setEdad(edad);
            persona.setCiudad(ciudad);
            persona.setHoraDeIngreso(fecha_de_ingreso);
            persona.setHoraDeSalida(fecha_de_salida);
            tjc.edit(persona);
            mensaje = "Actualizado correctamente";
        }catch(Exception e){
        
            System.out.println("Mensaje en Actualizar: " + e.getMessage());
            mensaje = "No se pudo actualizar la informacion \n" + e.getMessage();
            
        }    
        
        return mensaje;
    }
        
        public String eliminarPersona(int id){
    
            try{
                tjc.destroy(id);
                mensaje = "Eliminado correctamente";
                
            }catch(Exception e){
                
                mensaje = "No se pudo eliminar la informacion";
                System.out.println("Mensaje en eliminar: " + e.getMessage());
                
            
            }
            
        return mensaje;
    }   
        
    public void listarPersona (JTable tabla){
        DefaultTableModel model;
        String [] titulo = {"Id","Nombre","Apellido","Edad","Ciudad","Hora de Ingreso","Hora de salida"};
        model = new DefaultTableModel(null, titulo);
        
        List<Persona> datos = tjc.findPersonaEntities();
        
        String [] datosPersona = new String[9];
        for (Persona p : datos){
            datosPersona[0] = p.getIdPersona()+"";
            datosPersona[1] = p.getNombre()+"";
            datosPersona[2] = p.getApellido()+"";
            datosPersona[3] = p.getEdad()+"";
            datosPersona[4] = p.getCiudad()+"";
            datosPersona[5] = p.getHoraDeIngreso()+"";
            datosPersona[6] = p.getHoraDeSalida()+"";
            model.addRow(datosPersona);
        }
        tabla.setModel(model);
    }    
        
}
