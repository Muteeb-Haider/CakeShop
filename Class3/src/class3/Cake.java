/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class3;

/**
 *
 * @author mianm
 */
public class Cake {
    private String name,color;
    private float weight,cost;

    public Cake(String name, String color, float weight, float cost) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.cost = cost;
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Cake{" + "name=" + name + ", color=" + color + ", weight=" + weight + ", cost=" + cost + '}';
    }
    
    
    
}
