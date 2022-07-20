/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;
import java.util.Arrays;
/**
 *
 * @author Ahmad Ghanem
 */
public class BubbleSort {

    static void bubblesort (int array[])
        {
           for (int i=0; i < array.length -1; i++)
               
               for (int j=0; j < array.length -1 -i; j++)
                   
                   if (array[j] > array[j + 1])
                   {
                       
                       int temp =array[j];
                       array[j] = array[j + 1];
                       array[j + 1] = temp;
                       
                   }
        }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr = { 2,45,0,11,100,9,36,98,-8};
      //  int [] arr = { 2 , 8 , 4 , 9 , 6 , 0 ,10 };
        bubblesort(arr);
        System.out.print("Sorted Array in Ascending Order : ");
        System.out.println(Arrays.toString(arr));
        
        
        
    }
    
}
