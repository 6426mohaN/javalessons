import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int x,y,sum;
//        System.out.println("Enter two numbers");
//
//        x=scanner.nextInt();
//        y=scanner.nextInt();
//
//        sum = x+y;
//
//        System.out.println("The Sum is "+sum);

//        System.out.println("Whats your name");
//        String name = scanner.nextLine();
//        System.out.println("How old are you");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Whats your fav food");
//        String fav = scanner.nextLine();
//
//        System.out.println("you are "+name+" and you are "+age+" years old"+" and you like "+fav);

//        char ch = scanner.next().trim().charAt(0);
//
//        if(ch>= 'a' && ch<='z')
//        {
//            System.out.println("small letter");
//        }
//        else {
//            System.out.println("Capital");
//        }
        int size = scanner.nextInt();
        int p =0;
        int i =1;
        int count = 2;
        int FIB=0;

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
