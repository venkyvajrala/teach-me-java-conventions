import org.junit.Test;

public class PowerTest {

    @Test
    public void onePowerOne() {
        int actual=PowerFinder.pow(1,1);
        int expected=1;
        assert actual==expected;
    }

    @Test
    public void twoPowerOne() {
        int actual=PowerFinder.pow(2,1);
        int expected=2;
        System.out.println(actual);
        assert actual==expected;
    }

    @Test
    public void twoPowerTwo() {
        int actual=PowerFinder.pow(2,2);
        int expected=4;
        assert actual==expected;
    }

    @Test
    public void threePowerTwo() {
        int actual=PowerFinder.pow(3,2);
        int expected=9;
        assert actual==expected;

    }
}
