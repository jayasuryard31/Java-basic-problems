import java.util.Scanner;

class CurrencyCalc
{
    public static void main(String[] args)
    {
        int a=0,b=0,c=0,d=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount = sc.nextInt();
        if(amount % 100 != 0)
        {
            System.out.println("Enter the amount in hundreds only");
        }
        else
        {
        if(amount >= 2000)
        {
            a = amount/2000;
            System.out.println("number of 2000 notes are : "+a);
            amount=amount-(a*2000);

        }
        if(amount >= 500)
        {
            b = amount/500;
            System.out.println("number of 500 notes are : "+b);
            amount-=b*500;
        }
        if(amount >= 200)
        {
            c = amount/200;
            System.out.println("number of 200 notes are : "+c);
            amount-=c*200;
        }
        if(amount >= 100)
        {
            d = amount/100;
            System.out.println("number of 100 notes are : "+d);
            amount-=d*100;
        }
    }
        
    }
}