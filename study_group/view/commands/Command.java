package study_group.view.commands;

import study_group.view.ConsoleUI;

public abstract class Command {
    ConsoleUI consoleUI;
    public String description;

    public Command(ConsoleUI consoleUI, String description) {
        this.consoleUI = consoleUI;
        this.description = description;
    }

    public Command(ConsoleUI consoleUI2) {
    }

    public abstract void execute();

    public Object getDescription() {
        return description;
    }
}
