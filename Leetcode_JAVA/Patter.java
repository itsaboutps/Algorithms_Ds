package LeetcodeProblems;

class Patter {
    public static void main(String[] args) {
        System.out.println("hello");
        triangle(2);

    }

    public static void triangle(int n) {
        for (int row = 0; row < 2 * n; row++) {

            int count = n;
            if (row >= n) {
                count = ((2 * n) - 1 - row)-1;
            } else {
                count = row;
            }
            for (int col = 0; col <= count; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}