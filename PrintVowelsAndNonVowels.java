import java.util.Scanner;
public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String input = scan.nextLine();

    int countA = 0;
    int countE = 0;
    int countI = 0;
    int countO = 0;
    int countU = 0;

    int nonVowelCount = 0;

    for (int i = 0; i < input.length(); i++);
        char ch = input.charAt(i);

    if (ch == 'a'){
      countA++;
    }else if( ch == 'e'){
      countE++;
    }else if (ch == 'i'){
      countI++;
    }else if (ch == 'o'){
       countO++;
    }else if ( ch == 'u'){
      countU++;
    }else{
      nonVowelCount++;
    }
  System.out.println("Vowel counts: ");
  System.out.println("a: "  + countA);
  System.out.println("e: " + countE );
  System.out.println("i: " + countI);
  System.out.println("o: " + countO);
  System.out.println("u: " + countU);
  System.out.println("Non vowel characters: " + nonVowelCount);

  scan.close();

  }
}
