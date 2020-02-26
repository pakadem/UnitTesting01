import org.junit.*;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class MavenUnit01Test {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void main() {
    }

    //Object Equality
    @Test
    public void additionEquality() {
        Assert.assertEquals(8, MavenUnit01.addition(3,5));
    }

    //Object Identity
    @Test
    public void additionIdentity() {
        Assert.assertNotSame(8, MavenUnit01.addition(3,5));
    }

    //Timeouts
    @Test(timeout = 6)
    public void additionTimeOut() {
        while (true);
    }

    //Failing
    @Test
    public void additionFail() {
        Assert.assertNotEquals(2, MavenUnit01.addition(3,5));
    }

    //Disabled Test
    @Ignore
    @Test
    public void additionDisable() {
        Assert.assertEquals(8, MavenUnit01.addition(3,5));
    }
}
