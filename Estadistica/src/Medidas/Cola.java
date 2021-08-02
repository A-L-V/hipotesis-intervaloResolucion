package Medidas;

import java.text.DecimalFormat;

public class Cola {

    private double cola[];

    private int ultimo;
    private String estado; //muestra o poblacion
    DecimalFormat df = new DecimalFormat("#.000");

    public Cola(int n) {
        cola = new double[n];
        vaciar();
    }

    public void vaciar() {
        ultimo = -1;
    }

    public void setDecimales(int a) {
        String txto = "#.";
        for (int i = 0; i < a; i++) {
            txto += "0";
        }
        df = new DecimalFormat(txto);
    }

    public void adicionar(double valor) {
        int indMax = cola.length - 1;
        if (ultimo < indMax) {
            ultimo++;
            int i = 0;
            while (valor > cola[i] && i < ultimo) {
                i++;
            }
            for (int j = ultimo; j > i; j--) {
                cola[j] = cola[j - 1];
            }
            cola[i] = valor;
        }
    }

    public void eliminar(double valor) {
        if (ultimo > -1) {
            int i = 0;
            while (valor != cola[i] && i < ultimo) {
                i++;
            }
            if (valor == cola[i]) {
                for (int j = i; j <= ultimo; j++) {
                    cola[j] = cola[j + 1];
                }
                ultimo--;
            }
        } else {
            vaciar();
        }
    }

    public double hallarMediaNoAgrupados() {
        double media = 0;
        for (int i = 0; i <= ultimo; i++) {
            media = media + cola[i];
        }
        media = media / (ultimo + 1);
        return Double.parseDouble(df.format(media));
    }

    public String mostrarMedia() {
        String media = "\\begin{align}";
        if (estado == "muestra") {
            media += " \\bar{X} = \\\\";
        } else {
            media += "\\mu = \\\\";
        }
        String suma = "";
        for (int i = 0; i <= ultimo; i++) {
            suma += +cola[i] + "+";
        }
        suma = suma.substring(0, suma.length() - 1);
        media += "\\frac{" + suma + "}{" + (ultimo + 1) + "}";
        media += " = " + hallarMediaNoAgrupados() + " \\end{align}";
        return media;
    }

    public double hallarMedianaNoAgrupados() {
        double mediana;
        if ((ultimo + 1) % 2 == 0) {
            mediana = (cola[((ultimo + 1) / 2) - 1] + cola[(ultimo + 1) / 2]) / 2;
        } else {
            mediana = cola[(((ultimo + 1) + 1) / 2) - 1];
        }

        return mediana;
    }

    public String mostrarMediana() {
        return hallarMedianaNoAgrupados() + "";
    }

    public double hallarModaNoAgrupados() {
        double numero = 0, moda = 0, rep = 0;
        for (int i = 0; i <= ultimo; i++) {
            numero = cola[i];
            if (rep < cantidadRepeti(numero)) {
                rep = cantidadRepeti(numero);
                moda = cola[i];
            }
        }
        return moda;
    }

    public String mostrarModa() {
        double moda = hallarModaNoAgrupados();
        return moda + " se repite " + cantidadRepeti(moda);
    }

    public double cantidadRepeti(double num) {
        int x = 0;
        for (int i = 0; i <= ultimo; i++) {
            if (num == cola[i]) {
                x++;
            }
        }
        return x;
    }

    public double hallarVarianzaNoAgrupados() {
        double S = 0;
        double media = hallarMediaNoAgrupados();
        for (int i = 0; i <= ultimo; i++) {
            S = ((cola[i] - media) * (cola[i] - media)) + S;
        }
        if (estado == "muestra") {
            S = S / ((ultimo + 1) - 1);
        } else {
            S = S / (ultimo + 1);
        }
        return Double.parseDouble(df.format(S));
    }

    public String mostrarVarianza() {
        String S = "\\begin{align}  ";
        if (estado == "muestra") {
            S += " S^2 = \\\\";
        } else {
            S += " \\sigma^2 = \\\\";
        }
        S += "\\frac{ ";
        double media = hallarMediaNoAgrupados();
        for (int i = 0; i <= ultimo; i++) {
            S += "(" + (cola[i] + "-" + media) + ")^2 +";
            if ((i + 1) % 5 == 0) {
                S += " \\\\ ";
            }
        }
        S += "}{";
        if (estado == "muestra") {
            S += (ultimo + 1) + " - 1 }";
        } else {
            S += (ultimo + 1) + "}";
        }
        S += " \\\\ = " + hallarVarianzaNoAgrupados() + " \\end{align}";
        return S;
    }

    public double hallarDesviacionNoAgrupados() {
        return Double.parseDouble(df.format(Math.sqrt(hallarVarianzaNoAgrupados())));
    }

    public String mostrarDesviacion() {
        String S = "\\begin{align}  ";
        double varianza = hallarVarianzaNoAgrupados();
        if (estado == "muestra") {
            S += " S = \\sqrt{" + varianza + "^2} =";
        } else {
            S += " \\sigma = \\sqrt{" + varianza + "^2} =";
        }
        S += hallarDesviacionNoAgrupados() + " \\end{align}";
        return S;
    }

    public double hallarCoeficienteVariaciónNoAgrupados() {
        return Double.parseDouble(df.format(hallarDesviacionNoAgrupados() * 100 / hallarMediaNoAgrupados()));
    }

    public String mostrarCoeficiente() {
        String CV = "\\begin{align} CV =  ";
        double desviacion = hallarDesviacionNoAgrupados();
        double media = hallarMediaNoAgrupados();
        CV += "\\frac{" + desviacion + "*100}{" + media + "} =";
        CV += hallarCoeficienteVariaciónNoAgrupados() + "% \\end{align}";
        return CV;
    }

    public String mostrarPercentil(double percentil) {
        String p = "\\begin{align}";
        if (percentil >= 0 && percentil <= 1) {
            double posicion = percentil*((ultimo+1)+1);
            int posInt = (int) (Math.floor(posicion));
            p += "Posicion  = \\frac{" + percentil*100 + "(" + (ultimo + 1) + "+1)}{100} = " + posicion + "\\\\";
            if (posInt - posicion == 0.0) {
                p +=  cola[posInt];
                return p + " \\end{align}";
            } else { 
                double entero = cola[posInt];
                p += "L_i = " + entero + "\\\\";
                double decimal = posicion-posInt;
                p += "PD = " + posicion + "-" + posInt + " = " + decimal + "\\\\";
                double delantera = cola[posInt+1];
                p += "L_d = " + delantera + "\\\\";
                double razon = delantera - entero;
                p += "P_k = " + entero + "+" + decimal + "*(" + delantera + "-" + entero + ") = ";
                double valor = entero + (razon * decimal);
                return p + df.format(valor) + "\\end{align}";
            }
        }
        return "";
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String toString() {
        String texto = "";
        for (int i = 0; i <= ultimo; i++) {
            texto += cola[i] + ", ";
        }
        return texto;
    }
}
