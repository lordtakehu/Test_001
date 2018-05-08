package javaTest;
import java.util.Scanner;

public class TestAppEnv {

	private static Scanner scan;

	public static String getUrl() {
		scan = new Scanner(System.in);
        System.out.println("Please enter a link");
        String num = scan.nextLine();
        return "http://"+num;
	}

	public static String getKey() {
		scan = new Scanner(System.in);
        System.out.println("Please enter a search text");
        String num = scan.nextLine();
        return num;
	}
}