package examen_final;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import keeptoo.Drag;


/**
 *
 * @author Langas
 */
public class Login extends javax.swing.JFrame {

       
    /**
     * Creates new form Registrarse
     */
    public Login() {
        initComponents();
         setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        btnIniciarSecion = new keeptoo.KButton();
        kButton4 = new keeptoo.KButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JTextField();
        txt_Contraseña = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkGradientFocus(50);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 0));
        kGradientPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseDragged(evt);
            }
        });
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel1MousePressed(evt);
            }
        });
        kGradientPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kGradientPanel1KeyPressed(evt);
            }
        });
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contraseña");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        btnIniciarSecion.setText("Iniciar Sesion");
        btnIniciarSecion.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnIniciarSecion.setkBorderRadius(30);
        btnIniciarSecion.setkFillButton(false);
        btnIniciarSecion.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnIniciarSecion.setkHoverStartColor(new java.awt.Color(0, 51, 51));
        btnIniciarSecion.setkStartColor(new java.awt.Color(153, 255, 153));
        btnIniciarSecion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSecionMouseClicked(evt);
            }
        });
        btnIniciarSecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSecionActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnIniciarSecion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 110, 40));

        kButton4.setText("Registrase");
        kButton4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        kButton4.setkBorderRadius(30);
        kButton4.setkFillButton(false);
        kButton4.setkHoverForeGround(new java.awt.Color(204, 204, 204));
        kButton4.setkHoverStartColor(new java.awt.Color(0, 51, 51));
        kButton4.setkStartColor(new java.awt.Color(153, 255, 153));
        kButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButton4MouseClicked(evt);
            }
        });
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 110, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("x");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 10, 20));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Admin_2.png"))); // NOI18N
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 60, 70));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuario");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        txt_Usuario.setBackground(new Color(0,0,0,0));
        txt_Usuario.setFont(new java.awt.Font("Segoe UI Historic", 0, 11)); // NOI18N
        txt_Usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_Usuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Usuario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_Usuario.setOpaque(false);
        txt_Usuario.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txt_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsuarioActionPerformed(evt);
            }
        });
        kGradientPanel1.add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 290, 30));

        txt_Contraseña.setBackground(new Color(0,0,0,0));
        txt_Contraseña.setFont(new java.awt.Font("Segoe UI Historic", 0, 11)); // NOI18N
        txt_Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        txt_Contraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_Contraseña.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Contraseña.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_Contraseña.setOpaque(false);
        kGradientPanel1.add(txt_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 290, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mariano.png"))); // NOI18N
        jLabel7.setText("LOGIN");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 70));
        kGradientPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 470, 10));
        kGradientPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 210, 10));
        kGradientPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 210, 10));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        kGradientPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 10, 380));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        kGradientPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 10, 380));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 995, 574));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kGradientPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kGradientPanel1KeyPressed
        // TODO add your handling code here:   new Drag(kGradientPanel1).moveWindow(evt);
    }//GEN-LAST:event_kGradientPanel1KeyPressed

    private void kGradientPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseDragged
        // TODO add your handling code here:
        //Drag
        new Drag(kGradientPanel1).moveWindow(evt);
       
    }//GEN-LAST:event_kGradientPanel1MouseDragged

    private void kGradientPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MousePressed
        // TODO add your handling code here:
        //Aveces cuando pasa el mosue
        new Drag(kGradientPanel1).onPress(evt);
        
    }//GEN-LAST:event_kGradientPanel1MousePressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
  
       Nuevo_Registro ventana = new Nuevo_Registro();
       ventana.setVisible(true);
       this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_kButton4ActionPerformed

    private void txt_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UsuarioActionPerformed

    private void btnIniciarSecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSecionActionPerformed

        if ( txt_Usuario.getText().isEmpty() || txt_Contraseña.getText().isEmpty()){

            JOptionPane.showMessageDialog(null, " NO SE PUEDE DEJAR CAMPOS VACIOS");

            txt_Usuario.setText("");
            txt_Contraseña.setText("");
        }
        else {

            try{

        Connection cn = DriverManager.getConnection(Principal.BD,Principal.Usuario,Principal.Contraseña);

                PreparedStatement pst = cn.prepareStatement("select * from usuarios  where NombreUsuario = ?");

                pst.setString(1, txt_Usuario.getText().trim());
                ResultSet rs = pst.executeQuery();

                PreparedStatement pst2 = cn.prepareStatement("select * from usuarios  where Pass = ?");

                pst2.setString(1, txt_Contraseña.getText().trim());
                ResultSet rs2 = pst2.executeQuery();

                if(rs.next()){

                    if(rs2.next()){
                        JOptionPane.showMessageDialog(null, "Bienvenido" + "    " + rs.getString("NombreUsuario"));

                        Principal ventana = new  Principal();
                        ventana.setVisible(true);
                        this.dispose();
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "No registrado.");
                    txt_Usuario.setText("");
                    txt_Contraseña.setText("");

                }

            }catch(Exception e){

            }
        
        }                // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarSecionActionPerformed

    private void btnIniciarSecionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSecionMouseClicked

       




// TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarSecionMouseClicked

    private void kButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        /* Registrarse1 frame = new  Registrarse1();
      frame.setSize(500, 500);
      frame.setLocationRelativeTo(null);
     frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
      frame.setVisible(true);*/
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnIniciarSecion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private keeptoo.KButton kButton4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JPasswordField txt_Contraseña;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
