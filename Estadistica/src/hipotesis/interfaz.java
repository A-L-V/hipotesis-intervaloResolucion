
package hipotesis;

import general.seeText;

public class interfaz extends javax.swing.JFrame {
hipotesis hipotesis;
    public interfaz() {
        this.formula = new seeText();
        initComponents();
    }
    seeText formula;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        IPoblacion = new javax.swing.JTextField();
        TeditEntrada = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        I1 = new javax.swing.JTextField();
        I2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TeditHipo1 = new javax.swing.JLabel();
        Idesconfianza = new javax.swing.JTextField();
        TeditHipo2 = new javax.swing.JLabel();
        TeditHipo0 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Timagen = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        TimagenForm = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Idecimales = new javax.swing.JTextField();
        Tedit1 = new javax.swing.JLabel();
        Itabla1 = new javax.swing.JTextField();
        Itabla2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        Tedit2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        TeditResultado = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuantitativa","Cualitativa","Varianza" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 30, -1, -1));
        getContentPane().add(IPoblacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 30, 40, -1));

        TeditEntrada.setText("ingresar: ");
        getContentPane().add(TeditEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 100, 180, 20));

        jLabel1.setText("Poblaciones 1 | 2");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 0, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<>", ">", "<" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 64, -1, -1));

        jButton1.setText("Enviar Valor: ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 170, -1, -1));
        getContentPane().add(I1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 140, 60, -1));

        I2.setEnabled(false);
        getContentPane().add(I2, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 140, 60, -1));

        jLabel2.setText("B");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 120, 10, -1));

        jLabel3.setText("A");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 120, -1, -1));

        jLabel5.setText("Paso 1: Plantear hipotesis");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel6.setText("Paso 2: Establecer a (sin %)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 170, 20));
        getContentPane().add(TeditHipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 64, 58, 30));

        Idesconfianza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdesconfianzaActionPerformed(evt);
            }
        });
        getContentPane().add(Idesconfianza, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 40, -1));
        getContentPane().add(TeditHipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 64, 61, 30));
        getContentPane().add(TeditHipo0, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 189, 32));

        jButton2.setText("Paso 3:");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 150, 30));

        jLabel7.setText("a = ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));
        getContentPane().add(Timagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 310, 200));

        jCheckBox1.setText("Varianza poblacional conocida");
        jCheckBox1.setEnabled(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 70, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 210, -1, 150));
        getContentPane().add(TimagenForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 230, 80));

        jLabel8.setText("cantidad de decimales");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 380, -1, -1));

        Idecimales.setText("4");
        getContentPane().add(Idecimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 380, 40, -1));
        getContentPane().add(Tedit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 172, 30));

        Itabla1.setEnabled(false);
        Itabla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Itabla1ActionPerformed(evt);
            }
        });
        getContentPane().add(Itabla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 70, -1));

        Itabla2.setEnabled(false);
        getContentPane().add(Itabla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 70, -1));

        jButton3.setText("Paso 4:");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 130, 20));
        getContentPane().add(Tedit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 190, 30));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("=DISTR.NORM.ESTAND.INV(a); solo 3 digitos\n//devolder valor fuera de la tabla\n=INV.T(a;gl): solo 4 decimales\n=INV.CHICUAD(a;gl): solo 3 decimales\n=INV.F(a;gl1;gl2): solo 2 decimales\n=F.inv(a,gl1,gl2); solo 2 decimales\nCon un nivel de desconfianza de a%, \nno hay evidencia para rechazar la hipotesis nula,\npor lo cual, la .... de .... es .... al ...");
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 280, 130));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 150, 40));

        jButton4.setText("Comprobar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 310, -1, -1));
        getContentPane().add(TeditResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 350, 90, 30));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Nota al cliente:\nPara un eficiente servicio, te consejamos:\nSi aparece un o^2, escribirlo con normalidad\nsi aparece un numero tipo: 15.0 no poner el decimal sobrante.\nalguna duda preguntar a tu coordinador");
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String tipo = (String) jComboBox1.getSelectedItem();
        jTextArea1.setText("");
        int poblacion = Integer.parseInt(IPoblacion.getText());
        if(tipo == "Cuantitativa"){
            jCheckBox1.setEnabled(true);
        }else{
            jCheckBox1.setEnabled(false);
        }
        if(poblacion==2) I2.setEnabled(true);
        else I2.setEnabled(false);
        hipotesis = new hipotesis(poblacion,tipo);
        hipotesis.llenarEntradas();
        TeditEntrada.setText("Ingresar:    " + hipotesis.getEntradas()[0]);
        if(poblacion==2) {
            jTextArea1.setText("(A)\t(B)\n");
        }else{
            jTextArea1.setText(hipotesis.getEntradas()[0]);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        String prueba = hipotesis.getPrueba();
        hipotesis.setPlanteo((String) jComboBox2.getSelectedItem());
        int poblacion = hipotesis.getPoblaciones();
        String texto0 = "";
        String texto1 = "";
        String texto2 = "";
        if(poblacion==2){
            texto2 = (prueba + "(B)");
            texto1 = (prueba + "(A)");
            if(jComboBox2.getSelectedItem() == "<>")
            texto0 = (prueba + "(A) = " +prueba + "(B)" );
            else if (jComboBox2.getSelectedItem() == ">")
            texto0 = (prueba + "(A) < " +prueba + "(B)" );
            else
            texto0 = (prueba + "(A) > " +prueba + "(B)" );
        }else{
            texto2 = (""+hipotesis.getValor1(1));
            texto1 = (prueba);
            if(jComboBox2.getSelectedItem() == "<>")
            texto0 = (prueba + "=" + hipotesis.getValor1(1));
            else if (jComboBox2.getSelectedItem() == ">")
            texto0 = (prueba + " < " + hipotesis.getValor1(1));
            else
            texto0 = (prueba + " > " +hipotesis.getValor1(1));
        }

        TeditHipo1.setIcon(formula.getIconLaTex(texto1,15));
        TeditHipo2.setIcon(formula.getIconLaTex(texto2,15));
        TeditHipo0.setIcon(formula.getIconLaTex(texto0,15));        
        hipotesis.setTabla();
        hipotesis.getImage(Timagen);
        hipotesis.setDecimales(Integer.parseInt(Idecimales.getText()));
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int n = hipotesis.getN();
        int inicio = hipotesis.getInicio() +1;

        if(inicio < n){

            int poblacion = hipotesis.getPoblaciones();
            if(poblacion==2)
            hipotesis.llenar2(Double.parseDouble(I2.getText()));
            hipotesis.llenar1(Double.parseDouble(I1.getText()));

            if(poblacion==2) {
                jTextArea1.append(hipotesis.getEntradas()[inicio] +"=" +hipotesis.getValor1(inicio)+ "\t");
                jTextArea1.append(hipotesis.getEntradas()[inicio] +"=" +hipotesis.getValor2(inicio) + "\n");
            }else {
                jTextArea1.append("=" + hipotesis.getValor1(inicio));
                if(inicio < n-1){
                    jTextArea1.append("\n" + hipotesis.getEntradas()[inicio+1]);
                }
            }
            if(inicio < n-1){
                TeditEntrada.setText("Ingresar:      " + hipotesis.getEntradas()[inicio+1]);
            }
            I1.setText("");
            I2.setText("");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void IdesconfianzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdesconfianzaActionPerformed

    }//GEN-LAST:event_IdesconfianzaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        hipotesis.setDesconfianza(Double.parseDouble(Idesconfianza.getText()));
        TimagenForm.setIcon(formula.getIconLaTex(hipotesis.formular()[0],20));
        String tipo = hipotesis.getTipo();
        int poblaciones = hipotesis.getPoblaciones();
        boolean varianzaPobCo = hipotesis.isVarianzaPobCo();
        if(tipo=="Cuantitativa" && poblaciones == 2 && varianzaPobCo==false)
            jLabel9.setIcon(formula.getIconLaTex("S_p^2 = " + hipotesis.decimales(hipotesis.spCuadrado()),15));
        else if(tipo=="Cualitativa" && poblaciones == 2)
            jLabel9.setIcon(formula.getIconLaTex("\\bar{p} =" + hipotesis.decimales(hipotesis.pConSombrero()),15));
        else jLabel9.setIcon(null); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        hipotesis.setVarianzaPobCo((jCheckBox1.isSelected()));
        hipotesis.llenarEntradas();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void Itabla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Itabla1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Itabla1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String planteo = hipotesis.getPlanteo();
        if(planteo == "<>"){
            Tedit1.setIcon(formula.getIconLaTex(hipotesis.getTablaFormula(1),15));
            Tedit2.setIcon(formula.getIconLaTex(hipotesis.getTablaFormula(2),15));
            Itabla2.setEnabled(true);
            Itabla1.setEnabled(true);   
        }else if(planteo == "<") {
            Tedit1.setIcon(formula.getIconLaTex(hipotesis.getTablaFormula(1),15));
            Tedit2.setIcon(null);
            Itabla1.setEnabled(true);
            Itabla2.setEnabled(false);
        }else {
            Tedit1.setIcon(null);
            Tedit2.setIcon(formula.getIconLaTex(hipotesis.getTablaFormula(2),15));
            Itabla2.setEnabled(true);
            Itabla1.setEnabled(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String planteo = hipotesis.getPlanteo();
        float formula = Float.parseFloat(hipotesis.formular()[1]);
        String comprobar = "No rechaza";
        if(planteo=="<>"){
            float valor1 = Float.parseFloat(Itabla1.getText());
            float valor2 = Float.parseFloat(Itabla2.getText());
            if(formula < valor1) comprobar = "Rechaza";
            else if(formula > valor2) comprobar = "Rechaza";
        }
        else if(planteo==">"){
            float valor = Float.parseFloat(Itabla2.getText());
            if(formula > valor) comprobar = "Rechaza";
        }
        else if(planteo=="<"){
            float valor = Float.parseFloat(Itabla1.getText());
            if(formula < valor) comprobar = "Rechaza";
        }
        TeditResultado.setText(comprobar);
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
    private javax.swing.JTextField I1;
    private javax.swing.JTextField I2;
    private javax.swing.JTextField IPoblacion;
    private javax.swing.JTextField Idecimales;
    private javax.swing.JTextField Idesconfianza;
    private javax.swing.JTextField Itabla1;
    private javax.swing.JTextField Itabla2;
    private javax.swing.JLabel Tedit1;
    private javax.swing.JLabel Tedit2;
    private javax.swing.JLabel TeditEntrada;
    private javax.swing.JLabel TeditHipo0;
    private javax.swing.JLabel TeditHipo1;
    private javax.swing.JLabel TeditHipo2;
    private javax.swing.JLabel TeditResultado;
    private javax.swing.JLabel Timagen;
    private javax.swing.JLabel TimagenForm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}