import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * TestNG @DataProvider and @Test in the same class
 */
public class SameClassDataProvider {
    @DataProvider(name = "data-provider")
    public Object[][]  dataProviderMethod() { // it is mandatory for a DataProvider method to return the data in the form of Object[][]
        return new Object[][] { { "data one" }, { "data two"}, { "date three"} };
    }

    @Test(dataProvider = "data-provider")
    public void testMethod(String data) {
        System.out.println("Data is: " + data);
    }
}
