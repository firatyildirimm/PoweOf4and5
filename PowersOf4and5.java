import java.util.Scanner;

public class PowersOf4and5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        for(int i=1;i<n;i*=4){
            System.out.println(i);
        }
        for(int i=1;i<n;i*=5){
            System.out.println(i);
        }
    }
}
