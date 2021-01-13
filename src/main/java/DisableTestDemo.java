import org.testng.annotations.Test;

public class DisableTestDemo {
    @Test(enabled = true)
    public void testMethodOne() {
        System.out.println("Test method one.");
    }

    @Test(enabled = false) // will not excute b/c enabled = false
    public void testMethodTwo() {
        System.out.println("Test method two.");
    }

    @Test // default enabled is set to true, so this one doesn't need set the enabled
    public void testMethodThree() {
        System.out.println("Test method three.");
    }
}
