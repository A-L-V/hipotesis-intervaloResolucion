/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Independencia;

import general.seeText;
import java.awt.Image;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class interfaz extends javax.swing.JFrame {

    int colum = 2;
    int rows = 2;
    int decimal;
    double a;
    Independencia indepe;
    seeText vista;

    public interfaz() {
        initComponents();
        vista = new seeText();
        ImageIcon icon = null;
        icon = new ImageIcon("derechaChi.png");
        Image conversion = icon.getImage();
        Image tamaño = conversion.getScaledInstance(300, 200, Image.SCALE_SMOOTH);
        ImageIcon fin = new ImageIcon(tamaño);
        Timagen.setIcon(fin);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableValores = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaFormu = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        Timagen = new javax.swing.JLabel();
        txtDecimal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtLibertad = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtChi = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        txtValorChi = new javax.swing.JTextField();
        txtResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableValores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "x1 a ", "x1 b"
            }
        ));
        jScrollPane1.setViewportView(tableValores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 280, 80));

        jButton1.setText("Andir Columna");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 64, -1, -1));

        jButton2.setText("Anadir fila");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jButton3.setText("quitar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 64, -1, -1));

        jButton4.setText("quitar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        jButton5.setText("Agregar valores");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel1.setText("Paso 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 22, -1, -1));

        jLabel2.setText("HN; el x1 y el x2 estan relacionados(dependientes)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 6, -1, -1));

        jLabel3.setText("HA; el x1 y el x2 no estan relacionados(independientes)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 27, -1, -1));

        jLabel4.setText("Paso 2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        txtA.setText("0.05");
        getContentPane().add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 57, -1));

        jButton6.setText("enviar a");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        jLabel5.setText("Paso 3");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 64, -1, -1));

        tablaFormu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "orden", "observados", "esperado formula", "esperado", "formula formula", "formula"
            }
        ));
        jScrollPane2.setViewportView(tablaFormu);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 580, 216));

        jButton7.setText("Ejecutar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));
        getContentPane().add(Timagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 320, 190));

        txtDecimal.setText("3");
        getContentPane().add(txtDecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 30, -1));

        jLabel7.setText("decimales");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, -1, -1));
        getContentPane().add(txtLibertad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 240, 30));

        jButton8.setText("Paso 4");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("=INV.CHICUAD(a;gl): \nsolo 3 decimales\n");
        jScrollPane3.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 220, 80));
        getContentPane().add(txtChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 260, 60));

        jButton9.setText("resultado");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 100, -1));
        getContentPane().add(txtValorChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 110, -1));
        getContentPane().add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 130, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        colum++;
        DefaultTableModel modelo = (DefaultTableModel) tableValores.getModel();
        modelo.addColumn(colum);
        tableValores.setModel(modelo);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableValores.getModel();
        model.addRow(new Object[rows]);
        rows++;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        colum--;
        DefaultTableModel modelo = (DefaultTableModel) tableValores.getModel();
        modelo.setColumnCount(colum);
        tableValores.setModel(modelo);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        rows--;
        DefaultTableModel model = (DefaultTableModel) tableValores.getModel();
        model.setRowCount(rows);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton1.doClick();
        jButton2.doClick();
        double[][] valor = new double[rows][colum];
        double suma3 = 0;
        for (int i = 0; i < rows - 1; i++) {
            double suma = 0;
            for (int j = 0; j < colum - 1; j++) {
                suma = Double.parseDouble((String) tableValores.getValueAt(i, j)) + suma;
            }
            tableValores.setValueAt(suma, i, colum - 1);
            suma3 = suma3 + suma;
        }
        for (int i = 0; i < colum - 1; i++) {
            double suma = 0;
            for (int j = 0; j < rows - 1; j++) {
                suma = Double.parseDouble((String) tableValores.getValueAt(j, i)) + suma;
            }
            tableValores.setValueAt(suma, rows - 1, i);

        }

        tableValores.setValueAt(suma3, rows - 1, colum - 1);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colum; j++) {
                valor[i][j] = Double.parseDouble("" + tableValores.getValueAt(i, j));
            }
        }
        indepe.setValores(valor, colum - 1, rows - 1);
        jButton7.doClick();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        indepe = new Independencia();
        a = Double.parseDouble(txtA.getText());
        indepe.setDecimales(Integer.parseInt(txtDecimal.getText()));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int orden = (colum - 1) * (rows - 1);
        DefaultTableModel model = (DefaultTableModel) tablaFormu.getModel();
        model.setNumRows(orden);
        int indice = 0;
        double sumaTotal = 0;
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < colum - 1; j++) {
                tablaFormu.setValueAt(indice + 1, indice, 0);
                tablaFormu.setValueAt(indepe.setObser(indice), indice, 1);
                tablaFormu.setValueAt(indepe.setForEspe(i, j), indice, 2);
                tablaFormu.setValueAt(indepe.setEsperado(i, j), indice, 3);
                tablaFormu.setValueAt(indepe.setFormForm(i, j), indice, 4);
                tablaFormu.setValueAt(indepe.setFormula(i, j), indice, 5);
                sumaTotal += indepe.setFormula(i, j);
                indice++;
            }
        }
        model.addRow(new Object[1]);
        model.setValueAt(sumaTotal, model.getRowCount() - 1, 5);
        jButton8.doClick();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int libertad = (colum - 2) * (rows - 2);
        txtLibertad.setText("gl = (" + (colum - 2) + "-1)*(" + (rows - 2) + "-1) =" + libertad);
        txtChi.setIcon(vista.getIconLaTex("X^2{(1-" + a + "," + libertad + ")}", 25));
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        double chi = Double.parseDouble(txtValorChi.getText());
        double total = (double) tablaFormu.getValueAt(tablaFormu.getRowCount() - 1, tablaFormu.getColumnCount() - 1);
        if (chi <= total) {
            txtResultado.setText("RECHAZA");
        } else {
            txtResultado.setText("NO RECHAZA");
        }

    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Timagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tablaFormu;
    private javax.swing.JTable tableValores;
    private javax.swing.JTextField txtA;
    private javax.swing.JLabel txtChi;
    private javax.swing.JTextField txtDecimal;
    private javax.swing.JLabel txtLibertad;
    private javax.swing.JLabel txtResultado;
    private javax.swing.JTextField txtValorChi;
    // End of variables declaration//GEN-END:variables
}
