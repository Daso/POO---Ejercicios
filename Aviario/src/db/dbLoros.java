
package db;

import java.util.ArrayList;
import model.Loro;


public class dbLoros {
    public ArrayList simulaDataLoros(){
        ArrayList<Loro> Loros = new ArrayList<Loro>();
        Loro Loro1 = new Loro("L01", "Loro Rojo", 56.00, "Lorous");
        Loro Loro2 = new Loro("L02", "Loro Verde", 31.00, "Lorous Rarus");
        Loro Loro3 = new Loro("L03", "Loro Amarillo", 46.00, "Lorous Bonitus");
        Loros.add(Loro1);
        Loros.add(Loro2);
        Loros.add(Loro3);
        return Loros;
    }
}
