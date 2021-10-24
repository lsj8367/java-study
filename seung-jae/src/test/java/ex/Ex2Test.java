package ex;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class Ex2Test {

    @Test
    void test() {
       Ex2 ex2 = new Ex2(10, 20);

       assertThat(ex2.getA()).isEqualTo(10);
       assertThat(ex2.getB()).isEqualTo(20);

       ex2.swap();

       assertThat(ex2.getA()).isEqualTo(20);
       assertThat(ex2.getB()).isEqualTo(10);
    }


}
