package chap3;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Ex3Test {

    @ParameterizedTest
    @MethodSource
    void solution(int score, char expected) {
        Ex3 ex3 = new Ex3(score);
        assertThat(ex3.solution()).isEqualTo(expected);
    }

    private static Stream<Arguments> solution() {
        return Stream.of(
            Arguments.of(95, 'A'),
            Arguments.of(85, 'B'),
            Arguments.of(65, 'D'),
            Arguments.of(55, 'D')
        );
    }

}
