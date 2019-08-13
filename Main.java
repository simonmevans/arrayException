import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void fillArrayRandoInt(int []ary){
        
        int x = (int) (Math.random()*10);
        for (int i =0; i < ary.length; i++){
            ary[i] = x;
            x = (int)(Math.random()*10);
        }
    }
    public static void printAry(int []ary){
        int b = 1;
        for(int i = 0; i < ary.length; i++){
            System.out.print(ary[i]+ " ");
            if((b % 10)==0 && i!=0){
                System.out.print('\n');
            }
            b++;
        }
    }
    public static void main (String []args){
        //create array 100
        int ary[] = new int [100];
        //fill with random numbers
        fillArrayRandoInt(ary);
        printAry(ary);
        //get user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a int. I will check if in array bounds");
        try{
        int in = input.nextInt();
        System.out.println("Num Entered: " + in + " the number at that pos is " + ary[in]);
        }
        catch(Exception ex){
            System.out.println("Exception thrown in array");
        }
        //check if user input is withing array bounds
    }

}