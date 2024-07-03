package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxMinArray {
 public static void main(String[] args) {
  int n, max, min, i;
  Scanner sc = new Scanner(System.in);
  ArrayList arr = new ArrayList<Integer>();
  n = sc.nextInt();
  for(i=0; i<n; i++) {
   int t = sc.nextInt();
   arr.add(t);
  }
  min = (int) arr.get(0);
  max = (int) arr.get(0);
  for(i=0; i<n; i++) {
   if((int) arr.get(i) > max) {
    max = (int) arr.get(i);
   }
   if((int) arr.get(i) < min) {
    min = (int) arr.get(i);
   }
  }
  System.out.println("Min = " + min);
  System.out.println("Max = " + max);
 }
}
