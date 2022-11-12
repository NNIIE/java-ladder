package nextstep.step2.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PersonTest {

    @Test
    void success() {
        assertThat(Person.from("abc").getName()).isEqualTo("abc");
    }

    @Test
    void fail() {
        assertThatThrownBy(() -> Person.from("abcdef"))
                .isInstanceOf(IllegalArgumentException.class);
    }

}