
package aduana;

import java.util.ArrayList;

class ProductoCTRL {
    private ArrayList<Producto> productos = new ArrayList<Producto>();

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    void addProducto(Producto producto) {
        productos.add(producto);
    }

    double getTotal() {
        double total = 0.0;
        for(int i = 0; i< productos.size();i++){
            total +=  this.productos.get(i).getImpuesto();
        }
        return total;
    }
    
    
}
