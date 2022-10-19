import java.util.Scanner;

class ElectricityBill {
    public static void main(String[] args) {
        double x = 0;
        double d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of units consumed");
        int units = sc.nextInt();
        System.out.println("Enter the due amount");
        int due = sc.nextInt();
        if (units > 50) {
            if (units > 50 && units <= 100) {
                units -= 50;
                x = units * 3;

            } else if (units > 100 && units <= 150) {
                units -= 100;
                x = units * 5 + 150;

            } else if (units > 150 && units <= 200) {
                units -= 150;
                x = units * 8 + 400;

            } else if (units > 200 && units <= 250) {
                units -= 200;
                x = units * 10 + 800;

            } else {
                units -= 250;
                x = units * 20 + 1300;
            }
        } else {
            System.out.println("it is free of cost");
        }

        if (due == 0) {
            d = x * 0.05;
            x -= d;
            System.out.println("congratulations you have the discount of Rs."+d+"\nAmount to be payed is Rs." + x);
        } else {
            d = due * 0.1;
            System.out.println("penalty = Rs."+d);
            d += due;
            x += d;
            System.out.println("Amount to be payed is Rs." + x);
        }

    }
}
