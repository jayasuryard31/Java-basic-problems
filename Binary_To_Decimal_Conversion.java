import java.util.Scanner;

class Tuesday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int rem=0,bin=0;
        int i=1;
        while(num!=0)
        {
            rem = num%10;
            bin =bin+ rem*i; 
            i=i*2;
            num=num/10;
        }
        System.out.println("decimal number : "+bin);
    }
}
