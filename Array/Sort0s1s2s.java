package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Sort0s1s2s {
 public static void main(String[] args) {
  ArrayList<Integer> arr = new ArrayList<>();
  int n;
  int one=0, two=0, zero=0;
  Scanner sc = new Scanner(System.in);
  n = sc.nextInt();
  for(int i=0; i<n; i++) {
   int t = sc.nextInt();
   if(t == 0)
    zero++;
   else if(t == 1)
    one++;
   else 
    two++;
  }
  int k=0;
  while(zero > 0) {
   arr.add(0);
   zero--;
  } 
  while(one > 0) {
   arr.add(1);
   one--;
  } 
  while(two > 0) {
   arr.add(2);
   two--;
  } 
  for(int i=0; i<n; i++) {
  System.out.println(arr.get(i));
 }
 }
 
}
