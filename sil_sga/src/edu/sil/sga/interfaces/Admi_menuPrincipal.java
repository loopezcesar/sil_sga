/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sil.sga.interfaces;

/**
 *
 * @author Cesar Lopez
 */
public class Admi_menuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Admi_menuPrincipal
     */
    public Admi_menuPrincipal() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    //GENERE TODOS LOS MENU ITEM =D 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuItemPrincipal = new javax.swing.JMenuItem();
        menuItemSalir = new javax.swing.JMenuItem();
        menuGestionar = new javax.swing.JMenu();
        menuItemAlumno = new javax.swing.JMenuItem();
        menuItemApoderado = new javax.swing.JMenuItem();
        menuItemCurso = new javax.swing.JMenuItem();
        menuItemEspecialidad = new javax.swing.JMenuItem();
        menuItemDocente = new javax.swing.JMenuItem();
        menuItemGrado = new javax.swing.JMenuItem();
        menuItemNivel = new javax.swing.JMenuItem();
        menuItemPeriodo = new javax.swing.JMenuItem();
        menuItemSeccion = new javax.swing.JMenuItem();
        menuItemTipoEvaluacion = new javax.swing.JMenuItem();
        menuMatricula = new javax.swing.JMenu();
        menuItemMatricula = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuItemClase = new javax.swing.JMenuItem();
        menuAccesos = new javax.swing.JMenu();
        MenuItemUsuario = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        menuItemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jdPrincipalLayout = new javax.swing.GroupLayout(jdPrincipal);
        jdPrincipal.setLayout(jdPrincipalLayout);
        jdPrincipalLayout.setHorizontalGroup(
            jdPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );
        jdPrincipalLayout.setVerticalGroup(
            jdPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );

        menuInicio.setText("Inicio");

        menuItemPrincipal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuItemPrincipal.setText("Principal");
        menuInicio.add(menuItemPrincipal);

        menuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuItemSalir.setText("Cerrar Sesion");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menuInicio.add(menuItemSalir);

        jMenuBar1.add(menuInicio);

        menuGestionar.setText("Gestionar");

        menuItemAlumno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuItemAlumno.setText("Alumno");
        menuItemAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAlumnoActionPerformed(evt);
            }
        });
        menuGestionar.add(menuItemAlumno);

        menuItemApoderado.setText("Apoderado");
        menuItemApoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemApoderadoActionPerformed(evt);
            }
        });
        menuGestionar.add(menuItemApoderado);

        menuItemCurso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        menuItemCurso.setText("Curso");
        menuItemCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCursoActionPerformed(evt);
            }
        });
        menuGestionar.add(menuItemCurso);

        menuItemEspecialidad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuItemEspecialidad.setText("Especialidad");
        menuItemEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEspecialidadActionPerformed(evt);
            }
        });
        menuGestionar.add(menuItemEspecialidad);

        menuItemDocente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        menuItemDocente.setText("Docente");
        menuItemDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDocenteActionPerformed(evt);
            }
        });
        menuGestionar.add(menuItemDocente);

        menuItemGrado.setText("Grado");
        menuItemGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemGradoActionPerformed(evt);
            }
        });
        menuGestionar.add(menuItemGrado);

        menuItemNivel.setText("Nivel");
        menuItemNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNivelActionPerformed(evt);
            }
        });
        menuGestionar.add(menuItemNivel);

        menuItemPeriodo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuItemPeriodo.setText("Periodo");
        menuItemPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPeriodoActionPerformed(evt);
            }
        });
        menuGestionar.add(menuItemPeriodo);

        menuItemSeccion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuItemSeccion.setText("Seccion");
        menuItemSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSeccionActionPerformed(evt);
            }
        });
        menuGestionar.add(menuItemSeccion);

        menuItemTipoEvaluacion.setText("Tipo Evaluacion");
        menuItemTipoEvaluacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTipoEvaluacionActionPerformed(evt);
            }
        });
        menuGestionar.add(menuItemTipoEvaluacion);

        jMenuBar1.add(menuGestionar);

        menuMatricula.setText("Matricula");

        menuItemMatricula.setText("Matricula");
        menuItemMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMatriculaActionPerformed(evt);
            }
        });
        menuMatricula.add(menuItemMatricula);

        jMenuItem1.setText("Cursos por Grado");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuMatricula.add(jMenuItem1);

        menuItemClase.setText("Clase");
        menuItemClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemClaseActionPerformed(evt);
            }
        });
        menuMatricula.add(menuItemClase);

        jMenuBar1.add(menuMatricula);

        menuAccesos.setText("Accesos");

        MenuItemUsuario.setText("Usuario");
        MenuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemUsuarioActionPerformed(evt);
            }
        });
        menuAccesos.add(MenuItemUsuario);

        jMenuItem13.setText("Perfiles");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        menuAccesos.add(jMenuItem13);

        jMenuItem14.setText("Usuario");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        menuAccesos.add(jMenuItem14);

        jMenuBar1.add(menuAccesos);

        menuAyuda.setText("Ayuda");

        jMenuItem2.setText("Contenito de Ayuda");
        menuAyuda.add(jMenuItem2);

        jMenuItem6.setText("Reportar Problemas");
        menuAyuda.add(jMenuItem6);

        menuItemAcercaDe.setText("Acerca de SIL SGA");
        menuItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAcercaDeActionPerformed(evt);
            }
        });
        menuAyuda.add(menuItemAcercaDe);

        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEspecialidadActionPerformed
        // TODO add your handling code here:
        Admi_especialidadCRUD frm = new Admi_especialidadCRUD();
        jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuItemEspecialidadActionPerformed

    private void menuItemDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDocenteActionPerformed
        // TODO add your handling code here:
        Admi_docenteCRUD frm = new Admi_docenteCRUD();
        jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuItemDocenteActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void menuItemNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNivelActionPerformed
        // TODO add your handling code here:
        Admi_nivelCRUD frm = new Admi_nivelCRUD();
        jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuItemNivelActionPerformed

    private void menuItemSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSeccionActionPerformed
        // TODO add your handling code here:
        Admi_SeccionCRUD frm = new Admi_SeccionCRUD();
        jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuItemSeccionActionPerformed

    private void menuItemCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCursoActionPerformed
        Admi_cursoCRUD frm = new Admi_cursoCRUD();
        jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuItemCursoActionPerformed

    private void menuItemGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGradoActionPerformed
        // TODO add your handling code here:
        Admi_GradoCRUD frm = new Admi_GradoCRUD();
        jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuItemGradoActionPerformed

    private void menuItemAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAlumnoActionPerformed
        Admi_alumnoCRUD frm = new Admi_alumnoCRUD();
        jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuItemAlumnoActionPerformed

    private void menuItemApoderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemApoderadoActionPerformed
        // TODO add your handling code here:
        Admi_apoderadoCRUD frm = new Admi_apoderadoCRUD();
        jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuItemApoderadoActionPerformed

    private void menuItemPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPeriodoActionPerformed
        // TODO add your handling code here:
        
        Admi_periodoCRUD frm = new Admi_periodoCRUD();
        jdPrincipal.add(frm);
        frm.setVisible(true);
        
    }//GEN-LAST:event_menuItemPeriodoActionPerformed

    private void menuItemTipoEvaluacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTipoEvaluacionActionPerformed
        // TODO add your handling code here:
        
        Admi_tipoEvaluacionCRUD frm = new Admi_tipoEvaluacionCRUD();
        jdPrincipal.add(frm);
        frm.setVisible(true);
        
        
    }//GEN-LAST:event_menuItemTipoEvaluacionActionPerformed

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login dialog = new Login(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void menuItemClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemClaseActionPerformed
        // TODO add your handling code here:
        Admi_claseCRUD frm = new Admi_claseCRUD();
        jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuItemClaseActionPerformed

    private void MenuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemUsuarioActionPerformed
        // TODO add your handling code here:
        Admi_usuarioCRUD frm = new Admi_usuarioCRUD();
        jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_MenuItemUsuarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Admi_CursoPorGrado frm = new Admi_CursoPorGrado();
        jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuItemMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMatriculaActionPerformed
        // TODO add your handling code here:
        Admi_Matricula frm = new Admi_Matricula();
        jdPrincipal.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_menuItemMatriculaActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void menuItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAcercaDeActionPerformed
        // TODO add your handling code here:
        acercaDeSIL form = new acercaDeSIL(null,true);
        form.setVisible(true);
    }//GEN-LAST:event_menuItemAcercaDeActionPerformed

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
            java.util.logging.Logger.getLogger(Admi_menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admi_menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admi_menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admi_menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admi_menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JDesktopPane jdPrincipal;
    private javax.swing.JMenu menuAccesos;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuGestionar;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenuItem menuItemAcercaDe;
    private javax.swing.JMenuItem menuItemAlumno;
    private javax.swing.JMenuItem menuItemApoderado;
    private javax.swing.JMenuItem menuItemClase;
    private javax.swing.JMenuItem menuItemCurso;
    private javax.swing.JMenuItem menuItemDocente;
    private javax.swing.JMenuItem menuItemEspecialidad;
    private javax.swing.JMenuItem menuItemGrado;
    private javax.swing.JMenuItem menuItemMatricula;
    private javax.swing.JMenuItem menuItemNivel;
    private javax.swing.JMenuItem menuItemPeriodo;
    private javax.swing.JMenuItem menuItemPrincipal;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenuItem menuItemSeccion;
    private javax.swing.JMenuItem menuItemTipoEvaluacion;
    private javax.swing.JMenu menuMatricula;
    // End of variables declaration//GEN-END:variables
}
