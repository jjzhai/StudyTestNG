package priv.jjzhai.test;
import org.testng.annotations.*;

public class TestNGLearn1 {

    @BeforeClass
    public void setUp() {
        System.out.println("this is before class");
    }

    @Test(groups = { "fast" })
    public void aFastTest() {
        System.out.println("Fast test.");
    }

    @Test(groups = { "slow" })
    public void aSlowFast() {
        System.out.println("Slow test.");
    }
}