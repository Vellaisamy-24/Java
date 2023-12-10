import java.util.Random;

public class GenerateRandomNumber {
    public static void main(String[] args)
    {
        //USING MATH CLASS
        /* 
        System.out.println(Math.random());  //random double num between 0<1
        System.out.println(Math.random()*10);   //random double num below 10
        System.out.println(Math.random()*100);   //random double num below 100
        */  
        //USING RANDOM CLASS
        Random obj=new Random();
        int ran=obj.nextInt(100); //below 100
        
          System.out.println(ran);
        
    }
    
}
