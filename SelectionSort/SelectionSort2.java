/**
 * SelectionSort2.java
 *
 * @author Jean-Luc Marchand
 * @version 1.0
 *
 * A class which will read data from a txt file ("aRandomData.txt") and create and array out of it,
 * which will later be sorted by the first SelectionSort class
 */

import java.util.*;
import java.io.*;

public class SelectionSort2
{                                                                                                                   

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
      int[] SortedArray = selectionSort(Array);
      
      System.out.println("After Sorting: ");
      for (int i:SortedArray)
      {
         System.out.print(i + "\n");
      }
   }

   public static <T extends Comparable<T>>
      void selectionSort(T[] data)
      {
         int min;
         T temp;
                      
         for (int index = 0; index < data.length-1; index++)
         {
            min = index;
            for (int scan = index+1; scan < data.length; scan++)
               if (data[scan].compareTo(data[min])<0)
                  min = scan;
                                                                               
         swap (data, min, index);
         }
      } 
      
   private static <T extends Comparable<T>>
      void swap(T[] data, int index1, int index2)
   {
      T temp = data[index1];
      data[index1] = data[index2];
      data[index2] = temp;
   }
}

