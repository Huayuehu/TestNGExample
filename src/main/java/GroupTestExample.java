import org.testng.annotations.Test;

public class GroupTestExample {
    @Test(groups = { "test-group" })
    public void testMethodOne() {
        System.out.println("Test method one belonging to the group.");
    }

    @Test
    public void testMethodTwo() {
        System.out.println("Test method two not belonging to the group.");
    }

    @Test(groups = { "test-group" })
    public void testMethodThree() {
        System.out.println("Test method three belonging to the group.");
    }
}
