package testng_ex;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
    @Test(priority = 10, groups = "testWithoutAssert")      // testy uruchamiają się alfabetycznie, dlatego wpisujemy priority
    public void firstStep() {
        System.out.println("To jest pierwszy test w testng");
    }
    @Test(priority = 2, groups = "testsWithAsserts")
    public void secondStep() {
        System.out.println("A to jest drugi test");
        int result = 0;
        int x=2, y=3;
        result = x+y;    // assert - upewnij się, sprawdź

        Assert.assertEquals(result, 6);
    }

    @Test(priority = 3, dependsOnMethods = "secondStep", groups = "testWithoutAssert")
    public void myTest(){
        System.out.println("To jest mój test");
    }
}
