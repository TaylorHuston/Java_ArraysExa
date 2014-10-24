
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/*
 * Basic Array functionality
 * From "Java How To Program, 10/e, Early Objects" - Chapter 7.
 */


public class ArraysEx {
    public static int[] integerArray;
    public static int[] diceRolls;
        
    //Fill the array of integers
    public static void fillArray(int[] integerArray) {
        Random randNum = new Random();
        
        for (int i = 0; i < integerArray.length; i++){  //Standard for loop
            integerArray[i] = randNum.nextInt(500);
        }
    }
    
    //Print out all values in array
    public static void printArray(int[] integerArray) {
        for (int num: integerArray) {  //Ehanced for loop
            System.out.printf("%3d ", num);
        }
        System.out.println();
    }
    
    //Simulate dice rolls
    public static void simuRolls(int[] diceRolls) {
        Random randNum = new Random();

        for (int j = 0; j < 6000000; j++) {  //Standard for loop
            ++diceRolls[randNum.nextInt(6)];
        }        
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         //Set initial size of array
        System.out.println("What is the size of the array you'd like to create?");
        int arraySize = input.nextInt();  
        integerArray = new int[arraySize];
        System.out.printf("Array of size %d created %n", integerArray.length);
        
        fillArray(integerArray);
        printArray(integerArray);
        System.out.println("Sorting array with Arrays.sort()");
        Arrays.sort(integerArray);
        printArray(integerArray);
        
        
        //Dice roll simulation
        System.out.println("Simulating 6,000,000 million die rolls...");
        diceRolls = new int[6];

        simuRolls(diceRolls);
        
        for (int k = 0; k < 6; k++) {
            System.out.printf("Face: %d   Number of rolls: %d%n", k+1, diceRolls[k]);
        }
        

        
        
        
    }//End of main
    
}//End of Arrays
