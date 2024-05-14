import java.util.*;

public class Numbergame{
    public static void main(String []args){
       
        //generate random number
        int max=100;
        int min=1;
        int d=(int)(Math.random()* ((max-min)+1));
        //System.out.println(d);
            // d=15;
        boolean f=true;
        //input from user 
        int total_attempt=2;
        int try_num=0;
        while (f && total_attempt>try_num) {
            System.out.println("Enter your number :");
            //input
            Scanner sc=new Scanner(System.in);
            int inp=sc.nextInt();
            
            //show result true/ think upper number/think lower number
            if(inp==d){
                System.out.println("correct");

                f=false;
            }
            else if(inp>d){
                System.out.println("too high");
            }
            else if(inp<d){
                System.out.println("too low");
            }
            try_num++;

        
        }
        if(f){
            System.out.println("Fail Marks : 0");
        }
        else if(try_num==1){
            System.out.println("Pass Marks : 2");
        }
        else if(try_num==2){
            System.out.println("Pass Marks : 1");
        }
        else if(try_num>2){
          
            System.out.println("Fail Marks : 0");
           
        }
        
        System.out.println("System number : "+d);


         
    }
}