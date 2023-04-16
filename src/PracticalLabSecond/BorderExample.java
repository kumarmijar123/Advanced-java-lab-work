package PracticalLabSecond;

public class BorderExample {
	   public static void main(String[] args) {
	      String text = "Hello, world!";
	      
	      // Single line border
	      System.out.println("+" + "-".repeat(text.length() + 2) + "+");
	      System.out.println("| " + text + " |");
	      System.out.println("+" + "-".repeat(text.length() + 2) + "+");
	      
	      // Double line border
	      System.out.println("+" + "=".repeat(text.length() + 2) + "+");
	      System.out.println("| " + text + " |");
	      System.out.println("+" + "=".repeat(text.length() + 2) + "+");
	      
	      // Dashed border
	      System.out.println("*" + "-".repeat(text.length() + 2) + "*");
	      System.out.println("| " + text + " |");
	      System.out.println("*" + "-".repeat(text.length() + 2) + "*");
	      
	      // Custom border
	      String borderChar = "#";
	      int borderWidth = 5;
	      System.out.println(borderChar.repeat(borderWidth) + " " + text + " " + borderChar.repeat(borderWidth));
	   }
	}
