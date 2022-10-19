import java.util.Scanner;
class Tuesday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int x = num;
        int rem = 0, n = 1, i = 0,count=0,count1=1;
        while(num!=0)
        {
            num/=10;
            count++;
        }
        num = x;
        System.out.println("number of digits :"+count);
        System.out.print("Sum of :");
        while (num != 0) {
            count1 = count;
            rem = num % 10;
            //System.out.println(rem+" = reminder");
            //System.out.println(count+" = count");
            while(count>0)
            {
                n*=rem;
                count--;
            }
            System.out.print(n + " ");
            i += n;
            count = count1;
            n=1;
            num /= 10;
        }
        System.out.println(" = "+i);
        if (i == x)
            System.out.println("the given number is armstrong number");

        else
            System.out.println("The given number is not Armstrong number");

    }
}
