import java.util.Scanner;

class Tuesday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int x = 0, square = num * num, t = num, i = 1;
        while (num != 0) {
            x++;
            num /= 10;
        }
        while (x > 0) {
            i = i * 10;
            x--;
        }
        int end = (int) square % i;
        if (end == t) {
            System.out.println("Automorphic");
        } else {
            System.out.println("not Automorphic");

        }
    }
}