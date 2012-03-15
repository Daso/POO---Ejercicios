package controladoras;

import controladoras.AdmUsuarios;
import org.junit.Test;
import static org.junit.Assert.*;


public class AdmUsuariosTest {
    
    AdmUsuarios admUsuarios = new AdmUsuarios();
    
    
    @Test
    public void siNoIngresoElUsuarioMeDebeDarError(){
        assertFalse(admUsuarios.verificarUsuario(null));
        System.out.println("Usuario no debe estar vacío");
    }  
            
    @Test
    public void siIngresoElUsuarioDebeAceptarlo(){
        assertTrue(admUsuarios.verificarUsuario("Carlos"));
        System.out.println("Usuario ingresado");
    }
    /*Verificar que Password no es null*/
    
    @Test
    public void siElUsuarioNoExisteDebeMandarMensaje(){
        assertNull(admUsuarios.existeUsuario("adriem"));
        System.out.println("Usuario Inexistente");
    }
    
    @Test
    public void siElUsuarioExisteDebeMandarMensaje(){
        assertNotNull(admUsuarios.existeUsuario("sanper"));
        System.out.print("Usuario Existe");
    }
    
    @Test
    public void siElPassWordEsValidoDebeDarmeAcceso(){
        assertTrue(admUsuarios.validarPassword("sanper","sanper222"));
        System.out.println("Acceso Aceptado");
    }
    
    @Test
    public void siElPassWordNoEsValidoNoDebeDarmeAcceso(){
        assertFalse(admUsuarios.validarPassword("sanper", "sadkasd"));
        System.out.println("Acceso NO Aceptado");
    }
    
}
