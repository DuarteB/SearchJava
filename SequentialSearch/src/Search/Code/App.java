package Search.Code;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] array = {3,2,4,5,3,2,7,6,4};
        int[] arraySorted = {1,2,3,4,5,7,8,9,10};
        
        boolean answerSorted = containsSorted(arraySorted, 6);
        boolean answer = contains(array,4);
        
        if(answer) {
            System.out.println("Number found");
        } else{
            System.out.println("Number not found");
        }

        System.out.println("------------------------");

        if(answerSorted) {
            System.out.println("Number found");
        } else{
            System.out.println("Number not found");
        }
    }
    
    //Sequential Search
    public static boolean contains(int[] a, int b){
        for (int i : a) {
            if (i == b){
                return true;
            }
        }
        return false;
    }

    //Sequential Search in a Sorted Array
    public static boolean containsSorted(int[] a, int b) {
        for(int i : a) {
            System.out.println("Comparando com: " + i);
            if(i == b) {
                return true;
            } else if (i > b) {
                return false;
            }
        }

        return false;
    }
}

