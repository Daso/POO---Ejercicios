
package aviario;

import appinterfaces.IAve;

public abstract class Ave implements IAve {
    
    protected String nombreCientifico;
    protected String fraseVolar = "Estoy volando";
    protected String fraseCantar = "Estoy cantando";
    public Ave(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }    
    public abstract String volar();
    
    
    public abstract String cantar();
       
}
