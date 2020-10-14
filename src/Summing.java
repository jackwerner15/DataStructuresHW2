import java.util.ArrayList;
import java.util.Scanner;

public class Summing {

    public void run() {

        ArrayList<Integer> myArray = new ArrayList<Integer>(3);

        int[] test = { 1, 2, 3, 4, 5, 6 };

        double sum = 0;
        for (int i : test) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

    }

    // #2 
    // The output would be 2 because when you run the for loop it looks for a new maximum
    // and when it finds one it indexes that. So the initial max is 1 and as it goes through
    // the array 5>1 so 5 is the new max, then 6>5, so 6 is the new max and then 6 is greater
    // than the rest of the numbers in the array so there were only 2 new maximums so the output
    // will be 2.

    public static toPower(){
        int size = size;
        int power = power;
        this.array = new ArrayList<>();

    }


}