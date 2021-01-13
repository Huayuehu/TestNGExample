import org.testng.annotations.*;


public class MyFirstTest {
    @Test
    public void testCase() {
        System.out.println("Test cases here...");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite method");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite method");
    }

    @BeforeClass
    public void beforeTest() {
        System.out.println("Before Test method");
    }

    @AfterClass
    public void afterTest() {
        System.out.println("After Test method");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }
}
