package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthMaxMinArray {
 public static void main(String[] args) {
  int n, max, min, i;
  Scanner sc = new Scanner(System.in);
  ArrayList arr = new ArrayList<Integer>();
  PriorityQueue<Integer> pqMin = new PriorityQueue<Integer>(Collections.reverseOrder());
  PriorityQueue<Integer> pqMax = new PriorityQueue<Integer>();
  n = sc.nextInt();
  for(i=0; i<n; i++) {
   int t = sc.nextInt();
   arr.add(t);
  }
  
  for(i=0; i<n; i++) {
    pqMin.add((int)arr.get(i));
    pqMax.add((int)arr.get(i));
  }
  int k;
  k =sc.nextInt();

  for(int j=0; j<n-k; j++) {
   pqMin.poll();
   pqMax.poll();
  }
   System.out.println("3rd Max = " + pqMax.peek());
   System.out.println("3rd Min = " + pqMin.peek());
 }
}
