package Arraylist;

import java.lang.reflect.Array;
import java.util.*;
// Write a Java program to insert an element into the array list at the first position
 class insertElement {

        public static void main(String[] args)
        {
           ArrayList<String> ArrayList_Str= new ArrayList<>();
           ArrayList_Str.add("Apple");
            ArrayList_Str.add("Banana");
            ArrayList_Str.add("Cherry");

            ArrayList_Str.add("Pineapple");
            ArrayList_Str.add("Guava");
            ArrayList_Str.add("Papaya");
            ArrayList_Str.add("Plum");
            System.out.println(ArrayList_Str);
            ArrayList_Str.add(0, "Mango");
           ArrayList_Str.add(5, "Strawberry");
            System.out.println(ArrayList_Str);
        }
    }

