package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class CyclicRotateBy1 {
 public static void main(String[] args) {
  int n, t;
  ArrayList<Integer> arr = new ArrayList<>();
  Scanner sc = new Scanner(System.in);
  n = sc.nextInt();

  for(int i=0; i<n; i++) {
   t = sc.nextInt();
   arr.add(t);
  }

  int x = arr.get(0);
  for(int i=1; i<n; i++) {
   arr.set(i-1, arr.get(i));
  }
  arr.set(n-1, x);

  for(int i=0; i<n; i++) {
   System.out.print(arr.get(i) + " ");
  }
 }
}
