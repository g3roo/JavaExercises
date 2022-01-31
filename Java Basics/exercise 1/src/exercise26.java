import java.util.*;
 public class exercise26 {
     public static void main(String[] args){	
     try (Scanner in = new Scanner(System.in)) {
        System.out.print("Input a Sentence: ");
         String line = in.nextLine();
         String[] words = line.split("[ ]+");
         System.out.println("Penultimate word: "+words[words.length - 2]);
    }
	 }			
}