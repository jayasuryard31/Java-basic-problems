import java.util.Scanner;

class Tuesday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int x = num;
        int fac = 1, i, sum = 0,fact=1;
        while (num != 0) {
            fact = num % 10;
            fac =1;
            for (i = 1; i <= fact; i++) {
                fac = fac * i;
            }
            System.out.println("Factorial of "+fact+" = "+fac);
            sum+=fac;
            num = num / 10;
        }
        System.out.println("\nSum : "+sum);
        if(sum == x)
        {
            System.out.println("The given number is Strong number");
        }
        else{
            System.out.println("The given number is not a Strong number");
        }


    }
}
