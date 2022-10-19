import java.util.Scanner;

class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        for (;;) {
            System.out.println("SIMPLE CALCULATOR\n-------------------------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Muliplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Choose your option");
            int c = sc.nextInt();
            switch (c) {
                case 1: {
                    System.out.println("Enter two numbers");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    Thursday.Sum(a, b);

                    break;
                }

                case 2:
                    System.out.println("Enter two numbers");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    Thursday.Sub(a, b);
                    break;
                case 3:
                    System.out.println("Enter two numbers");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    Thursday.Mul(a, b);
                    break;
                case 4:
                    System.out.println("Enter two numbers");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    Thursday.Div(a, b);
                    break;
                case 5:
                    System.out.println("Do really want to exit\nY(yes)\nN(no)");
                    char f = sc.next().charAt(0);
                    if (f == 'Y') {
                        System.exit(0);
                    } else {
                        break;
                    }
                default:
                    System.out.println("Invalid choice");

            }

        }

    }
}