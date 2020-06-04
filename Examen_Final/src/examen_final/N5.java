/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_final;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ranbr
 */
public class N5 extends javax.swing.JInternalFrame {

    /**
     * Creates new form N5
     */
    public N5() {
        initComponents();
        try {
            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select nombre_carrera from carreras");
            ResultSet rs = pst.executeQuery();

            PreparedStatement pst2 = cn.prepareStatement("select nombre_sede from sedes");
            ResultSet rs2 = pst2.executeQuery();

            PreparedStatement pst3 = cn.prepareStatement("select nombre_jornada from jornadas");
            ResultSet rs3 = pst3.executeQuery();

            PreparedStatement pst4 = cn.prepareStatement("select nombre_seccion from secciones");
            ResultSet rs4 = pst4.executeQuery();

            PreparedStatement pst5 = cn.prepareStatement("select nombre_aula from aulas");
            ResultSet rs5 = pst5.executeQuery();

            PreparedStatement pst7 = cn.prepareStatement("select nombre_maestro from maestros");
            ResultSet rs7 = pst7.executeQuery();

            cbox_carrera.addItem("Seleccione una opción");
            while (rs.next()) {
                cbox_carrera.addItem(rs.getString("nombre_carrera"));
            }

            cbox_sede.addItem("Seleccione una opción");
            while (rs2.next()) {
                cbox_sede.addItem(rs2.getString("nombre_sede"));
            }

            cbox_j.addItem("Seleccione una opción");
            while (rs3.next()) {
                cbox_j.addItem(rs3.getString("nombre_jornada"));
            }

            cbox_sec.addItem("Seleccione una opción");
            while (rs4.next()) {
                cbox_sec.addItem(rs4.getString("nombre_seccion"));
            }

            cbox_aula.addItem("Seleccione una opción");
            while (rs5.next()) {
                cbox_aula.addItem(rs5.getString("nombre_aula"));
            }

            cbox_curso.addItem("Seleccione una opción");

            cbox_alum.addItem("Seleccione una opción");
            while (rs7.next()) {
                cbox_alum.addItem(rs7.getString("nombre_maestro"));
            }

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

        lb7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbox_carrera = new javax.swing.JComboBox<>();
        cbox_sede = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        lb2 = new javax.swing.JLabel();
        txtbuscado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbox_aula = new javax.swing.JComboBox<>();
        cbox_curso = new javax.swing.JComboBox<>();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbox_alum = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbox_j = new javax.swing.JComboBox<>();
        txt_id = new javax.swing.JTextField();
        cbox_sec = new javax.swing.JComboBox<>();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setVisible(true);

        lb7.setText("...");

        jLabel11.setText("Maestro");

        cbox_carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_carreraActionPerformed(evt);
            }
        });

        cbox_sede.setEnabled(false);
        cbox_sede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_sedeActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lb1.setText("...");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lb2.setText("...");

        jLabel5.setText("Carrera");

        jLabel8.setText("Jornada");

        jLabel9.setText("Curso");

        cbox_aula.setEnabled(false);
        cbox_aula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_aulaActionPerformed(evt);
            }
        });

        cbox_curso.setEnabled(false);
        cbox_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_cursoActionPerformed(evt);
            }
        });

        lb5.setText("...");

        lb6.setText("...");

        jLabel10.setText("Aula");

        cbox_alum.setEnabled(false);
        cbox_alum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_alumActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel6.setText("Sede");

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel7.setText("Seccion");

        jLabel4.setText("Codigo");

        cbox_j.setEnabled(false);
        cbox_j.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_jActionPerformed(evt);
            }
        });

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        cbox_sec.setEnabled(false);
        cbox_sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_secActionPerformed(evt);
            }
        });

        lb3.setText("...");

        lb4.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbox_j, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbox_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb3)
                            .addComponent(lb4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbox_aula, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbox_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb5)
                                    .addComponent(lb6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbox_alum, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb7))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_id)
                            .addComponent(cbox_carrera, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbox_sede, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb1)
                            .addComponent(lb2))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbox_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbox_sede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbox_j, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbox_sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbox_aula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbox_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbox_alum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb7))
                .addGap(56, 56, 56)
                .addComponent(btnRegistrar)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbox_carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_carreraActionPerformed
        try {
            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select codigo_carrera from carreras where nombre_carrera= ?");
            pst.setString(1, cbox_carrera.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                lb1.setText(rs.getString("codigo_carrera"));

            } else {

            }
            cbox_curso.removeAllItems();
            cbox_curso.addItem("Seleccione una opción");
            PreparedStatement pst6 = cn.prepareStatement("select nombre_curso from cursos where codigo_carrera=?");
            pst6.setString(1, lb1.getText());
            ResultSet rs6 = pst6.executeQuery();

            while (rs6.next()) {
                cbox_curso.addItem(rs6.getString("nombre_curso"));
            }

            cbox_sede.setEnabled(true);

        } catch (Exception e) {

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_carreraActionPerformed

    private void cbox_sedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_sedeActionPerformed

        try {
            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select codigo_sede from sedes where nombre_sede= ?");
            pst.setString(1, cbox_sede.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                lb2.setText(rs.getString("codigo_sede"));

            } else {

            }
            cbox_j.setEnabled(true);
        } catch (Exception e) {

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_sedeActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        try {
            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("insert into asignacioncursosmastros values(?,?,?,?,?,?,?,?)");
            pst.setString(1, txt_id.getText().trim());
            pst.setString(2, lb1.getText().trim());
            pst.setString(3, lb2.getText().trim());
            pst.setString(4, lb3.getText().trim());
            pst.setString(5, lb4.getText().trim());
            pst.setString(6, lb5.getText().trim());
            pst.setString(7, lb6.getText().trim());
            pst.setString(8, lb7.getText().trim());

            pst.executeUpdate();
           
            JOptionPane.showMessageDialog(this, "¡REGISTRO EXITOSO!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

            txt_id.setText("");
            lb1.setText("");
            lb2.setText("");
            lb3.setText("");
            lb4.setText("");
            lb5.setText("");
            lb6.setText("");
            lb7.setText("");
            cbox_j.setSelectedIndex(0);
            cbox_curso.setSelectedIndex(0);
            cbox_sede.setSelectedIndex(0);
            cbox_carrera.setSelectedIndex(0);
            cbox_alum.setSelectedIndex(0);
            cbox_sec.setSelectedIndex(0);
            cbox_aula.setSelectedIndex(0);

            cbox_j.setEnabled(false);
            cbox_curso.setEnabled(false);
            cbox_sede.setEnabled(false);
            cbox_alum.setEnabled(false);
            cbox_sec.setEnabled(false);
            cbox_aula.setEnabled(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "¡REGITRO FALLIDO!", "Error", JOptionPane.ERROR_MESSAGE);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String buscar = txtbuscado.getText().trim();
        if (buscar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡No se ingreso el campo de busqueda!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select * from asignacioncursosmastros where id_Maestro = ?");
            pst.setString(1, txtbuscado.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txt_id.setText(rs.getString("id_Maestro"));
                lb1.setText(rs.getString("codigo_carrera"));
                lb2.setText(rs.getString("codigo_sede"));
                lb3.setText(rs.getString("codigo_jornada"));
                lb4.setText(rs.getString("codigo_seccion"));
                lb5.setText(rs.getString("codigo_aula"));
                lb6.setText(rs.getString("codigo_curso"));
                lb7.setText(rs.getString("codigo_maestro"));

                btnEliminar.setEnabled(true);
                btnModificar.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, " no registrado.");
            }

            PreparedStatement pst1 = cn.prepareStatement("select nombre_carrera from carreras where codigo_carrera=?");
            pst1.setString(1, lb1.getText().trim());
            ResultSet rs1 = pst1.executeQuery();

            PreparedStatement pst2 = cn.prepareStatement("select nombre_sede from sedes where codigo_sede=?");
            pst2.setString(1, lb2.getText().trim());
            ResultSet rs2 = pst2.executeQuery();

            PreparedStatement pst3 = cn.prepareStatement("select nombre_jornada from jornadas where codigo_jornada=?");
            pst3.setString(1, lb3.getText().trim());
            ResultSet rs3 = pst3.executeQuery();

            PreparedStatement pst4 = cn.prepareStatement("select nombre_seccion from secciones where codigo_seccion=?");
            pst4.setString(1, lb4.getText().trim());
            ResultSet rs4 = pst4.executeQuery();

            PreparedStatement pst5 = cn.prepareStatement("select nombre_aula from aulas where codigo_aula=?");
            pst5.setString(1, lb5.getText().trim());
            ResultSet rs5 = pst5.executeQuery();

            PreparedStatement pst6 = cn.prepareStatement("select nombre_curso from cursos where codigo_curso=?");
            pst6.setString(1, lb2.getText().trim());
            ResultSet rs6 = pst6.executeQuery();

            PreparedStatement pst7 = cn.prepareStatement("select nombre_maestro from maestros where codigo_maestro=?");
            pst7.setString(1, lb2.getText().trim());
            ResultSet rs7 = pst7.executeQuery();

            while (rs1.next()) {
                cbox_carrera.setSelectedItem(rs1.getString("nombre_carrera"));
            }
            while (rs2.next()) {
                cbox_sede.setSelectedItem(rs2.getString("nombre_sede"));
            }
            while (rs3.next()) {
                cbox_j.setSelectedItem(rs3.getString("nombre_jornada"));
            }
            while (rs4.next()) {
                cbox_sec.setSelectedItem(rs4.getString("nombre_seccion"));
            }
            while (rs5.next()) {
                cbox_aula.setSelectedItem(rs5.getString("nombre_aula"));
            }
            while (rs6.next()) {
                cbox_curso.setSelectedItem(rs6.getString("nombre_curso"));
            }
            while (rs7.next()) {
                cbox_alum.setSelectedItem(rs7.getString("nombre_maestro"));
            }

            cbox_j.setEnabled(true);
            cbox_curso.setEnabled(true);
            cbox_sede.setEnabled(true);
            cbox_alum.setEnabled(true);
            cbox_sec.setEnabled(true);
            cbox_aula.setEnabled(true);

        } catch (Exception err) {
            err.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbox_aulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_aulaActionPerformed
        try {
            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select codigo_aula from aulas where nombre_aula= ?");
            pst.setString(1, cbox_aula.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                lb5.setText(rs.getString("codigo_aula"));

            } else {

            }
            cbox_curso.setEnabled(true);
        } catch (Exception e) {

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_aulaActionPerformed

    private void cbox_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_cursoActionPerformed
        try {
            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select codigo_curso from cursos where nombre_curso= ?");
            pst.setString(1, cbox_curso.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                lb6.setText(rs.getString("codigo_curso"));

            } else {

            }
            cbox_alum.setEnabled(true);
        } catch (Exception e) {

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_cursoActionPerformed

    private void cbox_alumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_alumActionPerformed
        try {
            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select codigo_maestro from maestros where nombre_maestro= ?");
            pst.setString(1, cbox_alum.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                lb7.setText(rs.getString("codigo_maestro"));

            } else {

            }

        } catch (Exception e) {

        }    // TODO add your handling code here:
    }//GEN-LAST:event_cbox_alumActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("delete from asignacioncursosmastros where id_Maestro = ?");

            pst.setString(1, txtbuscado.getText().trim());
            pst.executeUpdate();
           
            txtbuscado.setText("");

            JOptionPane.showMessageDialog(this, "REGISTRO ELIMINADO.", "Exito", JOptionPane.INFORMATION_MESSAGE);
            btnEliminar.setEnabled(false);
            btnModificar.setEnabled(false);

            txt_id.setText("");

            lb1.setText("");
            lb2.setText("");
            lb3.setText("");
            lb4.setText("");
            lb5.setText("");
            lb6.setText("");
            lb7.setText("");
            cbox_carrera.setSelectedIndex(0);
            cbox_j.setSelectedIndex(0);
            cbox_aula.setSelectedIndex(0);
            cbox_alum.setSelectedIndex(0);
            cbox_sec.setSelectedIndex(0);
            cbox_sede.setSelectedIndex(0);
            cbox_curso.setSelectedIndex(0);
            txtbuscado.setText("");

            cbox_j.setEnabled(false);
            cbox_curso.setEnabled(false);
            cbox_sede.setEnabled(false);
            cbox_alum.setEnabled(false);
            cbox_sec.setEnabled(false);
            cbox_aula.setEnabled(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en la eliminación de registros.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            String codigo = txtbuscado.getText().trim();

            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("update asignacioncursosmastros set codigo_carrera = ? , codigo_sede= ? , codigo_jornada=? , codigo_seccion= ?, codigo_aula= ?,codigo_curso= ?,codigo_maestro= ? where id_Alumno = " + codigo);

            pst.setString(1, lb1.getText().trim());
            pst.setString(2, lb2.getText().trim());
            pst.setString(3, lb3.getText().trim());
            pst.setString(4, lb4.getText().trim());
            pst.setString(5, lb5.getText().trim());
            pst.setString(6, lb6.getText().trim());
            pst.setString(7, lb7.getText().trim());

            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "MODIFICACION EXITOSA.", "Exito", JOptionPane.INFORMATION_MESSAGE);

            btnEliminar.setEnabled(false);
            btnModificar.setEnabled(false);
            txt_id.setText("");

            lb1.setText("");
            lb2.setText("");
            lb3.setText("");
            lb4.setText("");
            lb5.setText("");
            lb6.setText("");
            lb7.setText("");
            cbox_carrera.setSelectedIndex(0);
            cbox_j.setSelectedIndex(0);
            cbox_aula.setSelectedIndex(0);
            cbox_alum.setSelectedIndex(0);
            cbox_sec.setSelectedIndex(0);
            cbox_sede.setSelectedIndex(0);
            cbox_curso.setSelectedIndex(0);
            txtbuscado.setText("");

            cbox_j.setEnabled(false);
            cbox_curso.setEnabled(false);
            cbox_sede.setEnabled(false);
            cbox_alum.setEnabled(false);
            cbox_sec.setEnabled(false);
            cbox_aula.setEnabled(false);

        } catch (Exception e) {
            System.out.println(e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void cbox_jActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_jActionPerformed
        try {
            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select codigo_jornada from jornadas where nombre_jornada= ?");
            pst.setString(1, cbox_j.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                lb3.setText(rs.getString("codigo_jornada"));

            } else {

            }
            cbox_sec.setEnabled(true);
        } catch (Exception e) {

        }        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_jActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void cbox_secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_secActionPerformed
        try {
            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select codigo_seccion from secciones where nombre_seccion= ?");
            pst.setString(1, cbox_sec.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                lb4.setText(rs.getString("codigo_seccion"));

            } else {

            }
            cbox_aula.setEnabled(true);
        } catch (Exception e) {

        }  // TODO add your handling code here:
    }//GEN-LAST:event_cbox_secActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbox_alum;
    private javax.swing.JComboBox<String> cbox_aula;
    private javax.swing.JComboBox<String> cbox_carrera;
    private javax.swing.JComboBox<String> cbox_curso;
    private javax.swing.JComboBox<String> cbox_j;
    private javax.swing.JComboBox<String> cbox_sec;
    private javax.swing.JComboBox<String> cbox_sede;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txtbuscado;
    // End of variables declaration//GEN-END:variables
}