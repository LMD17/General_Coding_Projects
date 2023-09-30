
package classes.and.objects.car;


public class ClassesAndObjectsCar {

    public static void main(String[] args) {
        car1 vw = new car1();
        
        vw.name = "VolksWagen";
        vw.make = "polo";
        vw.value = 400_000;
        
        vw.writeOutPut();
        
        //Second instance of car1
        
        car1 hyundai = new car1();
        
        hyundai.name = "Creta";
        hyundai.make = "Hyundai";
        hyundai.value = 120_000;
        
        hyundai.writeOutPut();
        
        //displaying the values on the screen
        System.out.println(hyundai.name + " is of type " + hyundai.make + " with value of " + hyundai.value);
        System.out.println();
        System.out.println(vw.name + " is of type " + vw.make + " with value of " + vw.value);
    }
    
}
