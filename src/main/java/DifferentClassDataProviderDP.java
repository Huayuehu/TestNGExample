import org.testng.annotations.DataProvider;

/**
 * TestNG @DataProvider and @Test in different class
 */
public class DifferentClassDataProviderDP {
    @DataProvider(name = "data-provider")
    public static Object[][] dataProviderMethod() {
        return new Object[][] { { "data one" }, { "data two"}, { "date three"} };
    }
}
