import java.util.Scanner;

class SimpleCAlc
{
    public static void main(String[] args)
    {   int s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation you want\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modular Division");
        int n = sc.nextInt();
        System.out.println("Enter First number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();
        switch(n)
        {
            case 1:
                    s = a+b;
                    System.out.println("Sum of "+a+" and "+b+" = "+s);
                    break;
            case 2:
                    s = a-b;
                    System.out.println("Subtraction of "+a+" with "+b+" = "+s);
                    break;
            case 3:
                    s = a*b;
                    System.out.println("Multiplication of "+a+" and "+b+" = "+s);
                    break;
            case 4:
                    s = a/b;
                    System.out.println("Division of "+a+" by "+b+" = "+s);
                    break;
            case 5:
                    s = a%b;
                    System.out.println("Modular division of "+a+" and "+b+" = "+s);
                    break;

            default:System.out.println("Invalid choice");    
        }
        
    }
}
