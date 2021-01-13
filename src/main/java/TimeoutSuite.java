import org.testng.annotations.Test;

public class TimeoutSuite {
//    @Test
//    public void timeTestOne() throws InterruptedException {
//        Thread.sleep(1000); // will fail b/c it's execution time wss longer than timeout time defined in testng.xml; so the execution got cancelled
//        System.out.println("Time test method one");
//    }
//
//    @Test
//    public void timeTestTwo() throws InterruptedException {
//        Thread.sleep(400);
//        System.out.println("Time test method two");
//    }

    @Test(timeOut = 500) // can specify the timeout at individual test level aas well
    public void timeTestOne() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Time test method one");
    }

    @Test(timeOut = 500)
    public void timeTestTwo() throws InterruptedException {
        Thread.sleep(400);
        System.out.println("Time test method two");
    }
}
