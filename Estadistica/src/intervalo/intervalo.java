package intervalo;


public class intervalo {
    private String entradas[];
    
    private double valores [];
    private double valores2[];
    private int n; //cantidad de valores que ingresan
    private int inicio;
    private int inicio2;
    
    private String tipo;    //Cuantita-Cualita-Varian
    private int poblaciones; //cantidad de 1 o 2 poblaciones
    private String tabla; //Z T CHI F
    private boolean varianzaPobCo = false;
    private double desconfianza;
    public int decimales;
    public double valorTabla;
    public double valorTabla2;

    public void setValorTabla2(double valorTabla2) {
        this.valorTabla2 = valorTabla2;
    }
    
    
    public void setValorTabla(double valorTabla) {
        this.valorTabla = valorTabla;
    }

    public double[] getValores() {
        return valores;
    }

    public void setValores(double[] valores) {
        this.valores = valores;
    }

    public double[] getValores2() {
        return valores2;
    }

    public void setValores2(double[] valores2) {
        this.valores2 = valores2;
    }

    public int getInicio2() {
        return inicio2;
    }

    public void setInicio2(int inicio2) {
        this.inicio2 = inicio2;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }
    
    
     public intervalo(int poblaciones, String tipo){
        int n = 3;
        if(tipo=="Cualitativa"){
            if(poblaciones == 1)
                n = 2;
            else 
                n = 2;
        }else if (tipo=="Varianza"){
            if(poblaciones == 2)
                n = 2;
            else
                n = 2;            
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
                     if(this.getValor1(0) <= 30)
                         tabla = "T";
                     else tabla = "Z";
                }else{
                    if(this.getValor1(0) + this.getValor2(0) <= 30)
                         tabla = "T";
                     else tabla = "Z";
                }
            }
        }
        this.tabla = tabla;
    }
    
    public void llenarEntradas(){
        if(this.poblaciones == 1){
            if("Cuantitativa".equals(tipo)){
            //valores de: X U (O,S) N
                this.entradas[0] ="N";
                if(varianzaPobCo) this.entradas[1]="σ";
                else this.entradas[1] ="S";
                this.entradas[2] ="X";
            }else if("Cualitativa".equals(tipo)){
            //valores de: p pi n
                this.entradas[0] ="N";
                this.entradas[1] ="p";
            }else if("Varianza".equals(tipo)){
                //valores N S^2 O^2
                this.entradas[0] ="N";
                this.entradas[1] ="S^2";
                
            }            
        }else {
            if("Cuantitativa".equals(tipo)){
                 //valores de: X, U, O^2, N
                this.entradas[0] ="N";
                if(varianzaPobCo) this.entradas[1]="σ^2";
                else this.entradas[1] ="S^2";
                this.entradas[2] ="X";
            }else if("Cualitativa".equals(tipo)){
            //valores de: p pi n X
                this.entradas[0] ="N";
                this.entradas[1] ="p";
            }else if("Varianza".equals(tipo)){
            //valores S^2
                this.entradas[0] ="N";
                this.entradas[1] ="S^2";
            }
        }
    }
  public String getTablaFormula(boolean tipo) {
        String formula = "";
         System.out.println(formula);
        switch (tabla){
            case "F":
                if(tipo)
                    formula = "F(1-\\frac{" + desconfianza + "}{2};" + this.getValor1(0) + "-1;" + this.getValor2(0) + "-1)";
                else
                    formula = "\\frac{1}{F(\\frac{" + desconfianza + "}{2};" + this.getValor1(0) + "-1;" + this.getValor2(0) + "-1)}";
            break;
            case "CHI":
                if(tipo)
                    formula = "X^2(1-\\frac{" + desconfianza + "}{2};" + this.getValor1(0) + "-1;)";
                else 
                    formula = "X^2(\\frac{" + desconfianza + "}{2};" + this.getValor1(0) + "-1;)";
            break;
            case "T":
                if(poblaciones == 1)
                    formula = "T(1-\\frac{"+ desconfianza + "}{2};"+ this.getValor1(0) + "-1)";
                else    
                    formula = "T(1-\\frac{" + desconfianza + "}{2};" + this.getValor1(0) +"+"+ this.getValor2(0) + "-2)";      
            break;
            case "Z":
                formula = "Z(1-\\frac{"+ desconfianza + "}{2})";
            break;
            default:
                formula = "tma no sale";
        }
        return formula;
   }
    
    public double getValor1(int posicion){
        return valores[posicion];
    }
    public double getValor2(int posicion){
        return valores2[posicion];
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
    
    public String[] getEntradas() {
        return entradas;
    }
    
    public int getPoblaciones() {
        return poblaciones;
    }

    public void setVarianzaPobCo(boolean varianzaPobCo) {
        this.varianzaPobCo = varianzaPobCo;
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
    
    public String getTipo() {
        return tipo;
    }

    public boolean isVarianzaPobCo() {
        return varianzaPobCo;
    }

    public String getFormulaText() {     
        String texto = "";
        String texto2 = "";
        float contenido =0;
        if(this.poblaciones == 1){
            if("Cuantitativa".equals(tipo)){
                texto = "I_{(μ)}="+getValor1(2) + "\\pm "+ tabla + "_{(1-\\frac{" + desconfianza+ "}{2})}*\\frac{"+ getValor1(1)+ "}{\\sqrt{"+getValor1(0)+"}}"; 
                contenido = (float) decimales(getValor1(1)/Math.sqrt(getValor1(0)));
                texto2 = getValor1(2) + "\\pm "+ valorTabla +"*"+ contenido; 
                
            }else if(tipo=="Cualitativa"){
                texto = "I_{(\\pi)}="+getValor1(1) + "\\pm "+ tabla + "_{(1-\\frac{" + desconfianza+ "}{2})}*\\sqrt{\\frac{"+ getValor1(1) +"*"+(1-getValor1(1))+"}{"+getValor1(0)+"}}";         
                contenido = (float) decimales((getValor1(1)*(1-getValor1(1))/getValor1(0)));
                texto2 = getValor1(1) + "\\pm "+ valorTabla +"*\\sqrt{"+contenido+"}";
            }else if(tipo=="Varianza"){
                //n s
                texto = "\\frac{"+getValor1(0)+ "-1*"+getValor1(1)+"}{X^2_{(1-\\frac{"+desconfianza+ "}{2};"+getValor1(0)+"-1)}} <  σ^2  < \\frac{"+getValor1(0)+ "-1*"+getValor1(1)+"}{X^2_{(\\frac{"+desconfianza+ "}{2};"+getValor1(0)+"-1)}}";
                contenido = (float) decimales((getValor1(0)-1)*getValor1(1));
                texto2 = "\\frac{"+contenido+"}{"+valorTabla+"} <  σ^2  <  \\frac{"+contenido+"}{"+valorTabla2+"}";
            }            
        }else {
            if(tipo=="Cuantitativa"){
                if(varianzaPobCo){
                    texto = "I_{(μ_1 - μ_2)}=("+getValor1(2) + "-"+getValor2(2)+")\\pm "+ tabla + "_{(1-\\frac{" + desconfianza+ "}{2})}*\\sqrt{\\frac{"+ getValor1(1)+ "}{"+getValor1(0)+"}+\\frac{"+getValor2(1)+"}{"+getValor2(0)+"}}"; 
                    contenido = (float) decimales((getValor1(1)/getValor1(0)) + (getValor2(1)/getValor2(0)));
                    texto2 = (getValor1(2)-getValor2(2))+ "\\pm "+ valorTabla + "*\\sqrt{"+contenido+"}";
                }else{//n s x
                    texto = "I_{(μ_1 - μ_2)}=("+getValor1(2) + "-"+getValor2(2)+") \\pm "+ tabla + "_{(1-\\frac{" + desconfianza+ "}{2})}*\\sqrt{"+decimales(spCuadrado())+"*(\\frac{1}{"+getValor1(0)+"}+\\frac{1}{"+getValor2(0)+"})}"; 
                    contenido = (float) decimales(spCuadrado()*((1/getValor1(0)) + (1/getValor2(0))));
                    texto2 = (getValor1(2)-getValor2(2))+ "\\pm "+ valorTabla + "*\\sqrt{"+contenido+"}";
                }
            }else if(tipo=="Cualitativa"){
                texto = "I_{(\\pi_1 - \\pi_2)}="+getValor1(1) + "-"+getValor2(1) + "\\pm "+ tabla + "_{(1-\\frac{" + desconfianza+ "}{2})}*\\sqrt{\\frac{"+ getValor1(1) +"*"+(1-getValor1(1))+"}{"+getValor1(0)+"}+\\frac{"+ getValor2(1) +"*"+(1-getValor2(1))+"}{"+getValor2(0)+"}}";         
                contenido = (float) decimales(((getValor1(1)*(1-getValor1(1)))/getValor1(0))+((getValor2(1)*(1-getValor2(1)))/getValor2(0)));
                texto2 = (getValor1(1)-getValor2(1))+ "\\pm "+ valorTabla + "*\\sqrt{"+contenido+"}";
            }else if(tipo=="Varianza"){
                texto = "\\frac{"+getValor1(1)+"}{"+getValor2(1)+"}*\\frac{1}{F_{(1-\\frac{"+desconfianza+"}{2};"+getValor1(0)+"-1;"+getValor2(0)+"-1)}} \\leq \\frac{σ_1^2}{σ_2^2} \\leq \\frac{"+getValor1(1)+"}{"+getValor2(1)+"}*F_{(1-\\frac{"+desconfianza+"}{2};"+getValor2(0)+"-1;"+getValor1(0)+"-1)}";
                contenido = (float) decimales(getValor1(1)/getValor2(1));
                texto2 = contenido+"*\\frac{1}{"+valorTabla+"} \\leq \\frac{σ_1^2}{σ_2^2} \\leq "+ contenido+"*"+valorTabla2;
            }
        }
        texto += "\\\\"+texto2;
        texto += "\\\\ = " + getResultado();
        return texto;
    }

    public String spCuadradoText() {
        String texto = "S_p^2 = \\frac{(" + valores[0] + "-1)*" + valores[1]+ "+"+valores2[0]+"-1)*"+valores2[1]+"}{"+valores[0]+ "+"+valores2[0]+"-2} = ";
        texto += decimales(spCuadrado()); 
        return texto;
    }
    
    public double spCuadrado(){
        double texto;//n s x
        texto = (((valores[0]-1)*valores[1]) + ((valores2[0]-1)*valores2[1]))/(valores[0]+valores2[0]-2); 
        
        return texto; 
    }

    public String getResultado() {
        double resultado1 = 0.0;
        double resultado2 = 0.0;
        String resultado = "";
        
                if(this.poblaciones == 1){
            if("Cuantitativa".equals(tipo)){
                resultado1 = getValor1(2) - valorTabla*getValor1(1)/Math.sqrt(getValor1(0));
                resultado2 = getValor1(2) + valorTabla*getValor1(1)/Math.sqrt(getValor1(0));
            }else if(tipo=="Cualitativa"){
                resultado1 = getValor1(1) - valorTabla*Math.sqrt(getValor1(1)*(1-getValor1(1))/getValor1(0));
                resultado2 = getValor1(1) + valorTabla*Math.sqrt(getValor1(1)*(1-getValor1(1))/getValor1(0));
            }else if(tipo=="Varianza"){
                resultado1 = (getValor1(0)-1)*getValor1(1)/valorTabla;
                resultado2 = (getValor1(0)-1)*getValor1(1)/valorTabla2;
            }            
        }else {
            if(tipo=="Cuantitativa"){
                if(varianzaPobCo){
                    resultado1 = (getValor1(2)-getValor2(2)) - valorTabla*Math.sqrt((getValor1(1)/getValor1(0))+(getValor2(1)/getValor2(0)));
                    resultado2 = (getValor1(2)-getValor2(2)) + valorTabla*Math.sqrt((getValor1(1)/getValor1(0))+(getValor2(1)/getValor2(0)));
                }else{//n s x
                    resultado1 = (getValor1(2)-getValor2(2)) - valorTabla*Math.sqrt(spCuadrado()*(1)/getValor1(0)+(1)/getValor2(0));
                    resultado2 = (getValor1(2)-getValor2(2)) + valorTabla*Math.sqrt(spCuadrado()*(1)/getValor1(0)+(1)/getValor2(0));
                }
            }else if(tipo=="Cualitativa"){
                //n  p
                resultado1 = (getValor1(1)-getValor2(1)) - valorTabla*Math.sqrt(((getValor1(1)*(1-getValor1(1))/getValor1(0)))+((getValor2(1)*(1-getValor2(1))/getValor2(0))));
                resultado2 = (getValor1(1)-getValor2(1)) + valorTabla*Math.sqrt(((getValor1(1)*(1-getValor1(1))/getValor1(0)))+((getValor2(1)*(1-getValor2(1))/getValor2(0))));
            }else if(tipo=="Varianza"){
            //valores S^2
                resultado1 = getValor1(1)/(getValor2(1)*valorTabla);
                resultado2 = getValor1(1)*valorTabla2/(getValor2(1));
            }
        }
        resultado1 = decimales(resultado1);
        resultado2 = decimales(resultado2);

        resultado = "["+resultado1+";"+resultado2+"]";
        return resultado;
    }
   

}
