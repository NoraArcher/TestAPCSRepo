public class Demo {


  public static String arrToString(int[] arr){
    String penultimate = "";
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        penultimate += "" + arr[i];
      } else {
        penultimate += "" + arr[i] + ", ";
      }
    }
    return "{" + penultimate + "}";
  }

  public static String arrayDeepToString(int[][] arrB) {
    int[] arrA = new int[arrB.length];
    String Nultimate = arrToString(arrA);
    String ultimate = "";
    int counter = 0;
    for (int i = 0; i < Nultimate.length(); i++) {
      if (Nultimate.charAt(i) == '0') {
        ultimate += arrToString(arrB[counter]);
        counter ++;
      } else {
        ultimate += "" + Nultimate.charAt(i);
      }
    }
    return ultimate;
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue) {
    int[][] arr = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        arr[i][j] = (int)(Math.random() * (maxValue + 1));
      }
    }
    return arr;
  }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
    int[][] arr = new int[rows][];
    for (int i = 0; i < rows; i++) {
      int tempcol = (int)(Math.random() * (cols + 1));
      arr[i] = new int[tempcol];
      for (int j = 0; j < tempcol; j++) {
        arr[i][j] = (int)(Math.random() * (maxValue + 1));
      }
    }
    return arr;
  }

  public static void main(String[] args) {

    System.out.println(arrayDeepToString(create2DArray(4, 4, 4)).replace("}, ", "},\n "));
    System.out.println();
    System.out.println(arrayDeepToString(create2DArray(6, 2, 3)).replace("}, ", "},\n "));
    System.out.println();

    System.out.println(arrayDeepToString(create2DArrayRandomized(6, 4, 4)).replace("}, ", "},\n "));
    System.out.println();
    System.out.println(arrayDeepToString(create2DArrayRandomized(4, 10, 100)).replace("}, ", "},\n "));
    System.out.println();

    int b = 5;
    if (args.length != 0) {
      b = Integer.parseInt(args[0]);
    }
    for (int i = 1; i <= b; i++) {
      for (int j = 0; j <= (b - i); j++) {
        System.out.print(i);
      }
      System.out.println();
    }

  }


}
