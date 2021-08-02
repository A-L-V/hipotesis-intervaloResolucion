package hipotesis;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class hipotesis {
    
    private String entradas[];
    
    private double valores [];
    private double valores2[];
    private int n; //cantidad de valores que ingresan
    private int inicio;
    private int inicio2;
    
    private String hipotesis;
    private String tipo;    //Cuantita-Cualita-Varian
    private int poblaciones; //cantidad de 1 o 2 poblaciones
    private String prueba;// parametro poblacional
    private String planteo; // < > <>
    private String tabla; //Z T CHI ...
    private boolean varianzaPobCo = false;
    private double desconfianza;
    public int decimales;
    
    public hipotesis(int poblaciones, String tipo){
        int n = 4;
        if(tipo=="Cualitativa"){
            if(poblaciones == 1)
                n = 3;
            else 
                n = 4;
        }else if (tipo=="Varianza"){
            if(poblaciones == 2)
                n = 2;
            else
                n = 3;            
        }
        if(poblaciones==2){
            this.valores2 = new double [n];
            this.inicio2 = -1;
        }
        this.n = n;
        this.valores = new double [n];
        this.inicio = -1;
        this.entradas = new String [n];
        this.poblaciones = poblaciones;
        this.tipo = tipo;
    }
    
    public String getTablaFormula(int tipo) {
        String formula = "";
        switch (tabla){
            case "F":
                if(planteo=="<>") {
                    if(tipo == 1){
                        formula = "F(\\frac{" + desconfianza + "}{2};"+ this.getValor1(1) + "-1;" + this.getValor2(1) + "-1)";
                    }else {
                        formula = "F(1-\\frac{" + desconfianza + "}{2};" + this.getValor1(1) + "-1;" + this.getValor2(1) + "-1)";
                    }
                }
                else if(planteo==">") formula = "F(1-"+desconfianza + ";" + this.getValor1(1) + "-1;" + this.getValor2(1) + "-1)";
                else if(planteo=="<") formula = "F("+desconfianza + ";" + this.getValor1(1) + "-1;" + this.getValor2(1) + "-1)";
            break;
            case "CHI":
                if(planteo=="<>") {
                    if(tipo == 1){
                        formula = "X^2(\\frac{"+ desconfianza + "}{2};"+ this.getValor1(0) + "-1)";
                    }else {
                        formula = "X^2(1-\\frac{" + desconfianza + "}{2});" + this.getValor1(0) + "-1)";
                    }
                }
                else if(planteo==">") formula = "X^2(1-"+desconfianza + ";" + this.getValor1(0) + "-1)";
                else if(planteo=="<") formula = "X^2("+desconfianza + ";" + this.getValor1(0) + "-1)";
            break;
            case "T":
                if(poblaciones == 1){
                    if(planteo=="<>") {
                        if(tipo == 1){
                            formula = "T(\\frac{"+ desconfianza + "}{2};"+ this.getValor1(3) + "-1)";
                        }else
                        {
                            formula = "T(1-\\frac{" + desconfianza + "}{2});" + this.getValor1(3) + "-1)";
                        }
                    }
                    else if(planteo==">") formula = "T(1-"+desconfianza + ";" + this.getValor1(3) + "-1)";
                    else if(planteo=="<") formula = "T("+desconfianza + ";" + this.getValor1(3) + "-1)";
                }else {
                    if(planteo=="<>") {
                        if(tipo == 1){
                            formula = "T(\\frac{"+ desconfianza + "}{2};"+ this.getValor1(3) +"+"+ this.getValor2(3) + "-2)";
                        }else {
                            formula = "T(1-\\frac{" + desconfianza + "}{2};" + this.getValor1(3) +"+"+ this.getValor2(3) + "-2)";
                        }
                    }
                    else if(planteo==">") formula = "T(1-"+desconfianza + ";" + this.getValor1(3) +"+"+ this.getValor2(3) + "-2)";
                    else if(planteo=="<") formula = "T("+desconfianza + ";" + this.getValor1(3) +"+"+ this.getValor2(3) + "-2)";
                }
            break;
            case "Z":
                if(planteo=="<>") {
                        if(tipo == 1){
                            formula = "Z(\\frac{"+ desconfianza + "}{2})";
                        }else
                        {
                            formula = "Z(1-\\frac{" + desconfianza + "}{2}))";
                        }
                    }
                    else if(planteo==">") formula = "Z(1-"+desconfianza + ")";
                    else if(planteo=="<") formula = "Z("+desconfianza + ")";
               
            break;
        }
        return formula;
   }
    
    public void llenar1(double valor){
        if(inicio < n){
            this.inicio++;
            this.valores[inicio] = valor;
        }
    }
    public void llenar2(double valor){
        if(inicio2 < n){
            this.inicio2++;
            this.valores2[inicio2] = valor;
        }   
    }
    
    public void setTabla(){
        String tabla = "Z";
        if(tipo == "Varianza"){
            if( this.poblaciones == 1)
                tabla = "CHI";
            else
                tabla = "F";
        }else if(tipo == "Cualitativa")
            tabla = "Z";
        else{
            if(!varianzaPobCo){
                if(this.poblaciones == 1){
                     if(this.getValor1(3) <= 30)
                         tabla = "T";
                     else tabla = "Z";
                }else{
                    if(this.getValor1(3) + this.getValor2(3) <= 30)
                         tabla = "T";
                     else tabla = "Z";
                }
            }
        }
        this.tabla = tabla;
    }
     
    public void getImage(JLabel label){
        ImageIcon icon = null;
        if(tabla == "Z" || tabla == "T"){
            if(planteo=="<>")   icon = new ImageIcon("unoZ.png");
            else if(planteo==">")    icon = new ImageIcon("dosZ.png");
            else if(planteo=="<")   icon = new ImageIcon("tresZ.png");
        } else if(tabla == "CHI" || tabla =="F" ){
            if(planteo=="<>")   icon = new ImageIcon("unoF.png");
            else if(planteo==">")    icon = new ImageIcon("dosF.png");
            else if(planteo=="<")   icon = new ImageIcon("tresF.png");
        }
        Image conversion = icon.getImage();
        Image tamaño = conversion.getScaledInstance(300, 200, Image.SCALE_SMOOTH);
        ImageIcon fin = new ImageIcon(tamaño);
        label.setIcon(fin);
    }

    public void llenarEntradas(){
        if(this.poblaciones == 1){
            if("Cuantitativa".equals(tipo)){
            //valores de: X U (O,S) N
                this.entradas[0] ="X";
                this.entradas[1] ="μ";
                if(varianzaPobCo) this.entradas[2]="σ";
                else this.entradas[2] ="S";
                this.entradas[3] ="N";
                this.prueba = "μ";
            } else if(tipo=="Cualitativa"){
            //valores de: p pi n
                this.entradas[0] ="p";
                this.entradas[1] ="π";
                this.entradas[2] ="N";
                this.prueba = "π";
            }else if(tipo=="Varianza"){
                //valores N S^2 O^2
                this.entradas[0] ="N";
                this.entradas[1] ="σ^2";
                this.entradas[2] ="S^2";
                this.prueba = "σ^2";
            }            
        }else {
            if(tipo=="Cuantitativa"){
                 //valores de: X, U, O^2, N
                this.entradas[0] ="X";
                this.entradas[1] ="μ";
                if(varianzaPobCo) this.entradas[2]="σ^2";
                else this.entradas[2] ="S^2";
                this.entradas[3] ="N";
                this.prueba = "μ";
            }else if(tipo=="Cualitativa"){
            //valores de: p pi n X
                this.entradas[0] ="p";
                this.entradas[1] ="π";
                this.entradas[2] ="N";
                this.entradas[3] ="X";
                this.prueba = "π";
            }else if(tipo=="Varianza"){
            //valores S^2
                this.entradas[0] ="S^2";
                this.entradas[1] ="N";
                this.prueba = "σ^2";                
            }
        }
    }
    public double getValor1(int posicion){
        return valores[posicion];
    }
    public double getValor2(int posicion){
        return valores2[posicion];
    }
    
    public String [] formular(){
        String [] texto  = new String [2];      
        String text = "nosalio";
        double total = (double) 0.0;
        if(poblaciones==1){
            if("Cuantitativa".equals(tipo)){
                //valores de: X U (O,S) N
                total = (double) ((valores[0]- valores[1]))/(valores[2]/Math.sqrt(valores[3]));
                text = "\\frac{"+valores[0] +"-"+ valores[1]+"}{\\frac{"+valores[2]+"}{\\sqrt{"+valores[3]+"}}}"; 
            }
            else if(tipo=="Cualitativa"){
                //valores de: p pi n
                total = (double) (valores[0]-valores[1])/Math.sqrt((valores[1]*(1-valores[1]))/valores[2]);
                text = "\\frac{"+valores[0]+"-"+ valores[1]+"}{\\sqrt{\\frac{"+valores[1]+"*(1-"+valores[1]+")}{"+valores[2]+"}}}"; 
            }   
            else if(tipo=="Varianza"){
                //valores N O^2 S^2
                total = (valores[0]-1)*valores[2]/valores[1];
                text = "\\frac{("+valores[0]+"-1)*"+valores[2]+"}{"+valores[1]+"}";
            }
        }else{
            if(tipo=="Cuantitativa"){
                if(varianzaPobCo){
                //valores de: X, U, O^2, N
                    total = (double) (((valores[0]-valores2[0])-(valores[1]-valores2[1]))/Math.sqrt((valores[2]/valores[3])+(valores2[2]/valores2[3])));
                    text = "\\frac{("+valores[0]+"-"+valores2[0]+")-0}{\\sqrt{\\frac{"+valores[2]+"}{"+valores[3]+"}+\\frac{"+valores2[2]+"}{"+valores2[3]+"}}}";
                }
                else{
                //valores de: X, U, S^2, N
                    total = (double) (((valores[0]-valores2[0])-(valores[1]-valores2[1]))/Math.sqrt(this.spCuadrado()*((1/valores[3])+(1/valores2[3]))));
                    text = "\\frac{("+valores[0]+"-"+valores2[0]+")-0}{\\sqrt{"+decimales(spCuadrado())+"* \\frac{1}{"+valores[3]+"}+\\frac{1}{"+valores2[3]+"}}}";
                }
            }
            else if(tipo=="Cualitativa"){
                //valores de: p pi n X
                total = (double) ((valores[0]-valores2[0])-(valores[1]-valores2[1]))/Math.sqrt(this.pConSombrero()*(1-this.pConSombrero())*((1/valores[2])+(1/valores2[2])));
                text = "\\frac{("+valores[0]+"-"+valores2[0]+")-0 }{\\sqrt{"+decimales(pConSombrero())+"*(1-"+decimales(pConSombrero())+")* \\frac{1}{"+valores[2]+"}+\\frac{1}{"+valores2[2]+"}}}";
            }else if(tipo=="Varianza"){
                //valores S^2  N
                total = valores[0]/valores2[0];
                text = "\\frac{"+valores[0]+"}{"+valores2[0]+"}";
            }
        }
        total = decimales(total);
        texto[0] = text + "\\\\=" + total;
        texto[1] = ""+total;
        return texto;
    }
    
    public double decimales(double total){
        int diez = 1;
        for(int i = 1; i <= decimales; i++){
           diez *= 10;
        }  
        total = Math.floor(total*diez);
        total = total/diez;
        return total;
    }
    
    public double spCuadrado(){
        double texto;
        texto = (((valores[3]-1)*valores[2]) + ((valores2[3]-1)*valores2[2]))/(valores[3]+valores2[3]-2); 
        return texto; 
    }

    public String[] getEntradas() {
        return entradas;
    }
    
    public double pConSombrero(){
        double texto;
        texto = (valores[3] + valores2[3])/(valores[2]+valores2[2]);
        return texto; 
    }

    public String getPrueba() {
        return prueba;
    }
    
    
    public int getPoblaciones() {
        return poblaciones;
    }

    public void setVarianzaPobCo(boolean varianzaPobCo) {
        this.varianzaPobCo = varianzaPobCo;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    public void setPlanteo(String planteo) {
        this.planteo = planteo;
    }

    public int getN() {
        return n;
    }

    public double getDesconfianza() {
        return desconfianza;
    }

    public void setDesconfianza(double desconfianza) {
        this.desconfianza = desconfianza;
    }

    public int getInicio() {
        return inicio;
    }

    public void setDecimales(int decimales) {
        this.decimales = decimales;
    }

    public String getPlanteo() {
        return planteo;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isVarianzaPobCo() {
        return varianzaPobCo;
    }

    
}
