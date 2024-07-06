package Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UnionIntersection {
 public static void main(String[] args) {
  ArrayList<Integer> arr1 = new ArrayList<>();
  ArrayList<Integer> arr2 = new ArrayList<>();
  int n, m, t;
  Scanner sc = new Scanner(System.in);
  n = sc.nextInt();
  m = sc.nextInt();
  for(int i=0; i<n; i++) {
   t = sc.nextInt();
   arr1.add(t);
  }

  for(int i=0; i<m; i++) {
   t = sc.nextInt();
   arr2.add(t);
  }

  ArrayList<Integer> union = new ArrayList<>();
  int i=0, j=0;
  while(i<n && j<m) {
   if(arr1.get(i) == arr2.get(j)) {
    union.add(arr1.get(i));
    i++;
    j++;
   }
   else if(arr1.get(i) < arr2.get(j)) {
    union.add(arr1.get(i));
    i++;
   }
   else {
    union.add(arr2.get(j));
    j++;
   }
  }
  while(i<n) {
   union.add(arr1.get(i));
   i++;
  }
  while(j<m) {
   union.add(arr2.get(j));
   j++;
  }

  ArrayList<Integer> inter = new ArrayList<>();
  i=0;
  j=0;
  while(i<n && j<m) {
   if(arr1.get(i) == arr2.get(j)) {
    inter.add(arr1.get(i));
    i++;
    j++;
   }
   else if(arr1.get(i) < arr2.get(j)) {
    i++;
   }
   else {
    j++;
   }
  }
  System.out.print("Union = ");
  for(int k=0; k<union.size(); k++) {
   System.out.print(union.get(k)+ " ");
  }
  System.out.print("\nIntersection = ");
  for(int k=0; k<inter.size(); k++) {
   System.out.print(inter.get(k)+ " ");
  }
 }
}
