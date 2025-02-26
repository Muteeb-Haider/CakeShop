/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package class3;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author mianm
 */
public class CakeShop {
  List<Cake> cakes = new ArrayList<>();
  int soldCakes = 0  ;

    public CakeShop(List<Cake> ck) {
        for(Cake a : ck)
        {
            cakes.add(a);
        }
    }
    public Cake firstCake(String color)
    {
        for(Cake a: cakes)
        {
            if(a.getColor().equals(color))
            {
                return a;
                
            }
            
            
        }
        return null;
    }
    public Cake largestCake()
    {
        Cake max = cakes.get(0) ;
        for(Cake a: cakes)
        {
            if(a.getWeight() > max.getWeight())
            {
                max = a;
            }
         
        }
        return max;
        
    }
    public Cake cheapestCake()
    {
        Cake min = cakes.get(0) ;
        for(Cake a: cakes)
        {
            if(a.getCost() < min.getCost())
            {
                min = a;
            }
         
        }
        return min;
        
    }
    public int count(String color)
    {
        int c = 0;
        for(Cake a: cakes)
        {
             if(a.getColor().equals(color))
             {
                c++; 
             }
            
        }
        return c;
        
    }
    public int totalWorth()
    {
        int s = 0 ;
        for(Cake a: cakes)
        {
            s+= a.getCost();
            
        }
        return s;
        
    }
    public void addCake(Cake ck)
    {
        cakes.add(ck);
        
    }
    
    public void sellCake(Cake ck)
    {
        cakes.remove(ck);
        this.soldCakes ++;
        
        
    }
    
    public int totalSoldCakes(Cake ck)
    {
        return soldCakes;
        
    }
    
    
    
  
  
    
}
