package AutomationTest.CyberSoft.Selenium.ASM_SwagLabs.TestNg;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrderFlowTest {
    @BeforeClass
    public void oneTimeSetUp(){
        System.out.println("tui la onetime set up class do nhen");
    }
    @BeforeMethod
    public void seUp(){
        System.out.println("tui la setup do nhen");
    }
    @Test
    public void Test1(){
        System.out.println("day la test 1");
        Assert.assertTrue(1==1);
    }
    @Test
    public void Test2(){
        System.out.println("day la test 2");
        Assert.assertTrue(1==2,"1 khong bang 2 nhen may");
    }
    @Test(enabled = false)
    public void Test3(){
        int a=1/0;
        System.out.println("day la test 3");
        Assert.assertTrue(1==1);
    }
    @AfterMethod
    public void oneTimetearDown(){
        System.out.println("tui la teardown do nhen");
    }
}
