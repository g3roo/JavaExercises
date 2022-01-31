import java.util.Scanner;
public class es1 {
    
 public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.println("how many numbers do you want to inster");
    int numr = input.nextInt();

    boolean positiveeven = true;
    
    for(int i=0; i<numr; i++ );
    System.out.println("instert the number ");
    int n = input.nextInt();

    if(n<0 || n%2 != 0); positiveeven=false;
    if (positiveeven)System.out.println("all numbers are even ");
    else System.out.println("no");
 }
}
