package fr.lernejo;



import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

class SampleTest {

    private static Sample sample = new Sample();

    @Test
    void addition_2_et_3_should_5() {
        int a = 2;
        int b = 3;

        Sample.Operation operation = Sample.Operation.ADD;
        int result = sample.op(operation, a, b);
        assertThat(result).as("result of 2 + 3 ").isEqualTo(5);
    }

    @Test
    void Mult_2_et_3_should_6() {
        int a = 2;
        int b = 3;
        Sample.Operation operation = Sample.Operation.MULT;
        int result = sample.op(operation, a, b);
        assertThat(result).as("result of 2 * 3 ").isEqualTo(6);
    }

    @Test
    void Factoriel() {
        int n = 0;
        int a = -1;
        int b = 2;
        int factoriel = sample.fact(n);
        int factorielb = sample.fact(b);
        assertThat(factoriel).as("factoriel of 0").isEqualTo(1);
        Assertions.assertThatIllegalArgumentException().isThrownBy(() -> sample.fact(a));
        assertThat(factorielb).as("factoriel of 2").isEqualTo(2);
    }
}
