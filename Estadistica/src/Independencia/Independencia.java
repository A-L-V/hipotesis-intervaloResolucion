package Independencia;

import java.awt.Image;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Independencia {

    public double valores[][];
    double observados[];
    
    DecimalFormat df =new DecimalFormat("#.000");

    public Independencia() {
    }

    public void setValores(double[][] valores,int x,int y) {
        this.valores = valores;
        this.observados = new double[x * y];
        int index = 0;
        for (int i = 0; i < valores.length - 1; i++) {
            for (int j = 0; j < valores[i].length - 1; j++) {
                observados[index] = valores[i][j];
                index++;
            }
        }
    }    
    
    public void setDecimales(int a) {
        String txto = "#.";
        System.out.println(txto);
        for(int i= 0; i< a;i++){
            txto += "0";
        }
        System.out.println(txto);
        df =new DecimalFormat(txto);
    }
    
   
    public Independencia(double[][] valores, int x, int y) {
        this.valores = valores;
        this.observados = new double[x * y];
        int index = 0;
        for (int i = 0; i < valores.length - 1; i++) {
            for (int j = 0; j < valores[i].length - 1; j++) {
                observados[index] = valores[i][j];
                index++;
            }
        }
    }

    public double setObser(int i) {
        return observados[i];
    }

    public String setForEspe(int x, int y) {
        String form;
        double general = valores[valores.length - 1][valores[1].length - 1]; 
        form = valores[x][valores[y].length -   1] + "*" + valores[valores.length-1][y] + "/" + general;
        return "" + form;
    }

    public double setEsperado(int x, int y) {
        double form = 0;
        double general = valores[valores.length - 1][valores[1].length - 1];
        form = Double.parseDouble(df.format(valores[x][valores[y].length-1]*valores[valores.length-1][y]/general)); 
        return form;
    }

    public String setFormForm(int x, int y) {
        String form = "";
        double formEspe = setEsperado(x,y);
        form = valores[x][y] + "-" + formEspe + "^2" + "/" + formEspe;
        return form;
    }

    public double setFormula(int x, int y) {
        double formEspe = setEsperado(x,y);
        double form = Double.parseDouble(df.format(Math.pow(valores[x][y]-formEspe,2)/formEspe));
        return form;
    }

}
