//Printing the values using main method and String Args operator 
public class Recusion {
    public static void main(String[] args) {
        recusion(10);
    }

    public static void recusion(int N) {
        if (N == 0)
            return;
        recusion(N - 1);
        System.out.println(N + " ");
    }

}
