//Selection & Insertion Sorts
import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

class Main{
  public static void main (String str[]) throws IOException {
    int[] elements = {21, 17, 60, 20, 56, 12};
    System.out.println("Printing Unsorted Array");
    for(int go:elements)
      {
    System.out.print(go+" ");
      }
    System.out.println("\nPrinting Each Pass Through the Selection Sort");
    //Selection Sort
    for (int j = 0; j < elements.length -1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;
    if(j<elements.length -2)
    {
      for (int num : elements)
      {
      System.out.print(num+" ");
      }
      System.out.println();
    }
    }
    for (int num : elements)
    {
      System.out.print(num+" ");
    }

//Insertion Sort
    System.out.println("\nPrinting Unsorted Array");
int[] elements2 = {21, 17, 60, 20, 56, 12};
    for(int go:elements2)
      {
    System.out.print(go+" ");
      }  

    System.out.println("\nPrinting Each Pass Through the Insertion Sort");
    for (int j = 1; j < elements2.length; j++)
    {
      int temp = elements2[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements2[possibleIndex - 1])
      {
        elements2[possibleIndex] = elements2[possibleIndex - 1];
        possibleIndex--;
        
      }
      elements2[possibleIndex] = temp;
      if(j<elements2.length -1)
    {
      for (int num : elements2)
      {
      System.out.print(num+" ");
      }
      System.out.println();
    }
    }

    for (int num : elements2)
    {
      System.out.print(num+" ");
    }
    System.out.println();
    //alphabetical sorting
    String[] elements3 ={"bus","truck","van","semi","car"};
    System.out.println("Printing Unsorted Array of Strings");
    for(String go:elements3)
      {
    System.out.print(go+" ");
      }
    System.out.println("\nPrinting Each Pass Through the Selection Sort");
    //Selection Sort
    for (int j = 0; j < elements3.length -1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements3.length; k++)
      {
     if (elements3[k].compareTo(elements3[minIndex])<0)
        {
          minIndex = k;
        }
      }
      String temp = (elements3[j]);
      elements3[j] = elements3[minIndex];
      elements3[minIndex] = temp;
    if(j<elements3.length -2)
    {
      for (String num : elements3)
      {
      System.out.print(num+" ");
      }
      System.out.println();
    }
    }
    for (String num : elements3)
    {
      System.out.print(num+" ");
    }


   String[] elements4 = { "bus", "truck", "van", "semi","car"};
    System.out.println("\nPrinting Unsorted Array");
    for(String go:elements4)
      {
    System.out.print(go+" ");
      }
    System.out.println("\nPrinting Each Pass Through the Selection Sort");
    //Selection Sort
    for (int j = 0; j < elements4.length -1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements4.length; k++)
      {
        if (elements4[k].compareTo(elements4[minIndex])<0)
        {
          minIndex = k;
        }
      }
      String temp = elements4[j];
      elements4[j] = elements4[minIndex];
      elements4[minIndex] = temp;
    if(j<elements.length -2)
    {
      for (String num : elements4)
      {
      System.out.print(num+" ");
      }
      System.out.println();
    }
    }int[] elements5= {21, 17, 60, 20, 56, 12};
    System.out.println("Printing Unsorted Array");
    for(int go:elements5)
      {
    System.out.print(go+" ");
      }
    System.out.println("\nPrinting Each Pass Through the Selection Sort");
    //Selection Sort
    for (int j = 0; j < elements5.length -1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements5.length; k++)
      {
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
      }
      int temp = elements5[j];
      elements5[j] = elements5[minIndex];
      elements5[minIndex] = temp;
    if(j<elements5.length -2)
    {
      for (int num : elements5)
      {
      System.out.print(num+" ");
      }
      System.out.println();
    }
    }
    for (int num : elements5)
    {
      System.out.print(num+" ");
    }

//Insertion Sort
    System.out.println("\nPrinting Unsorted Array");
int[] elements6 = {21, 17, 60, 20, 56, 12};
    for(int go:elements6)
      {
    System.out.print(go+" ");
      }  

    System.out.println("\nPrinting Each Pass Through the Insertion Sort");
    for (int j = 1; j < elements6.length; j++)
    {
      int temp = elements6[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements6[possibleIndex - 1])
      {
        elements6[possibleIndex] = elements6[possibleIndex - 1];
        possibleIndex--;
        
      }
      elements6[possibleIndex] = temp;
      if(j<elements6.length -1)
    {
      for (int num : elements6)
      {
      System.out.print(num+" ");
      }
      System.out.println();
    }
    }

    for (int num : elements6)
    {
      System.out.print(num+" ");
    }
    System.out.println();
    //alphabetical sorting
    String[] elements6 ={"bus","truck","van","semi","car"};
    System.out.println("Printing Unsorted Array of Strings");
    for(String go:elements6)
      {
    System.out.print(go+" ");
      }
    System.out.println("\nPrinting Each Pass Through the Selection Sort");
    //Selection Sort
    for (int j = 0; j < elements6.length -1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements6.length; k++)
      {
     if (elements6[k].compareTo(elements6[minIndex])<0)
        {
          minIndex = k;
        }
      }
      String temp = (elements6[j]);
      elements6[j] = elements6[minIndex];
      elements6[minIndex] = temp;
    if(j<elements6.length -2)
    {
      for (String num : elements6)
      {
      System.out.print(num+" ");
      }
      System.out.println();
    }
    }
    for (String num : elements6)
    {
      System.out.print(num+" ");
    }


   String[] elements7 = { "bus", "truck", "van", "semi","car"};
    System.out.println("\nPrinting Unsorted Array");
    for(String go:elements7)
      {
    System.out.print(go+" ");
      }
    System.out.println("\nPrinting Each Pass Through the Selection Sort");
    //Selection Sort
    for (int j = 0; j < elements7.length -1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements7.length; k++)
      {
        if (elements7[k].compareTo(elements7[minIndex])<0)
        {
          minIndex = k;
        }
      }
      String temp = elements7[j];
      elements7[j] = elements7[minIndex];
      elements7[minIndex] = temp;
    if(j<elements.length -2)
    {
      for (String num : elements7)
      {
      System.out.print(num+" ");
      }
      System.out.println();
    }
    }
    
  }
}
