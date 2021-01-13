import org.testng.annotations.*;

public class ParallelSuiteTest {
    String testName = "";

    @BeforeTest
    @Parameters({ "test-name" })
    public void beforeTest(String testName) {
        this.testName = testName;
        long id = Thread.currentThread().getId();
        System.out.println("Beforetest " + testName + ". Thread id is: " + id);
    }

    @BeforeClass
    public void beforeClass() {
        long id = Thread.currentThread().getId();
        System.out.println("Beforeclass " + testName + ". Thread id is: " + id);
    }

    @Test
    public void testMethodOne() {
        long id = Thread.currentThread().getId();
        System.out.println("Sample method " + testName
                + ". Thread id is: " + id);
    }

    @AfterClass
    public void afterClass() {
        long id = Thread.currentThread().getId();
        System.out.println("Afterclass  " + testName
                + ". Thread id is: " + id);
    }

    @AfterTest
    public void afterTest() {
        long id = Thread.currentThread().getId();
        System.out.println("Aftertest  " + testName + ". Thread id is: " + id);
    }
}
