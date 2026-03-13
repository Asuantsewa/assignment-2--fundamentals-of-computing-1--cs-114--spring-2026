public class TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
    for (int day = 1; day<= 12; day++) {
      System.out.println("On the " + getDaySuffix(day) + "day of christmas my true love gave to me:");
  
  switch (day){
      case 12: System.out.println("Twelve drummers drumming, ");
      case 11: System.out.println("Eleven pipers piping,");
      case 10: System.out.println("Ten lords are leaping,");
      case 9: System.out.println("NIne ladies dancing,");
      case 8: System.out.println("Eight maids a-milking,");
      case 7: System.out.println("Seven swans a-swimming,");
      case 6: System.out.println("Six geese a-laying,");
      case 5: System.out.println("Five golden rings,");
      case 4: System.out.println("Four calling birds,");
      case 3: System.out.println("Three french hens,");
      case 2: System.out.println("Two turtle doves,");
      case 1: 
        if (day == 1) {
       System.out.println("A partridge in a pear tree.");
       } else {
       System.out.println("And a patridge in a pear tree.");
       }
       }
       System.out.println();
      }
    }
  private static String getDaySuffix(int day){
    switch (day) {
    case 1:return "1st ";
    case 2:return "2nd ";
    case 3:return "3rd ";
    case 4:return "4th ";
    case 5:return "5th ";
    case 6:return "6th ";
    case 7:return "7th ";
    case 8:return "8th ";
    case 9:return "9th ";
    case 10:return "10th ";
    case 11:return "11th ";
    case 12: return "12th ";

    default: return " ";
    }
  }
}
