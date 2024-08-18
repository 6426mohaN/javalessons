public class Reverse {
    public static void main(String[] args) {
        int n = 45683; // ans=38654
        int rev = 0;



        while (n>0){
            int rem = n%10;  //3        4568%10 === 8
            n/=10;          //4568      4568/10 === 456
            rev = (rev * 10) + rem; //0+3 ===3  3*10 + 8 === 38 ...


        }
        System.out.println(rev);
    }
}
