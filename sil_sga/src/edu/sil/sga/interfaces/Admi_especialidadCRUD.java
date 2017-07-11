/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sil.sga.interfaces;

import edu.sil.sga.dao.EspecialidadDAO;
import edu.sil.siga.bean.Especialidad;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cesar Lopez
 */
public class Admi_especialidadCRUD extends javax.swing.JInternalFrame {

    /**
     * Creates new form Admi_especialidadCRUD
     */
    public List<Especialidad> listaEspecialidad;
    public Especialidad objEspecialidadSeleccinada;

    public Admi_especialidadCRUD() {

        initComponents();
        setLocation(330, 45);
        activaBotones(true, false, false, false);
        ListarEspecialidad();
        activaCajas(false);
        

    }

    //metodos a utilizar en el formulario =D
    void activaCajas(boolean a) {
        txtdescripcion.setEnabled(a);
    }

    void limpiarCajas() {
        txtdescripcion.setText("");
    }

    public void activaBotones(boolean a, boolean b, boolean c, boolean d) {
        btnNuevo.setEnabled(a);
        btnGuardar.setEnabled(b);
        btnActualizar.setEnabled(c);
        btnEliminar.setEnabled(d);
    }

    ;
    
    public void ListarEspecialidad() {

        try {
            EspecialidadDAO dao = new EspecialidadDAO();
            listaEspecialidad = dao.ListarEspecialidad();

            DefaultTableModel modelo = new DefaultTableModel();
            
            modelo.addColumn("Descripcion");
            for (Especialidad objEspecialidad : listaEspecialidad) {
                modelo.addRow(new String[]{
                     
                    objEspecialidad.getDescripcion()});
            }
            tablaLista.setModel(modelo);
        } catch (Exception e) {

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

        panelEspecialidad = new javax.swing.JPanel();
        txtdescripcion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLista = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestionar Especialidad - IEP San Ignacio de Loyola");

        panelEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Especialidad"));

        txtdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdescripcionKeyTyped(evt);
            }
        });

        jLabel1.setText("* Nombre:");

        javax.swing.GroupLayout panelEspecialidadLayout = new javax.swing.GroupLayout(panelEspecialidad);
        panelEspecialidad.setLayout(panelEspecialidadLayout);
        panelEspecialidadLayout.setHorizontalGroup(
            panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspecialidadLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelEspecialidadLayout.setVerticalGroup(
            panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspecialidadLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelEspecialidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Gestionar Especialidad");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Listar Especialidad"));

        tablaLista.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        tablaLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaLista);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnNuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnGuardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnActualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnEliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(panelEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel2)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnActualizar)
                                .addComponent(btnGuardar)
                                .addComponent(btnEliminar))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaListaMouseClicked
        // TODO add your handling code here:

        int fila = tablaLista.getSelectedRow();
        
        if (fila != -1) {
            objEspecialidadSeleccinada = listaEspecialidad.get(fila);
            txtdescripcion.setText(objEspecialidadSeleccinada.getDescripcion());

            btnNuevo.setText("Nuevo");
            activaBotones(true, false, true, true);
            activaCajas(true);
        }
        
        activaCajas(true);
        btnNuevo.setText("Nuevo");
        activaBotones(true, false, true, true);
        
    }//GEN-LAST:event_tablaListaMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:

        if (btnNuevo.getText().equals("Nuevo")) {
            limpiarCajas();
            activaBotones(true, true, false, false);
            btnNuevo.setText("Cancelar");
            activaCajas(true);
        } else {
            activaBotones(true, false, false, false);
            btnNuevo.setText("Nuevo");
            activaCajas(false);
        }

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String descripcion = txtdescripcion.getText();
        if (descripcion.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar los campos requerido con (*) ", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Especialidad objEspecialidad = new Especialidad();
                objEspecialidad.setDescripcion(descripcion);
                EspecialidadDAO dao = new EspecialidadDAO();
                if (dao.RegistrarEspecialidad(objEspecialidad)) {
                    JOptionPane.showMessageDialog(null, "Se registro correctamente", "CORRECTO", JOptionPane.INFORMATION_MESSAGE);
                    activaBotones(true, false, false, false);
                    btnNuevo.setText("Nuevo");
                    limpiarCajas();
                    ListarEspecialidad();
                    activaCajas(false);
                } else {
                    JOptionPane.showMessageDialog(this, "No se puede registrar");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        
        
        if (txtdescripcion.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un registro");
        } 
        
        else {
            try {
                Especialidad especialidad = new Especialidad();
                EspecialidadDAO dao = new EspecialidadDAO();
                
                especialidad.setId(objEspecialidadSeleccinada.getId());
                especialidad.setDescripcion(txtdescripcion.getText());
                
                if (dao.ActualizarEspecialidad(especialidad)) {
                    JOptionPane.showMessageDialog(this, "Se actualizo correctamente");
                    limpiarCajas();
                    activaBotones(true, false, false, false);
                    activaCajas(false);
                    ListarEspecialidad();
                } else {
                    JOptionPane.showMessageDialog(null, "No se puedo registrar su especialidad :( ", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

        if (txtdescripcion.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un registro");
        } else {
            try {
                EspecialidadDAO dao = new EspecialidadDAO();
                Especialidad especialidad = new Especialidad();
                
                especialidad.setId(objEspecialidadSeleccinada.getId());
                especialidad.setDescripcion(objEspecialidadSeleccinada.getDescripcion());
                
                
                if (dao.EliminarEspecialidad(especialidad)) {
                    JOptionPane.showMessageDialog(this, "Se elimino correctamente");
                    limpiarCajas();
                    activaBotones(true, false, false, false);
                    ListarEspecialidad();
                    activaCajas(false);
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar ");
                }
            } catch (Exception e) {
                System.out.println("error en : "+e.getMessage());
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtdescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescripcionKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtdescripcionKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelEspecialidad;
    private javax.swing.JTable tablaLista;
    private javax.swing.JTextField txtdescripcion;
    // End of variables declaration//GEN-END:variables
}
