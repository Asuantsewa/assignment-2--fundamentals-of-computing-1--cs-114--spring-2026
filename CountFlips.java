import java.util.Random;
public class CountFlips {
  public static void main(String[] args) {
    final int HEADS = 0;
    int face;

     public Coin(){
      Random random = new Random();
      flip();
    }

    public void flip() {
      face = (int) (Math.random() * 2);
    }
     public boolean isHEADS() {
      RETURN(FACE == HEADS);
     }

     public String toString(){
      String faceName;

      if(face == HEADS){
        faceName = "Heads";
      }else{
        faceName = "Tails";
      }
      return faceName;
    }
  }
}
