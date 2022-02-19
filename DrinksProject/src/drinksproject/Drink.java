/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drinksproject;

/**
 *
 * @author araju55
 */
public abstract class Drink {
    
    public void prepareRecipe() {
        
        boilWater();
        
        brewBeverage();
        
        transferToCup();
        
        addCondiments();
    }
    
    public abstract void addCondiments();
    
    public abstract void brewBeverage();
    
    public void transferToCup() {
        System.out.println("Pour the liquid into the cup");
    }
    
    public void boilWater() {
        System.out.println("Boil Water");
    }
    
}
