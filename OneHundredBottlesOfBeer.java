import java.util.Scanner;
public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int verses = 0;

    System.out.println("How many verses do you want to print ? (1-100)");

    if (scanner.hasNextInt()){
      verses = scanner.nextInt();
      if(verses <1 || verses>100){
      System.out.println("Please enter a number between 1 and 100");
      return;
      }
      }else{
        System.out.println("INvalid inpput. Please enter a whole number: ");
      return;
      }
  for (int i = 100; i >100 - verses; i--) {
    System.out.println( i + " bottles of beer on the wall, " + i + " bottles of beer");
    System.out.println("If one of the bottles should happpen to fall");
    System.out.println(( i -1) + " bottles of beer on the wall");
    System.out.println();
  }
  scanner.close();
  }
}
