package chapterFour;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.printf("%-3s %-4s %-5s %-6s %n", "N", "N2", "N3", "N4");
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            int first = i * count;
            int second = first * count;
            int third = second * count;
            System.out.printf("%-3s %-4s %-5s %-6s %n", i, first, second, third);
            count++;
        }
    }
}
