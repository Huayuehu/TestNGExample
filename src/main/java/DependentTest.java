import org.testng.annotations.Test;

public class DependentTest {
    @Test(dependsOnMethods = { "testTwo", "testThree" })
    public void testOne() {
        System.out.println("Test method one");
    }

    @Test
    public void testTwo() {
        System.out.println("Test method two");
    }

    @Test
    public void testThree() {
        System.out.println("Test method three");
    }

    @Test(dependsOnGroups = { "test-group" })
    public void groupTestOne() {
        System.out.println("Group Test method one");
    }

    @Test(groups = { "test-group" })
    public void groupTestTwo() {
        System.out.println("Group Test method two");
    }

    @Test(groups = { "test-group" })
    public void groupTestThree() {
        System.out.println("Group Test method three");
    }
}

