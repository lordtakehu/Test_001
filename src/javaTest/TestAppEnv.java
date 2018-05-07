package javaTest;
import java.util.Scanner;

public class TestAppEnv {

	private static Scanner scan;

	public static Object getUrl() {
		scan = new Scanner(System.in);
        String num = "0";
        //int sum = 0;

        System.out.println("Please enter a link");
        num = scan.nextLine();
        return "http://"+num;
	}
}
