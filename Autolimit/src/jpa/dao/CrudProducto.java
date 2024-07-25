
package jpa.dao;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jpa.controlador.ProductoJpaController;
import jpa.entidad.Producto;

public class CrudProducto {
    
    private ProductoJpaController tjc = new ProductoJpaController();
    private Producto producto = new Producto();
    private String mensaje = "";
    
    public String insertarProducto(String nombre, String tipo_producto, String marca, int precio, int cantidad, String fecha_entrada, String fecha_salida, String extra){
        try
        {
            producto.setIdProducto(Integer.BYTES);
            producto.setNombre(nombre);
            producto.setMarca(marca);
            producto.setPrecio(precio);
            producto.setCantidad(cantidad);
            producto.setFechaEntrada(fecha_entrada);
            producto.setFechaSalida(fecha_salida);
            producto.setExtra(extra);
            tjc.create(producto);
            mensaje = "Guardado correctamente";
        }catch(Exception e){
        
            System.out.println("Mensaje en guardar: " + e.getMessage());
            mensaje = "No se pudo guardar la informacion";
            
        }
        return mensaje;
    }
    
        public String actualizarProducto(int id,String nombre, String tipo_producto, String marca, int precio, int cantidad, String fecha_entrada, String fecha_salida, String extra){
        try
        {
            producto.setIdProducto(id);
            producto.setNombre(nombre);
            producto.setMarca(marca);
            producto.setPrecio(precio);
            producto.setCantidad(cantidad);
            producto.setFechaEntrada(fecha_entrada);
            producto.setFechaSalida(fecha_salida);
            producto.setExtra(extra);
            tjc.edit(producto);
            mensaje = "Actualizado correctamente";
        }catch(Exception e){
        
            System.out.println("Mensaje en Actualizar: " + e.getMessage());
            mensaje = "No se pudo actualizar la informacion \n" + e.getMessage();
            
        }    
        
        return mensaje;
    }
        
        public String eliminarProducto(int id){
    
            try{
                tjc.destroy(id);
                mensaje = "Eliminado correctamente";
                
            }catch(Exception e){
                
                mensaje = "No se pudo eliminar la informacion";
                System.out.println("Mensaje en eliminar: " + e.getMessage());
                
            
            }
            
        return mensaje;
    }    
    
    public void listarProducto (JTable tabla){
        DefaultTableModel model;
        String [] titulo = {"Id","Nombre","Tipo de producto","Marca","Precio","Cantidad","Fecha de entrada","Fecha de salida","Extra"};
        model = new DefaultTableModel(null, titulo);
        
        List<Producto> datos = tjc.findProductoEntities();
        
        String [] datosProducto = new String[9];
        for (Producto p : datos){
            datosProducto[0] = p.getIdProducto()+"";
            datosProducto[1] = p.getNombre()+"";
            datosProducto[2] = p.getTipoProducto()+"";
            datosProducto[3] = p.getMarca()+"";
            datosProducto[4] = p.getPrecio()+"";
            datosProducto[5] = p.getCantidad()+"";
            datosProducto[6] = p.getFechaEntrada()+"";
            datosProducto[7] = p.getFechaSalida()+"";
            datosProducto[8] = p.getExtra()+"";
            model.addRow(datosProducto);
        }
        tabla.setModel(model);
    }
}
