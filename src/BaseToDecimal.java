import java.util.Scanner;

public class BaseToDecimal {
    static int findDec(int base){
        int dec = 0, n = 0;
        while(base>0){
            int temp = base%10;
            dec+=temp*Math.pow(2,n);
            n++;
            base/=10;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        System.out.println(findDec(base));
    }
}
