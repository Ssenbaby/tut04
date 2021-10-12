package ss;

import org.junit.jupiter.api.Test;

public class TestCalc {
    public int n1 = 1;
    public int n2 = 1;

    @Test
    public void Test1(){
        int n3 = new Calc().add(n1,n2);
        int n4 = n1+n2;
        assert(n3 == n4);
    }
}
