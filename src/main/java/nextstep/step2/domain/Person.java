package nextstep.step2.domain;

import java.util.Objects;

public class Person {

    private static final String EXCEPTION_MESSAGE = "이름은 5글자를 초과할 수 없습니다.";

    private final String name;

    private Person(String input) {
        this.name = input;
    }

    public static Person from(String input) {
        if (input.length() > 5) {
            throw new IllegalArgumentException(EXCEPTION_MESSAGE);
        }
        return new Person(input);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
