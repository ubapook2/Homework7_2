/**
 * SelectionSort.java
 *
 * @author Jean-Luc Marchand
 * @version 1.0
 *
 * A class which will read data from a txt file ("aRandomData.txt") and create and array out of it,
 * which will later be sorted by the first SelectionSort class
 */

import java.util.*;
import java.io.*;

public class SelectionSort
{
   public static int[] Sort(int[] Array)
   {              
      for (int i = 0; i < Array.length - 1; i++)
      {
         int index = i;
         for (int scan = i + 1; scan < Array.length; scan++)
            if (Array[scan] < Array[index])
                  index = scan;
                                                               
            swap(Array, index, i);
      }
      return Array;                                           
   }
   
   private static void swap(int[] Array, int index1, int index2)
   {
      int temp = Array[index1];
      Array[index1] = Array[index2];
      Array[index2] = temp;
   }
                           
                                                                                                                    
                                                                                                                   

   public static void main(String[] args) throws IOException
   {
      Scanner fileScan;
      fileScan = new Scanner(new File("aRandomData.txt"));

      int[] Array = new int[fileScan.nextInt()];

      for (int i = 0; i < Array.length; i++)
      {
         Array[i] = fileScan.nextInt();
      }
      System.out.println("Reading DATA from aRandomData.txt file:");
      System.out.println("Array size = " + Array.length);
      for (int i = 0; i < Array.length; i++)
      {
         System.out.println(Array[i]);
      }
      System.out.println("End of Reading !" + "\n");
      
      /* now sorts the array from the text file using the 'Sort' class, and 
         then prints it out in a new, sorted array. */
      int[] SortedArray = Sort(Array);
      
      System.out.println("After Sorting: ");
      for (int i:SortedArray)
      {
         System.out.print(i + "\n");
      }
   }
}

