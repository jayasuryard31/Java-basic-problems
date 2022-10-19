import java.util.Scanner;

class Tuesday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int t = num, o = 0, i = 0;
        while (t != 0) {
            if (t == num || t < 10)
                o += t % 10;
            else
                i += t % 10;
            t /= 10;
        }
        System.out.println(o+" : "+i);
        if (o == i) {
            System.out.println("Xylem");
        } else {
            System.out.println("Phloem");

        }
    }
}