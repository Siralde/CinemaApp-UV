/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ticketcine.Vista;

import javax.swing.JOptionPane;
import ticketcine.Controlador.Cliente;

/**
 *
 * @author arant
 */
public class PasesEntradas extends javax.swing.JFrame {

    private Cliente cliente;
    private ConsultarCines2 Vanterior;
    private Object pase_a_comprar;
    private Object num_ent_comprar;
    private Object peliAct;
    private Object cineAct;
    
    public PasesEntradas(Cliente cliente, Object cine, Object pelicula, ConsultarCines2 Vanterior){
        initComponents();
        this.cliente = cliente;
        this.Vanterior = Vanterior;
        this.cineAct = cine;
        this.peliAct = pelicula;
        
        this.labelNombrePelicula.setText(pelicula.toString());
        
        comboPase.removeAllItems();
        for(Object item : this.cliente.consultarPases(cine, pelicula))
        {
            comboPase.addItem(item);
        };   
        
        comboNumeroEntradas.removeAllItems();
        for(int i = 1 ; i <= 8; i++)
        {
            comboNumeroEntradas.addItem(Integer.toString(i));
        }
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPelicula = new javax.swing.JLabel();
        labelPase = new javax.swing.JLabel();
        labelNumeroEntradas = new javax.swing.JLabel();
        comboPase = new javax.swing.JComboBox<>();
        botonResumen = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();
        comboNumeroEntradas = new javax.swing.JComboBox<>();
        labelNombrePelicula = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sesiones ");

        labelPelicula.setText("Película:");

        labelPase.setText("Seleccione un pase:");

        labelNumeroEntradas.setText("Seleccione un número de entradas:");

        comboPase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboPase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPaseActionPerformed(evt);
            }
        });

        botonResumen.setText("VER RESUMEN");
        botonResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResumenActionPerformed(evt);
            }
        });

        botonAtras.setText("ATRÁS");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        comboNumeroEntradas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboNumeroEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNumeroEntradasActionPerformed(evt);
            }
        });

        labelNombrePelicula.setText("label1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(471, Short.MAX_VALUE)
                .addComponent(botonResumen)
                .addGap(85, 85, 85)
                .addComponent(botonAtras)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelNombrePelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelNumeroEntradas)
                    .addComponent(labelPelicula)
                    .addComponent(labelPase)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(comboNumeroEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(comboPase, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(531, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(labelPelicula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNombrePelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(labelPase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboPase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(labelNumeroEntradas)
                .addGap(18, 18, 18)
                .addComponent(comboNumeroEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAtras)
                    .addComponent(botonResumen))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResumenActionPerformed
        float precio;
        int num_ent = Integer.parseInt( (String) this.num_ent_comprar );

        
        if(this.pase_a_comprar != null && this.num_ent_comprar != null)
        {
            precio = this.cliente.comprobarNumeroEntradas(this.pase_a_comprar, num_ent);
            
            if(precio == 0)
            {
                JOptionPane.showMessageDialog(this, "Lo sentimos, no nos quedan asientos disponibles para este pase");
            }
            else if(precio < 0)
            {
                 JOptionPane.showMessageDialog(this, "Lo sentimos, solo nos quedan " + Math.round(Math.abs(precio)) + " asientos disponibles para el pase de esta pelicula");
            }
            else
            {
                ResumenCompra res = new ResumenCompra(this.cliente, this.cineAct, this.pase_a_comprar, num_ent, precio, this);
                res.setVisible(true);
                this.setVisible(false);   
            }
        }
        else if( this.pase_a_comprar == null)
        {
            JOptionPane.showMessageDialog(this, "Seleccione un pase");
        }
        else if( this.num_ent_comprar == null)
        {
            JOptionPane.showMessageDialog(this, "Seleccione un numero de entradas");
        }
        
    }//GEN-LAST:event_botonResumenActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        this.Vanterior.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void comboPaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPaseActionPerformed
        this.pase_a_comprar = comboPase.getSelectedItem();
    }//GEN-LAST:event_comboPaseActionPerformed

    private void comboNumeroEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNumeroEntradasActionPerformed
        this.num_ent_comprar = comboNumeroEntradas.getSelectedItem();
    }//GEN-LAST:event_comboNumeroEntradasActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonResumen;
    private javax.swing.JComboBox<String> comboNumeroEntradas;
    private javax.swing.JComboBox<Object> comboPase;
    private java.awt.Label labelNombrePelicula;
    private javax.swing.JLabel labelNumeroEntradas;
    private javax.swing.JLabel labelPase;
    private javax.swing.JLabel labelPelicula;
    // End of variables declaration//GEN-END:variables

    
     public void volverInicio() {
        this.Vanterior.volverInicio();
        this.dispose();
    }
    
}