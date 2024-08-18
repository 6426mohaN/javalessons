public class CountingNumbers {
    public static void main(String[] args) {
        int n = 1154984; // no of 3s are 5
        int count = 0;
        int modu = 0;

        while ((n/10)!=0)
        {
            modu = n%10;
            if(modu==3){
                count ++;
            }
            n = (n/10);
        }
        System.out.println(count);

    }
}
