import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
    /**
     * Following method takes one parameter as input.
     * Value of the said parameter is defined at SUITE level
     */
    @Parameters({ "suite-param" })
    @Test
    public void parameterTestOne(String param) {
        System.out.println("Test one suite param is: " + param);
    }

    /**
     * Following method takes one parameter as input.
     * Value of the said parameter is defined at TEST level
     */
    @Parameters({ "test-two-param" })
    @Test
    public void parameterTestTwo(String param) {
        System.out.println("Test two param is: " + param);
    }

    /**
     * Following method takes one parameter as input.
     * Value of the said parameter is defined at TEST level.
     * The SUITE level parameter is overridden ar the TEST level
     */
    @Parameters({ "suite-param", "test-three-param" })
    @Test
    public void parameterTestThree(String param, String paramTwo) {
        System.out.println("Test three suite param is: " + param);
        System.out.println("Test three param is: " + paramTwo);
    }


    @Parameters({ "optional-value" })
    @Test
    public void optionalTest(@Optional("optional value") String value) {
        System.out.println("This is: " + value);
    }
}
