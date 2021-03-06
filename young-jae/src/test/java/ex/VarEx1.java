package ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VarEx1 {

    @Test
    void test(){
        int year = 0;
        int age = 14;

        year = age + 2000; //변수 age의 값에 2000을 더하여 year에 저장
        age = age + 1; // 변수 age에 저장된 값을 1 증가

        assertThat(year).isEqualTo(2014);
        assertThat(age).isEqualTo(15);
    }
}
