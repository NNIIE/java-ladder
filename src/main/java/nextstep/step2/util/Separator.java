package nextstep.step2.util;

import java.util.Arrays;
import java.util.List;

public class Separator {

    private final static String SEPARATOR_COMMA = ",";
    private final static String EXCEPTION_MESSAGE = "쉼표로 구분해 주세요.";

    private Separator() {}

    public static List<String> separator(String input) {
        if (!input.contains(SEPARATOR_COMMA)) {
            throw new IllegalArgumentException(EXCEPTION_MESSAGE);
        }
        return Arrays.asList(input.split(SEPARATOR_COMMA));
    }
}
