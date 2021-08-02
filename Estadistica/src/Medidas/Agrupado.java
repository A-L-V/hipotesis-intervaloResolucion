/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medidas;

/**
 *
 * @author josue
 */
public class Agrupado {

    double[][] valores;
    String estado; //muestra | poblacion

    public Agrupado(int filas, String estado) {
        valores = new double[filas][3];
        this.estado = estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getN() {
        double n = 0;
        for (int i = 0; i < valores.length; i++) {
            n += valores[i][2];
        }
        return n;
    }

    public void setLimiteInferior(double valor, int posicion) {
        valores[posicion][0] = valor;
    }

    public void setLimiteSuperior(double valor, int posicion) {
        valores[posicion][1] = valor;
    }

    public void setFrecuencia(double valor, int posicion) {
        valores[posicion][2] = valor;
    }

    public double getFrecuencia(int posicion) {
        return valores[posicion][2];
    }

    public double getMcf(int posicion) {
        return ((valores[posicion][0] + valores[posicion][1]) / 2) * valores[posicion][2];
    }

    public double sumaMcfi() {
        double total = 0;
        for (int i = 0; i < valores.length; i++) {
            total += getMcf(i);
        }
        return total;
    }

    public double hallarMedia() {
        double sumaMCfi = sumaMcfi();
        double N = getN();
        return sumaMCfi / N;
    }

    public String mostrarMediaAgrupado() {
        String media = "\\begin{align}";
        if (estado == "muestra") {
            media += " \\bar{X} = ";
        } else {
            media += "\\mu = ";
        }
        double sumaMCfi = sumaMcfi();
        double N = getN();
        double suma = sumaMCfi / N;

        media += "\\frac{" + sumaMCfi + "}{" + N + "}";
        media += " = " + suma + " \\end{align}";
        return media;
    }

    public String mostrarMedianaAgrupado() {
        String mediana = "\\begin{align}";
        double N = getN();
        double Me;
        double posicion;
        double frecAcumulada = 0;
        int i = 0;
        if (N % 2 == 0) {
            posicion = N / 2;
            mediana += "posicion = \\frac{" + N + "}{2} =" + posicion + "\\\\";
        } else {
            posicion = (N + 1) / 2;
            mediana += "posicion = \\frac{" + N + "+1}{2} =" + posicion;
        }
        do {
            frecAcumulada += getFrecuencia(i);
            i++;
        } while (frecAcumulada < posicion);
        i--;
        if (frecAcumulada == posicion) {
            Me = valores[i][1];
            mediana = "\\\\ Me =  " + Me;
        } else {
            double Li = valores[i][0];
            double fi = getFrecuencia(i);
            double Fiant = 0;
            double amplitud = valores[i][1] - valores[i][0];
            mediana += "amplitud: " + valores[i][1] + "-" + valores[i][0] + "= " + amplitud + "\\\\";
            int j = 0;
            while (j <= i - 1) {
                Fiant += getFrecuencia(j);
                j++;
            }
            Me = (Li + amplitud * ((N / 2 - Fiant) / fi));
            mediana += "Me = " + Li + "+" + amplitud + "*(\\frac{\\frac{" + N + "}{2}-" + Fiant + "}{" + fi + "}) = " + Me;
            mediana += "\\end{align}";
        }
        return mediana;
    }

    public String mostrarModaAgrupado() {
        String moda = "\\begin{align}";
        double Mo;
        int posicion = 0;
        double mayor = getFrecuencia(0);
        for (int i = 1; i < valores.length; i++) {
            double frecuencia = getFrecuencia(i);
            if (mayor < frecuencia) {
                mayor = frecuencia;
                posicion++;
            }
        }
        double amplitud = valores[posicion][1] - valores[posicion][0];
        double Li = valores[posicion][0];
        double fi = valores[posicion][2];
        double fiAnt = 0;
        double fiDes = 0;
        if (posicion > 0) {
            fiAnt = valores[posicion - 1][2];
        }
        if (posicion < valores.length) {
            fiDes = valores[posicion + 1][2];
        }
        double d1 = fi - fiAnt;
        moda += "d1 = " + fi + "-" + fiAnt + "=" + d1;
        double d2 = fi - fiDes;
        moda += "    d2 = " + fi + "-" + fiDes + "=" + d2 + "\\\\";
        Mo = Li + amplitud * (d1 / (d1 + d2));
        moda += "Mo = " + Li + "+" + amplitud + "*(\\frac{" + d1 + "}{" + d1 + "+" + d2 + "}) = " + Mo;
        return moda + "\\end{align}";
    }

    public String mostrarVarianzaAgrupado(double acum) {
        String varianza = mostrarMediaAgrupado().substring(0, mostrarMediaAgrupado().length() - 13) + "\\\\";
        double N = getN();
        double nEstado = 0;
        String nEst = "";
        if (estado == "muestra") {
            nEstado = N - 1;
            varianza += " S^2 = ";
            nEst = N + "-1";
        } else {
            nEstado = N;
            varianza += " \\sigma^2 = ";
            nEst = N + "";
        }
        double valor = acum / nEstado;
        varianza += " \\frac{" + acum + "}{" + nEst + "}";
        varianza += " = " + valor + " \\end{align}";
        return varianza;
    }

    public double hallarVarianza(double acum) {
        double N = getN();
        double nEstado = 0;
        if (estado == "muestra") {
            nEstado = N - 1;
        } else {
            nEstado = N;
        }
        return acum / nEstado;
    }

    public String mostrarDesviacionAgrupado(double acum) {
        double varianza = hallarVarianza(acum);
        double desviacion = Math.sqrt(varianza);
        if (estado == "muestra") {
            return "S = \\sqrt{" + varianza + "} = " + desviacion;
        } else {
            return "\\sigma = \\sqrt{" + varianza + "} = " + desviacion;
        }
    }

    public String mostrarCoeficienteAgrupado(double acum) {
        double varianza = hallarVarianza(acum);
        double media = hallarMedia();
        double desviacion = Math.sqrt(varianza);
        double Cv = desviacion * 100 / media;
        if (estado == "muestra") {
            return "CV = \\frac{" + desviacion + "*100}{" + media + "} = " + Cv+"%";
        } else {
            return "CV = \\frac{" + desviacion + "*100}{" + media + "} = " + Cv+"%";
        }
    }

    public String mostrarPercentilAgrupado(double p) {
        double N = getN();
        String percentil = "\\begin{align}";
        double posicion = p * N;
        percentil += "Posicion = \\frac{"+p*100+"*"+N+"}{100} = "+posicion+" \\\\";
        int i = 0;
        double valor;
        double x = 0;
        do {
            x += getFrecuencia(i);
            i++;
        } while (x < posicion);
        i--;
        if (posicion == x) {
            valor= valores[i][1];
            percentil += "P_"+p+"=" +valor;
        } else {
            double Li = valores[i][0];
            double amplitud = valores[i][1] - valores[i][0];
            double fi = valores[i][2];
            double Fiant = 0;
            if (i > 0) {
                Fiant = x - fi;
            }
            valor = Li + amplitud * ((posicion - Fiant) / (x- Fiant));
            percentil += "P_{"+(p*100) +"} ="+ Li+"+"+amplitud+"*(\\frac{"+posicion+"-"+Fiant+"}{"+x+"-"+Fiant+"}) =" +valor;
        }
        return percentil + "\\end{align}";
    }

}
