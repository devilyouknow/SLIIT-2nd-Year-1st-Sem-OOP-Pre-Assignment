import java.util.*;
public class Temp { 
    static boolean isEthylFreezing(double temp){
    boolean t = false;
    
    if(temp <= -173){
        t= true;
    }else{
        t = false;
    }
    
    return t;
    }
    
    
    
    
    static boolean isEthylBoiling(double temp){
    boolean t = false;
    
    if(temp >= 172){
        t= true;
    }else{
        t = false;
    }
    
    
    return t;
    }
    
    
    
    
    
    
    static boolean isoxygenFreezing(double temp){
    boolean t = false;
    if(temp <= -362){
        t= true;
    }else{
        t = false;
    }
    
    
    return t;
    }
    
    
    
    
    
    
    
    static boolean isOxygenBoiling(double temp){
    boolean t = false;
    
    
    if(temp >= -306){
        t= true;
    }else{
        t = false;
    }
    
    
    return t;
    }
    
    
    
    
    
    
    static boolean IsWaterFreezing(double temp){
    boolean t = false;
    
    if(temp <= 32){
        t= true;
    }else{
        t = false;
    }
    
    return t;
    }
    
    
    
    
    
    static boolean IsWaterBoiling(double temp){
    boolean t = false;
    
    if(temp >= 212){
        t= true;
    }else{
        t = false;
    }
    
    
    return t;
    }
    
    
 
    public static void main(String []args){
    
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Please Enter the Temperatur : ");
        
        double temp = scan.nextDouble();
        System.out.println("");
        
        //ethylfreezing
        if(isEthylFreezing(temp)){
            System.out.println("Ethyl Will Freez");
        }
        else{}
        
        
        
        //ethylboiling
        if(isEthylBoiling(temp)){
            System.out.println("Ethyl Will Boil");
        }
        else{}
        
        
        //oxygenfreeze
        
        if(isoxygenFreezing(temp)){
        
            System.out.println("Oxygen will freeze");
        }else{}
        
        
        //oxygenboil
        
        if(isOxygenBoiling(temp)){
            System.out.println("Oxygen will Boil");
        }else{}
        
        //waterfreeze
        
        
        if(IsWaterFreezing(temp)){
            System.out.println("water will Freeze");
        }else{}
        
        
        //waterboil
        
        if(IsWaterBoiling(temp)){
        
            System.out.println("Water will Boil");
        }else{}
    }
    
    
}