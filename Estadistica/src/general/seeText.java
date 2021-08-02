
package general;

import org.scilab.forge.jlatexmath.ParseException;
import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;

public class seeText {
    private TeXFormula formula;
    private TeXIcon icon;

    public seeText(){
        
    }
    
    public TeXIcon getIconLaTex(String math, int tamaño){
        try {
            formula = new TeXFormula(math);
            this.icon = this.formula.createTeXIcon(TeXConstants.ALIGN_CENTER, tamaño);
            return this.icon;
        } catch (ParseException e) {
            System.err.println("Error: "+ e.getMessage());
            return this.icon = null;
        }                         
    }
        public TeXIcon getIconLaTex(String math){
        try {
            formula = new TeXFormula(math);
            this.icon = this.formula.createTeXIcon(TeXConstants.ALIGN_CENTER,25);
            return this.icon;
        } catch (ParseException e) {
            System.err.println("Error: "+ e.getMessage());
            return this.icon = null;
        }                         
    }
}
