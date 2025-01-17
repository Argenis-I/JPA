
package jpa.vista;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jpa.dao.CrudPersona;

public class FrmPersona extends javax.swing.JFrame {
    
    private CrudPersona pdao = new CrudPersona();

    public FrmPersona() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/img/daytonaaa.png")).getImage());
        limpiar();
        this.setTitle("Hotel: Autolimit");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        mostrarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        txtHoraS = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtHoraI = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        PersonaTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        txtHoraS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtHoraS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraSActionPerformed(evt);
            }
        });
        jPanel1.add(txtHoraS, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 250, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Id:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Edad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Ciudad:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Hora de ingreso:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Hora de salida:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        txtId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 250, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 250, -1));

        txtApellido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 250, -1));

        txtEdad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 250, -1));

        txtCiudad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiudadActionPerformed(evt);
            }
        });
        jPanel1.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 250, -1));

        txtHoraI.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtHoraI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraIActionPerformed(evt);
            }
        });
        jPanel1.add(txtHoraI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 250, -1));

        PersonaTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        PersonaTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PersonaTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PersonaTabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 670, 270));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHoraSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraSActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiudadActionPerformed

    private void txtHoraIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraIActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtNombre.getText().equals("") || txtApellido.getText().equals("") || txtEdad.getText().equals("") || txtCiudad.getText().equals("") || txtHoraI.getText().equals("") || txtHoraS.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
        }else{
        
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        String ciudad = txtCiudad.getText();
        String hora_de_ingreso = txtHoraI.getText();
        String hora_de_salida = txtHoraS.getText();
        String mensaje = "";
        mensaje = pdao.insertarPersona(nombre, apellido, edad, ciudad, hora_de_ingreso, hora_de_salida);
        JOptionPane.showMessageDialog(null, mensaje);
        limpiar();
        mostrarTabla();
            }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (txtId.getText().equals("") || txtNombre.getText().equals("") || txtApellido.getText().equals("") || txtEdad.getText().equals("") || txtCiudad.getText().equals("") || txtHoraI.getText().equals("") || txtHoraS.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
        }else{
        
        int id = Integer.parseInt(txtId.getText());
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        String ciudad = txtCiudad.getText();
        String hora_de_ingreso = txtHoraI.getText();
        String hora_de_salida = txtHoraS.getText();
        String mensaje = "";
        mensaje = pdao.actualizarPersona(id, nombre, apellido, edad, ciudad, hora_de_ingreso, hora_de_salida);
        JOptionPane.showMessageDialog(null, mensaje);
        limpiar();
        mostrarTabla();
            }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9'){
                evt.consume();
                JOptionPane.showMessageDialog(rootPane, "Solo ingresar numeros");
        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int id = Integer.parseInt(txtId.getText());
        String mensaje = "";
        mensaje = pdao.eliminarPersona(id);
        JOptionPane.showMessageDialog(null, mensaje);
        limpiar();
        mostrarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void PersonaTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PersonaTablaMouseClicked
        int select = PersonaTabla.getSelectedRow();
        txtId.setText(PersonaTabla.getValueAt(select, 0)+"");
        txtNombre.setText(PersonaTabla.getValueAt(select, 1)+"");
        txtApellido.setText(PersonaTabla.getValueAt(select, 2)+"");
        txtEdad.setText(PersonaTabla.getValueAt(select, 3)+"");
        txtCiudad.setText(PersonaTabla.getValueAt(select, 4)+"");
        txtHoraI.setText(PersonaTabla.getValueAt(select, 5)+"");
        txtHoraS.setText(PersonaTabla.getValueAt(select, 6)+"");
     
    }//GEN-LAST:event_PersonaTablaMouseClicked

    private void limpiar(){
    
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtCiudad.setText("");
        txtHoraI.setText("");
        txtHoraS.setText("");

    }
    
    private void mostrarTabla(){
        pdao.listarPersona(PersonaTabla);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PersonaTabla;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtHoraI;
    private javax.swing.JTextField txtHoraS;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
