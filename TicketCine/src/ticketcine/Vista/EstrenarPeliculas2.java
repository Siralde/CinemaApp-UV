/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketcine.Vista;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import ticketcine.Controlador.Gerente;

/**
 *
 * @author Juanxo
 */
public class EstrenarPeliculas2 extends javax.swing.JFrame {

    private Gerente gerente;
    private ArrayList salas;    
    private DefaultTableModel model;
    private EstrenarPeliculas1 vAnterior;
    private ArrayList<Object> salasElegidas = new ArrayList<>();
    private ArrayList<Object> pasesAnadidos = new ArrayList<>();

    /**
     * Creates new form EstrenarPeliculas2
     */
    public EstrenarPeliculas2(Gerente gerente, ArrayList salas, EstrenarPeliculas1 vAnterior) {
        this.gerente = gerente;
        this.salas = salas;
        this.vAnterior = vAnterior;
        
        
        model = new DefaultTableModel();
        model.addColumn("Fecha");
        model.addColumn("Hora");
        model.addColumn("Sala");
        
        initComponents();
        
        cmb_salas.removeAllItems();
        for(Object s : this.salas)
        {
            cmb_salas.addItem(s);
        }
        
        this.btn_finalizar.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmb_horas = new javax.swing.JComboBox<>();
        cmb_salas = new javax.swing.JComboBox<>();
        dchooser_fecha = new datechooser.beans.DateChooserCombo();
        btn_añadir = new javax.swing.JButton();
        btn_finalizar = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estrenar Película");

        jLabel1.setText("Seleccione una Fecha:");

        jLabel2.setText("Seleccione una Hora:");

        jLabel3.setText("Seleccione una Sala:");

        cmb_horas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "17:30", "18:00", "19:00", "20:30", "22:00", "22:30", "00:00" }));
        cmb_horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_horasActionPerformed(evt);
            }
        });

        cmb_salas.setModel(new DefaultComboBoxModel(salas.toArray()));
        cmb_salas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_salasActionPerformed(evt);
            }
        });

        btn_añadir.setText("Añadir");
        btn_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_añadirActionPerformed(evt);
            }
        });

        btn_finalizar.setText("Finalizar");
        btn_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finalizarActionPerformed(evt);
            }
        });

        btn_atras.setText("Atrás");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        jTable1.setModel(model);
        jTable1.setEnabled(false);
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(cmb_horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_salas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dchooser_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(105, Short.MAX_VALUE)
                        .addComponent(btn_añadir)
                        .addGap(134, 134, 134)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btn_finalizar)
                        .addGap(145, 145, 145)
                        .addComponent(btn_atras)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dchooser_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_salas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(261, 261, 261)
                                .addComponent(btn_añadir)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_finalizar)
                    .addComponent(btn_atras))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_salasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_salasActionPerformed
        
    }//GEN-LAST:event_cmb_salasActionPerformed

    private void btn_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finalizarActionPerformed
        this.vAnterior.volverInicio();
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btn_finalizarActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        gerente.eliminarPase(this.pasesAnadidos, this.salasElegidas);
        gerente.eliminarPelicula();
        this.vAnterior.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_añadirActionPerformed
        
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        Object h = cmb_horas.getSelectedItem();
        Date f = dchooser_fecha.getSelectedDate().getTime();
        String fordate = format.format(f);
        String hora = (String) h;
        String hh = hora.substring(0,2);
        String mm = hora.substring(3, 5);
        int hh1 = Integer.parseInt(hh);
        int mm1 = Integer.parseInt(mm);
        f.setHours(hh1);
        f.setMinutes(mm1);
        f.setSeconds(00);
        Object s = cmb_salas.getSelectedItem();
        String[] p = {fordate, h.toString(), s.toString()};
        
        this.salasElegidas.add(s);
        Object nuevoPase = gerente.registrarPase(f, h, s);
        this.pasesAnadidos.add(nuevoPase);
        
        btn_finalizar.setEnabled(true);
        salas = gerente.consultarSalasDisponibles(f, h);

        cmb_salas.removeAllItems();
        cmb_salas.setModel(new DefaultComboBoxModel(salas.toArray()));
        
        model.addRow(p);
    }//GEN-LAST:event_btn_añadirActionPerformed

    private void cmb_horasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_horasActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date f = dchooser_fecha.getSelectedDate().getTime();
        
        Object h = cmb_horas.getSelectedItem();
        String hora = (String) h;
        String hh = hora.substring(0,2);
        String mm = hora.substring(3, 5);
        int hh1 = Integer.parseInt(hh);
        int mm1 = Integer.parseInt(mm);
        f.setHours(hh1);
        f.setMinutes(mm1);
        f.setSeconds(00);
        
        salas = gerente.consultarSalasDisponibles(f, h);
        cmb_salas.removeAllItems();
        cmb_salas.setModel(new DefaultComboBoxModel(salas.toArray()));
    }//GEN-LAST:event_cmb_horasActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_añadir;
    private javax.swing.JButton btn_finalizar;
    private javax.swing.JComboBox<Object> cmb_horas;
    private javax.swing.JComboBox<Object> cmb_salas;
    private datechooser.beans.DateChooserCombo dchooser_fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
