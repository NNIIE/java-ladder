package nextstep.step2.util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class SeparatorTest {

    @Test
    void success() {
        assertThat(Separator.separator("abc,abc,abc").size()).isEqualTo(3);
    }

    @Test
    void fail() {
        assertThatThrownBy(() -> Separator.separator("abc"))
                .isInstanceOf(IllegalArgumentException.class);
    }

}