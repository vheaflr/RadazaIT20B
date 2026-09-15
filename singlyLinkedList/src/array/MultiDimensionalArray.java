/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;
/**
 *
 * @author User
 */
public class MultiDimensionalArray {
    public static void main (String [] args){
        int numbers[][] = {
            {12, 13, 14},
            {15, 16, 17},
            {18, 19, 20}
        };
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[i].length; j++) {
                    System.out.print(numbers [i][j] + " ");                   
                }
                System.out.println(" ");
            
        }
    }
}

