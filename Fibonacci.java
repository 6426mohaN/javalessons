import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int p =0;
        int i =1;
        int count = 2;
        int FIB=0;

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        while (count < size)
        {
//            i=i+p;
//            int temp = i;

//            p=temp;
// 0 1 1 2 3 5 8 13 21

            FIB = p+i;
            p=i;
            i = FIB;


            count++;
        }
        System.out.println(FIB);
    }
}
