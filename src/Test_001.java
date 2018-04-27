import static org.junit.Assert.*;

import org.junit.Test;


public class Test_001 {
	@Test
	public void test(){
		int result=2*5;
		assertEquals("Result is 12 instead of",10,result);
		System.out.println("Result is correct");
		result=result++;
		System.out.println(result++);
		System.out.println(result);
		int i = 4;
		System.out.println(++i == 5); //true
		System.out.println(i);//5
		System.out.println(i++);//false
		System.out.println(i);//6
	}
}
