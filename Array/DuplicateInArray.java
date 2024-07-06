package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateInArray {
 public static void main(String[] args) {
  int n=0; 
  ArrayList<Integer> arr = new ArrayList<>();
  Scanner sc = new Scanner(System.in);

  int ans = 0, i =0, t = 0;
  n = sc.nextInt();
  for(i=0; i<n ; i++) {
   t = sc.nextInt();
   arr.add(t);
  }
  for(i=0; i<n; i++) {
   ans = ans^arr.get(i);
  }
  while(--n > 0) {
   ans = ans ^ n; 
  }
  System.out.println(ans);
 }
}
