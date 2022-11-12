package nextstep.step2.domain;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Persons {

    private final List<Person> persons;

    public Persons(List<String> input) {
        this.persons = createPersons(input);
    }

    public List<Person> getPersons() {
        return persons;
    }

    private static List<Person> createPersons(List<String> input) {
        return input.stream()
                .map(Person::from)
                .collect(Collectors.toList());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persons persons1 = (Persons) o;
        return Objects.equals(getPersons(), persons1.getPersons());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPersons());
    }
}
