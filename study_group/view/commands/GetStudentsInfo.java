package study_group.view.commands;

import study_group.view.ConsoleUI;

public class GetStudentsInfo extends Command {

    public GetStudentsInfo(ConsoleUI consoleUI) {
        super(consoleUI, "Get list of students");
    }

    public void execute() {
        consoleUI.getStudentsInfo();
    }
}
