package Pages.four;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends test.four.SauceDemo_Test implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {


    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("\n------------------Test SuccessFul-------------");

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {



    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
