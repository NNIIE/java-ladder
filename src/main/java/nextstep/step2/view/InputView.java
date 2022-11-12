package nextstep.step2.view;

import nextstep.step2.util.Separator;

import java.util.List;
import java.util.Scanner;

public class InputView {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String INPUT_PERSON_MESSAGE = "참여할 사람 이름을 입력하세요. (이름은 쉼포(,)로 구분하세요)";

    private InputView() {}

    public static List<String> inputPersonName() {
        System.out.println(INPUT_PERSON_MESSAGE);
        return Separator.separator(SCANNER.nextLine());
    }
}
