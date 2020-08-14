/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author saotr
 */
public class Dog {
    String name,foodDog;

    public Dog() {
    }

    public Dog(String name, String foodDog) {
        this.name = name;
        this.foodDog = foodDog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodDog() {
        return foodDog;
    }

    public void setFoodDog(String foodDog) {
        this.foodDog = foodDog;
    }
    
}
