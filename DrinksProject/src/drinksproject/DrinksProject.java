/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package drinksproject;

/**
 *
 * @author araju55
 */
public class DrinksProject {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Drink d1 = new Coffee();
        Drink d2 = new Tea();
        
        System.out.println("Preparing Coffee: ");
        d1.prepareRecipe();
        System.out.println("=================================================");
        d2.prepareRecipe();
        System.out.println("=================================================");
    }
    
}
