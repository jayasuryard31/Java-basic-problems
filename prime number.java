import java.util.Scanner;

class Tuesday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int b = 1;
        if (num == 1)
            System.out.println("its neither prime nor composite");
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    System.out.println("not prime");
                    b++;
                    break;

                }
            }
            if (b == 1)
                System.out.println("its prime");
        }

    }
}
