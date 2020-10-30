/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.italianapp;
import co.unicauca.restaurant.domain.Dish;
import co.unicauca.restaurant.domain.Product;
import co.unicauca.restaurant.domain.Size;
import java.util.List;
import java.util.Vector;

public class ItalianDish extends Dish{
   private Product base;
   private List<Product> myOptions;
   private Size size; 
   
    ItalianDish(double p) {
        this.price = p;
        myOptions = new Vector<>();
    }
    void setBase(Product base) {
        this.base = base; 
    }
    void addOption(Product option) {
        getMyOptions().add(option);
    }
    public Product getBase() {
        return base;
    }
    public List<Product> getMyOptions() {
        return myOptions;
    }
    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }
    public double getPrice(){
        price = base.getPrice();
        for(Product each: myOptions){
            price = price + each.getPrice();
        }
        if(size==Size.DOUBLE) price = 2*price;
        if(size==Size.FAMILY) price = 2.7*price;
        return price;
    }
    
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
