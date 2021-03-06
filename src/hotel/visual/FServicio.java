/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.visual;

import hotel.datos.Servicio;
import hotel.logico.CServicio;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Efren
 */
public class FServicio extends javax.swing.JInternalFrame implements VentanaRegistros{
    String accion = "guardar";
    /**
     * Creates new form FServicio
     */
    public FServicio() {
        initComponents();
        mostrar("");
        inhabilitar();
    }
    
    /**
     * El metodo inhabilitar nos permite dejar inactivos los campos para realizar un registro
     * excepto el boton nuevo.
     */
    @Override
    public void inhabilitar() {
        txtIDServicio.setEnabled(false);
        txtNombre.setEnabled(false);
        txtDescripcion.setEnabled(false);
        txtPrecio.setEnabled(false);
        botonNuevo.setEnabled(true);
        botonGuardar.setEnabled(false);
        botonCancelar.setEnabled(false);
        botonEliminar.setEnabled(false);
        botonSalir.setEnabled(true);
        txtIDServicio.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
    }

    /**
     * El metodo habilitar nos permite activar los campos para generar un registro.
     */
    @Override
    public void habilitar() {
        txtIDServicio.setEnabled(false);
        txtNombre.setEnabled(true);
        txtDescripcion.setEnabled(true);
        txtPrecio.setEnabled(true);
        botonNuevo.setEnabled(true);
        botonGuardar.setEnabled(true);
        botonCancelar.setEnabled(true);
        txtIDServicio.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        
    }

    /**
     * El metodo mostrar nos permite mostrar en la ventana la consulta
     * que se realiza en la base de datos en forma de tabla.
     * @param buscar. String por el cual se filtrara la consulta 
     */
    @Override
    public void mostrar(String buscar) {
        try {
            //se crea una tabla
            DefaultTableModel modelo;
            /*se crea un objeto de la clase CServicio para poder operar en la tabla servicio.
            de la base de datos*/
            CServicio cs = new CServicio();
            // se almacena la tabla retornada al hacer una consulta en la tabla servicio.
            modelo = cs.consulta("");
            //se muestra en la ventana la tabla recibida por la consulta.
            tablaServicio.setModel(modelo);
            //se obtiene el total de registros existentes en la tabla y se muestra en pantalla
            lbRegistros.setText("Total Registros: " + Integer.toString(cs.totalregistros));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        lbServicio = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbIDServicio = new javax.swing.JLabel();
        txtIDServicio = new javax.swing.JTextField();
        lbTipo = new javax.swing.JLabel();
        lbDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        lbDescripcion1 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        botonNuevo = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaServicio = new javax.swing.JTable();
        lbRegistros = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Servicio"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        lbServicio.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbServicio.setForeground(new java.awt.Color(102, 0, 0));
        lbServicio.setText("Servicio");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(50, 0, 0, 0, new java.awt.Color(102, 0, 0)), "Registro de servicios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(102, 0, 0))); // NOI18N

        lbIDServicio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbIDServicio.setForeground(new java.awt.Color(0, 0, 0));
        lbIDServicio.setText("ID servicio:");

        txtIDServicio.setBackground(new java.awt.Color(204, 204, 204));
        txtIDServicio.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtIDServicio.setForeground(new java.awt.Color(0, 0, 0));

        lbTipo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbTipo.setForeground(new java.awt.Color(0, 0, 0));
        lbTipo.setText("Nombre:");

        lbDescripcion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        lbDescripcion.setText("Descripcion:");

        txtDescripcion.setBackground(new java.awt.Color(204, 204, 204));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        lbDescripcion1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbDescripcion1.setForeground(new java.awt.Color(0, 0, 0));
        lbDescripcion1.setText("Precio:");

        txtPrecio.setBackground(new java.awt.Color(204, 204, 204));
        txtPrecio.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));

        botonNuevo.setBackground(new java.awt.Color(204, 204, 204));
        botonNuevo.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        botonNuevo.setForeground(new java.awt.Color(0, 0, 0));
        botonNuevo.setText("Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        botonGuardar.setBackground(new java.awt.Color(204, 204, 204));
        botonGuardar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(0, 0, 0));
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonCancelar.setBackground(new java.awt.Color(204, 204, 204));
        botonCancelar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbIDServicio)
                            .addComponent(lbTipo)
                            .addComponent(lbDescripcion)
                            .addComponent(lbDescripcion1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIDServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonGuardar)
                        .addGap(37, 37, 37)
                        .addComponent(botonCancelar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIDServicio)
                    .addComponent(txtIDServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipo)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDescripcion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDescripcion1)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCancelar)
                    .addComponent(botonNuevo)
                    .addComponent(botonGuardar))
                .addGap(31, 31, 31))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(50, 0, 0, 0, new java.awt.Color(102, 0, 0)), "Listado de servicios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(102, 0, 0))); // NOI18N

        tablaServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaServicioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaServicio);

        lbRegistros.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbRegistros.setForeground(new java.awt.Color(0, 0, 0));
        lbRegistros.setText("Registros:");

        botonEliminar.setBackground(new java.awt.Color(204, 204, 204));
        botonEliminar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(0, 0, 0));
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonSalir.setBackground(new java.awt.Color(204, 204, 204));
        botonSalir.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(0, 0, 0));
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lbRegistros)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(botonEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(botonSalir)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminar)
                    .addComponent(botonSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbRegistros))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbServicio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbServicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        habilitar();
        botonGuardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        if(!txtIDServicio.getText().equals("")){
            int decision = JOptionPane.showConfirmDialog(rootPane, "Deseas eliminra el servicio?","Confirmar",2);
            if(decision == 0){
                CServicio cs = new CServicio();
                Servicio s = new Servicio();
                s.setIdServicio(Integer.parseInt(txtIDServicio.getText()));
                cs.eliminar(s);
                mostrar("");
                inhabilitar();
            }
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        //validamos que todos los campos de texto tengan un valor
        if(txtNombre.getText().length() == 0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el nombre del servicio");
            txtNombre.requestFocus();
            return;
        }
        if (txtDescripcion.getText().length() == 0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar una descripcion para el servicio");
            txtDescripcion.requestFocus();
            return;
        }
        if (txtPrecio.getText().length() == 0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un precio para el servicio");
            txtPrecio.requestFocus();
            return;
        }
        
        Servicio s = new Servicio();
        CServicio cs = new CServicio();
        //guardamos los valores en el objeto de la clase Servicio.
        s.setTipo(txtNombre.getText());
        s.setDescripcion(txtDescripcion.getText());
        s.setPrecio(Double.parseDouble(txtPrecio.getText()));
        
         if (accion.equals("guardar")){
            if (cs.insertar(s)){
                JOptionPane.showMessageDialog(rootPane, "El servicio se registro correctamente");
                mostrar("");
                inhabilitar();
            }  
        }else if (accion.equals("editar")){
            s.setIdServicio(Integer.parseInt(txtIDServicio.getText()));
            if (cs.editar(s)){
                JOptionPane.showMessageDialog(rootPane, "El servicio se edito correctamente");
                mostrar("");
                inhabilitar();
            }
        }
        
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        habilitar();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtNombre.transferFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void tablaServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaServicioMouseClicked
        botonGuardar.setText("Editar");
        habilitar();
        botonEliminar.setEnabled(true);
        accion = "editar";
        int fila = tablaServicio.rowAtPoint(evt.getPoint());
        txtIDServicio.setText(tablaServicio.getValueAt(fila,0).toString());
        txtNombre.setText(tablaServicio.getValueAt(fila,1).toString());
        txtDescripcion.setText(tablaServicio.getValueAt(fila,2).toString());
        txtPrecio.setText(tablaServicio.getValueAt(fila,3).toString());
    }//GEN-LAST:event_tablaServicioMouseClicked

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FServicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbDescripcion1;
    private javax.swing.JLabel lbIDServicio;
    private javax.swing.JLabel lbRegistros;
    private javax.swing.JLabel lbServicio;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JTable tablaServicio;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtIDServicio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}
