import java.util.Scanner;

public class task15 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        num=input.nextInt();
        System.out.println("Enter an integer: ");
        if(num%2==0||num%3==0)
        {
            System.out.println(num+"is divisible by 2 or 3.");
        }
        if(num%2==0&&num%3==0)
        {
            System.out.println(num+"is divisible by 2 and 3");
        }
        if(num%2==0^num%3==0)
        {
            System.out.println(num+"is divisible by 2 or 3,but not both");
        }
    }
}
