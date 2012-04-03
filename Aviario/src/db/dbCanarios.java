package db;

import java.util.ArrayList;
import model.Canario;

public class dbCanarios {
    public ArrayList simulaDataCanarios(){
        ArrayList<Canario> canarios = new ArrayList<Canario>();
        Canario canario1 = new Canario("001", "Canario Rojo", 16.00, "Canarious");
        Canario canario2 = new Canario("002", "Canario Verde", 21.00, "Canarious Rarus");
        Canario canario3 = new Canario("003", "Canario Amarillo", 6.00, "Canarious Bonitus");
        canarios.add(canario1);
        canarios.add(canario2);
        canarios.add(canario3);
        return canarios;
    }
}
