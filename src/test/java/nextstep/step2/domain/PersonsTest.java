package nextstep.step2.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class PersonsTest {

    @Test
    void success() {
        Persons persons = new Persons(Arrays.asList("123", "456", "789"));
        assertThat(persons.getPersons().size()).isEqualTo(3);
    }

}