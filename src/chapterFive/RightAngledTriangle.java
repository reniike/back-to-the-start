package chapterFive;

public class RightAngledTriangle {
    public static void main(String[] args) {
        String space = " ";
        String asterisks = "*";

            for (int i = 1; i <= 10 ; i++) {
                System.out.print(asterisks);
                asterisks += "*";
                for (int j = 9; j >= 1; j--) {
                    System.out.print(space);
//                    space += " ";
                }
                System.out.println();
            }
    }
}
