/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JInternalFrame;

/**
 *
 * @author ranbr
 */
public class Principal extends javax.swing.JFrame {

    private MantenimientoAlumnos ventanaAlumno;
    private MantenimientoAulas ventanaAula;
    private MantenimientoCarreras ventanaCarrera;
    private MantenimientoCursos ventanaCurso;
    private MantenimientoFacultad ventanaFacultad;
    private MantenimientoJornadas ventanaJornada;
    private MantenimientoMaestros ventanaMaestro;
    private MantenimientoSecciones ventanaSeccion;
    private MantenimientoSedes ventanaSede;
    private AsignacionCursosAlumnos ventanaAsignacion;
    private AsignacionCursosMaestros ventanaAsignacionM;

    public static String BD = "jdbc:mysql://localhost/siu";
    public static String Usuario = "root";
    public static String Contraseña = "Polo.2015";

    /**
     * Creates new form MDI
     */
    
     public void CentrarVentanas(JInternalFrame internalFrame){
        
        int x = (ventanaP.getWidth( ) / 2)- internalFrame.getWidth() / 2;
        int y = (ventanaP.getHeight() / 2)- internalFrame.getHeight() / 2;
        
       if (internalFrame.isShowing () ){
           internalFrame.setLocation (x,  y);
       }
    
    else {
    ventanaP.add(internalFrame);
    internalFrame.setLocation(x,  y);
    internalFrame.show();
}
    }
    public Principal() {
        initComponents();
    }

    public static Connection getConeccion() {
        Connection cn = null;
        try {
            Class.forName(BD);
            cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);

        } catch (Exception e) {
            System.out.println(String.valueOf(e));
        }
        return cn;

    }
    public static ResultSet getTablaUsuarios(String Consulta){
        Connection cn = getConeccion();
        Statement st = null ;
        ResultSet datos=null;
       
        try{
            datos=st.executeQuery((Consulta));
        }catch(Exception e){ System.out.print(e.toString());}
        return datos;
    
    }
    public void Panel(){
    ventanaP.removeAll();
       ventanaP.repaint();
       ventanaP.revalidate();
        
       ventanaP.repaint();
        ventanaP.revalidate();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        ventanaP = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        MAlumnos = new javax.swing.JMenuItem();
        MAulas = new javax.swing.JMenuItem();
        Mfacultades = new javax.swing.JMenuItem();
        MCarreras = new javax.swing.JMenuItem();
        MCursos = new javax.swing.JMenuItem();
        MJornadas = new javax.swing.JMenuItem();
        MMaestros = new javax.swing.JMenuItem();
        MSecciones = new javax.swing.JMenuItem();
        MSedes = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rachel Barrios 9959-18-649");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/origami-mitchell.png"))); // NOI18N

        ventanaP.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ventanaPLayout = new javax.swing.GroupLayout(ventanaP);
        ventanaP.setLayout(ventanaPLayout);
        ventanaPLayout.setHorizontalGroup(
            ventanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventanaPLayout.setVerticalGroup(
            ventanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 204, 204));

        jMenu5.setText("Abrir");
        jMenuBar1.add(jMenu5);

        jMenu1.setText("Catalogo");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        MAlumnos.setText("Mantenimiento Alumnos");
        MAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAlumnosActionPerformed(evt);
            }
        });
        jMenu1.add(MAlumnos);

        MAulas.setText("Mantenimiento Aulas");
        MAulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAulasActionPerformed(evt);
            }
        });
        jMenu1.add(MAulas);

        Mfacultades.setText("Mantenimiento Facultades");
        Mfacultades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MfacultadesActionPerformed(evt);
            }
        });
        jMenu1.add(Mfacultades);

        MCarreras.setText("Mantenimiento Carreras");
        MCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCarrerasActionPerformed(evt);
            }
        });
        jMenu1.add(MCarreras);

        MCursos.setText("Mantenimiento Cursos");
        MCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCursosActionPerformed(evt);
            }
        });
        jMenu1.add(MCursos);

        MJornadas.setText("Mantenimiento Jornada");
        MJornadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MJornadasActionPerformed(evt);
            }
        });
        jMenu1.add(MJornadas);

        MMaestros.setText("Mantenimiento Maestros");
        MMaestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMaestrosActionPerformed(evt);
            }
        });
        jMenu1.add(MMaestros);

        MSecciones.setText("Mantenimiento Secciones");
        MSecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSeccionesActionPerformed(evt);
            }
        });
        jMenu1.add(MSecciones);

        MSedes.setText("Mantenimiento Sedes");
        MSedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSedesActionPerformed(evt);
            }
        });
        jMenu1.add(MSedes);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Procesos");

        jMenuItem13.setBackground(new java.awt.Color(51, 255, 204));
        jMenuItem13.setText("Asignacion cursos a Alumnos");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuItem1.setText("Asignacion cursos a Maestros");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Informes");
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Herramientas");
        jMenuBar1.add(jMenu7);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaP)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaP)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
               // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void MfacultadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MfacultadesActionPerformed
        ventanaFacultad = new MantenimientoFacultad();
        Panel();
        CentrarVentanas(ventanaFacultad);
        ventanaP.add(jLabel1);

        // TODO add your handling code here:
    }//GEN-LAST:event_MfacultadesActionPerformed

    private void MMaestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMaestrosActionPerformed
        ventanaMaestro = new MantenimientoMaestros();

        Panel();
        CentrarVentanas(ventanaMaestro);
        ventanaP.add(jLabel1);
        // TODO add your handling code here:
    }//GEN-LAST:event_MMaestrosActionPerformed

    private void MAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAlumnosActionPerformed
        ventanaAlumno = new MantenimientoAlumnos();
        Panel();
        CentrarVentanas(ventanaAlumno);
        ventanaP.add(jLabel1);
        // TODO add your handling code here:
    }//GEN-LAST:event_MAlumnosActionPerformed

    private void MCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCarrerasActionPerformed
        ventanaCarrera = new MantenimientoCarreras();

        Panel();
        CentrarVentanas(ventanaCarrera);
        ventanaP.add(jLabel1);

        // TODO add your handling code here:
    }//GEN-LAST:event_MCarrerasActionPerformed

    private void MCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCursosActionPerformed
        ventanaCurso = new MantenimientoCursos();

        Panel();
        CentrarVentanas(ventanaCurso);
        ventanaP.add(jLabel1);
        // TODO add your handling code here:
    }//GEN-LAST:event_MCursosActionPerformed

    private void MSeccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSeccionesActionPerformed
        ventanaSeccion = new MantenimientoSecciones();

        Panel();
        CentrarVentanas(ventanaSeccion);
        ventanaP.add(jLabel1);
        // TODO add your handling code here:
    }//GEN-LAST:event_MSeccionesActionPerformed

    private void MSedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSedesActionPerformed
        ventanaSede = new MantenimientoSedes();

        Panel();
        CentrarVentanas(ventanaSede);
        ventanaP.add(jLabel1);
        // TODO add your handling code here:
    }//GEN-LAST:event_MSedesActionPerformed

    private void MAulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAulasActionPerformed
        ventanaAula = new MantenimientoAulas();

        Panel();
        CentrarVentanas(ventanaAula);
        ventanaP.add(jLabel1);
        // TODO add your handling code here:
    }//GEN-LAST:event_MAulasActionPerformed

    private void MJornadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MJornadasActionPerformed
        ventanaJornada = new MantenimientoJornadas();

        Panel();
        CentrarVentanas(ventanaJornada);
        ventanaP.add(jLabel1);
        // TODO add your handling code here:
    }//GEN-LAST:event_MJornadasActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        ventanaAsignacion = new AsignacionCursosAlumnos();
        Panel();
        CentrarVentanas(ventanaAsignacion);
        ventanaP.add(jLabel1);      // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:

        ventanaAsignacionM = new AsignacionCursosMaestros();
        Panel();
        CentrarVentanas(ventanaAsignacionM);
        ventanaP.add(jLabel1);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MAlumnos;
    private javax.swing.JMenuItem MAulas;
    private javax.swing.JMenuItem MCarreras;
    private javax.swing.JMenuItem MCursos;
    private javax.swing.JMenuItem MJornadas;
    private javax.swing.JMenuItem MMaestros;
    private javax.swing.JMenuItem MSecciones;
    private javax.swing.JMenuItem MSedes;
    private javax.swing.JMenuItem Mfacultades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JDesktopPane ventanaP;
    // End of variables declaration//GEN-END:variables
}
