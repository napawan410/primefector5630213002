package 5630213002;

import java.util.Scanner;

public class Primefactor {
    
    private static void getPrime(int inputnumber) {
             
           for (int i = 2; i <=inputnumber; i++) {
                
                 while (inputnumber % i == 0) {
                        
                         inputnumber = inputnumber / i;
                         System.out.print(i);
                         
                         if (inputnumber >= i) { 
                           System.out.print(" x ");
                       }
                }
            }
            
         }
    public static void main(String[] args) {
        int inputnumber;
        Scanner in = new Scanner(System.in);
        System.out.println("Exit enter => 0 \n");
        do{
            System.out.print("Enter number : ");
            inputnumber = in.nextInt();

            System.out.print(inputnumber+" = ");
           getPrime(inputnumber);
            
            System.out.printlnef();
            
        }while (inputnumber != 0);
       
    }
    
}
