public class Demo {

  public static void main(String[] args) {

    if (args.length == 0) {
      for (int i = 1; i <= 5; i++) {
        for (int j = 0; j <= (5 - i); j++) {
          System.out.print(i);
        }
        System.out.println();
      }
    } else {
      int b = Integer.parseInt(args[0]);
      for (int i = 1; i <= b; i++) {
        for (int j = 0; j <= (b - i); j++) {
          System.out.print(i);
        }
        System.out.println();
      }
    }

  }

}
