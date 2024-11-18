package org.example.task9;

class CloseWindowCommand implements Command {
    private Window window;

    public CloseWindowCommand(Window window) {
        this.window = window;
    }

    @Override
    public void execute() {
        window.close();
    }
}