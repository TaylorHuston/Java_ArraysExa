
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/*
 * Basic Array functionality
 * Based on "Java How To Program, 10/e, Early Objects" - Chapter 7.
 */

public class ArraysEx {
    private static int[] integerArray;
    private static int[] diceRolls;
    
    static final int SIDES = 6; //Number of sides of a die
    static final int RUNS = 6000000; //Number of simulations to run
    static final int RANGE = 500;  //Range for random numbers
        
    //Fill the array with random integers
    public static void fillArray(int[] integerArray) {
        Random randNum = new Random();
        
        //Standard for loop
        for (int i = 0; i < integerArray.length; i++) {  
            integerArray[i] = randNum.nextInt(RANGE);
        }
    } //End fillArray
    
    //Print out all values in array
    public static void printArray(int[] integerArray) {
        //Enhanced for loop
        for (int num: integerArray) {
            System.out.printf("%3d ", num);
        }
        System.out.println();
    } //End printArray
    
    //Simulate dice rolls
    public static void simuRolls(int[] diceRolls) {
        Random randNum = new Random();

        for (int j = 0; j < RUNS; j++) {  //Standard for loop
            ++diceRolls[randNum.nextInt(SIDES)];
        }        
    } //End simuRolls
    
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
        System.out.printf("Simulating %d million die rolls... %n", RUNS);
        diceRolls = new int[SIDES];

        simuRolls(diceRolls);
        
        for (int k = 0; k < SIDES; k++) {
            System.out.printf("Face: %d   Number of rolls: %d%n", k+1, diceRolls[k]);
        }
        
    } //End of main
    
} //End of Arrays
