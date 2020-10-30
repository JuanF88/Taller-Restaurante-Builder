
package co.unicauca.restaurant.orientalApp;

import co.unicauca.restaurant.services.DishDirector;
import co.unicauca.restaurant.domain.Dish;
import java.util.Scanner;

/**
 *
 * @author ahurtado
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=0;
        Scanner sc=new Scanner(System.in);
        DishDirector director = new DishDirector(new OrientalDishBuilder());
        while(opcion<3){
        imprimir();
        opcion=sc.nextInt();
            switch(opcion){
                case 1: 
                    break;
                case 2:
                    director.create();
                    Dish myDish = director.getDish();
                    System.out.println("El plato le cuesta: "+ myDish.getPrice());
                    break;
                default:
                    System.out.println("Ingrese una opcion valida ");
            }
        }
        
    }  
    private static void imprimir(){
        System.out.println("Elija el plato que desea consumir ");
        System.out.println("1. oriental ");
        System.out.println("2. italiano");
    }   
    
    
    
}
