public class Square {

  public static void main(String[] args) {
    Square square = new Square();

    System.out.println(square.isPerfectSquare(224));

  }

  private long isPerfectSquare(long x) {

    long a = (long)Math.sqrt(x);

    if(a * a == x) {
      a++;
      a = a * a;
    }else {
      throw new IllegalArgumentException("Not a perfect square");
    };
  return x;
  }

}

