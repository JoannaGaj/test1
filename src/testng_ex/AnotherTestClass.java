package testng_ex;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AnotherTestClass {
    @Test (groups = "testsWithAsserts")
    public void testOfAnotherModule() {
        System.out.println("To jest test innego modułu z klasy testOfAnotherModule ");

        Assert.assertTrue(2==2);
    }

    @Test (groups = "testsWithAsserts")
    @Parameters({"name"})
    public void checkName(String expectedName){
        String name = "";
        name = "Zenon";

        Assert.assertEquals(name, expectedName);
    }

    @Test (dataProvider = "namesDp", groups = "testsWithAsserts")
    public void checkNameWithDataProvider(String firstName, String secondName){
        System.out.printf("Sprawdzam dane imię: %s, nazwisko: %s", firstName, secondName);

        Assert.assertEquals("Tola", firstName);
        Assert.assertEquals("Dudek", secondName);
    }

    @DataProvider(name = "namesDp")
    public Object[][] provideNames () {
        return new String[][]{
                {"Anna", "Nowak"},
                {"Tomasz", "Kowalski"},
                {"Tola", "Dudek"}
        };
    }
}
