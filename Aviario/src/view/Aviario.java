/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import appinterfaces.IAve;
import appinterfaces.IProducto;
import controller.CTRLProducto;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Aviario {
    
    public static void generarPantalla(){
        System.out.println("Bienvenido a la tienda");
        System.out.println("======================");
        System.out.println("1) Listar Canarios");
        System.out.println("2) Listar Loros");
        System.out.println("3) Listar Productos");
        System.out.println("4) Salir");
        System.out.println("Seleccione opción");        
    }
    
    public static void ingresarOpcion(){
        int opcion;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        generarPantalla();
        try {
            opcion = Integer.parseInt(in.readLine());               
            mostrarDataAves(CTRLProducto.getProductos(opcion));
            mostrarDataProductos(CTRLProducto.getProductos(opcion));
        } catch (Exception e) {
        }
        
    }
    
    public static void mostrarDataProductos(ArrayList<IProducto> productos){
        for (IProducto objProducto : productos){
            System.out.println(objProducto.getPrecioUnitario());
        }
    }
    
    public static void mostrarDataAves(ArrayList<IAve> aves){
        for (IAve objAve : aves){
            System.out.println(objAve.getNombreCientifico());
        }
               
    }
    
    public static void main(String[] args) {
        ingresarOpcion();
    }
}
