package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTest {

    Sample sample = new Sample();

    @Test
    public void opTest() {
        Assertions.assertThat(sample.op(Sample.Operation.ADD, -5, -10)).isEqualTo(-15);
        Assertions.assertThat(sample.op(Sample.Operation.ADD, 0, -5)).isEqualTo(-5);
        Assertions.assertThat(sample.op(Sample.Operation.ADD, 10, -5)).isEqualTo(5);
        Assertions.assertThat(sample.op(Sample.Operation.ADD, 0, 0)).isEqualTo(0);
        Assertions.assertThat(sample.op(Sample.Operation.ADD, 0, 5)).isEqualTo(5);
        Assertions.assertThat(sample.op(Sample.Operation.ADD, 10, 5)).isEqualTo(15);
        Assertions.assertThat(sample.op(Sample.Operation.MULT, -5, -10)).isEqualTo(50);
        Assertions.assertThat(sample.op(Sample.Operation.MULT, 0, -5)).isEqualTo(0);
        Assertions.assertThat(sample.op(Sample.Operation.MULT, 10, -5)).isEqualTo(-50);
        Assertions.assertThat(sample.op(Sample.Operation.MULT, 0, 0)).isEqualTo(0);
        Assertions.assertThat(sample.op(Sample.Operation.MULT, 0, 5)).isEqualTo(0);
        Assertions.assertThat(sample.op(Sample.Operation.MULT, 10, 5)).isEqualTo(50);
    }

    @Test
    public void factTest() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> sample.fact(-1));
        Assertions.assertThat(sample.fact(0)).isEqualTo(1);
        Assertions.assertThat(sample.fact(1)).isEqualTo(1);
        Assertions.assertThat(sample.fact(2)).isEqualTo(2);
        Assertions.assertThat(sample.fact(5)).isEqualTo(120);
        Assertions.assertThat(sample.fact(10)).isEqualTo(3628800);
    }
}
