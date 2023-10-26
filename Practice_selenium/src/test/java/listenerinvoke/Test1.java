package listenerinvoke;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerinvoke.Listenerinvoke.class)
public class Test1 {//class
	@Test
	public void test1() {    //method names
		System.out.println("code1");
	}

	@Test
	public void test2() {  //method names
		System.out.println("code2");
	}

}
