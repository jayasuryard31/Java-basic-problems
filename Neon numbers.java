import java.util.Scanner;

class Tuesday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int x = num;
        int rem = 0, n = x*x, i = 0;
        System.out.print("The sum of : ");
        while(n!=0)
        {
            rem = n%10;
            System.out.print(rem+" ");
            i+=rem;
            n/=10;
        }
        System.out.println("= "+i);

        if (i == x)
            System.out.println("the given number is neon number");

        else
            System.out.println("The given number is not neon number");

    }
}
