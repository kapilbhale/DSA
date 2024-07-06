package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArray {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  ArrayList arr = new ArrayList<Integer>();
  int n;
  n = sc.nextInt();
  for(int i=0; i<n; i++) {
   arr.add(sc.nextInt());
  }

  int i=0, j=n-1;
  while(i<j) {
   int temp = (int) arr.get(i);
   arr.set(i, arr.get(j));
   arr.set(j, temp);
   i++;
   j--;
  }

  for(int k=0; k<n; k++)
  System.out.println(arr.get(k));
 }
}