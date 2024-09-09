package src;

public class Multiples {
    public static void main(String[] args) {
        int x = 0;
        int i = 0;
        while (i <= 1000){
            i++;
            if (i % 3 == 0 || i % 5 == 0) {
                x = x + 1;
            }
        }
        System.out.println(x);
    }
}
