import java.util.Scanner;

class Tuesday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int rem = 0, n = 0, i = 0;

        while (num > 0 || i >= 10) {
            if (num == 0) {
                num = i;
                i = 0;
            }

            rem = num % 10;
            i += rem;
            num /= 10;
        }
        System.out.println(i);

    }
}
