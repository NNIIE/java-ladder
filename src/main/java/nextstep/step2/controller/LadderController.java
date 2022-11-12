package nextstep.step2.controller;

import nextstep.step2.domain.Persons;
import nextstep.step2.view.InputView;

public class LadderController {

    public void start() {
        new Persons(InputView.inputPersonName());
    }
}
