/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.util.*;
/**
 *
 * @author carlosneira
 */
public class Assignment1Tester {

        int[] testArr = {0, -3, 5, -4, -2, 3, 1, 0};
//      int[] arr = {10,10,-5,25,-5};
    public static void main(String[] args) {
        int[] testArr = {0, -3, 5, -4, -2, 3, 1, 0};
        indexStability(testArr);
    }
    
     public static void indexStability(int[] arr){
        int all = 0;
        int sumLeft= 0;
        for (int num : arr){
            all += num;
        }
        for(int num = 0; num < arr.length; num++){
         int sumRight = all - sumLeft - arr[num]; 
         if(sumLeft==sumRight){
            System.out.println(num);
        }
       sumLeft = sumLeft + arr[num]; 
        }
    }

     
}
