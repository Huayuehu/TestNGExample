import org.testng.annotations.Test;

import java.io.IOException;

public class ExceptionTestDemo {
    @Test(expectedExceptions = {IOException.class}, expectedExceptionsMessageRegExp = "Pass Message test")
    public void exceptionTestOne() throws Exception {
        throw new IOException("Pass Message test");
    }

//    @Test(expectedExceptions = {IOException.class, NullPointerException.class})
//    public void exceptionTestTwo() throws Exception {
//        throw new Exception(); // will fail b/c expected java.io.IOException but got java.lang.Exception
//    }

    @Test(expectedExceptions = {IOException.class}, expectedExceptionsMessageRegExp = ".* Message .*")
    public void exceptionTestTwo() throws Exception {
        throw new IOException("Pass Message test");
    }

    @Test(expectedExceptions = {IOException.class}, expectedExceptionsMessageRegExp = "Pass Message test")
    public void exceptionTestThree() throws Exception {
        throw new IOException("Fail Message test"); // will fail b/c expected "Pass.." but got "Fail..."
    }
}
