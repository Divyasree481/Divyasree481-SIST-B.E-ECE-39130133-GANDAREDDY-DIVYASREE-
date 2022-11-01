import java.util.ArrayList;
import java.util.*;
public class Main
{

   
  public static void main(String[] args) {
    ArrayList<Integer> li = new ArrayList<Integer>(); 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the element to push and find the average from the list");
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        i=sc.nextInt();
        li.add(i);
    }
    int total = 0;
    int avg;
    for(int i = 0; i < li.size(); i++)
    
        total += li.get(i);
        avg = total / li.size(); 
        System.out.println("The Average is: " + avg);
    
  }
}
