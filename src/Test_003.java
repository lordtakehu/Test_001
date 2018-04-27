import java.util.Scanner;

public class Test_003 {
    private static Scanner scan;

	public static void main(String[] args) {
        scan = new Scanner(System.in);
        String num = "0";
        //int sum = 0;

        System.out.println(
            "Please enter a name");
        num = scan.nextLine();

        /*System.out.println(
            "Here are the digits and the sum of the digits");
        while (num > 0) {
            System.out.println("==>" + num % 10);
            sum += num % 10;
            num = num / 10;   
        }*/
        System.out.println("Name is " + num);            
    }
}