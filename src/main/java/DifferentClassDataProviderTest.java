import org.testng.annotations.Test;

public class DifferentClassDataProviderTest {
    @Test(dataProvider = "data-provider", dataProviderClass = DifferentClassDataProviderDP.class) // specify the dataProvider class
    public void testMethod(String data) {
        System.out.println("Data is: " + data);
    }
}
