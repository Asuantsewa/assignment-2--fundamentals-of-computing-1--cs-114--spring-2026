import java.util.Random;
public class CountFlips {
  public static void main(String[] args) {
    Random random = new Random();
    int heads = 0;
    int tails = 0;

  for (int i = 0; i < 100; i++) {
  if (random.nextInt(2) == 0) {
    heads++;
  } else {
    tails++;
  }
}

    System.out.println("After 100 flips:");
    System.out.println("Heads: " + heads);
    System.out.println("Tails: " + tails);
  }
}
