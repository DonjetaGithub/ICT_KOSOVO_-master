package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UshtrimeArray {

    public static void main(String[] args) {


        Integer[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8,10,0 };
        System.out.println("Array a : " + Arrays.toString(array1));

        Integer[] array2 = { 2, 4, 6, 8, 10, 12, 14, 9 ,0 ,6 ,9 ,10 ,11  , 18, 21 };
        System.out.println("Array b : " + Arrays.toString(array2));
        Set<Integer> unionOfArrays = new HashSet<>();
        unionOfArrays.addAll(Arrays.asList(array1));

        unionOfArrays.addAll(Arrays.asList(array2));
        Integer[] unionArray = {};
        unionArray = unionOfArrays.toArray(unionArray);

        // printing the union of two arrays.
        System.out.println("Unioni i array a dhe b eshte: " + Arrays.toString(unionArray));

        class FindIntersection {
            /* Function prints Intersection of arr1[] and arr2[]
               m is the number of elements in arr1[]
               n is the number of elements in arr2[] */
            static void printIntersection(int arraya[], int arrayb[], int c, int d)
            {
                int i = 0, j = 0;
                while (i < c && j < d) {
                    if (arraya[i] < arrayb[j])
                        i++;
                    else if (arraya[j] < arrayb[i])
                        j++;
                    else {
                        System.out.print(arrayb[j++] + " ");
                        i++;
                    }
                }
            }

        }

    }

}