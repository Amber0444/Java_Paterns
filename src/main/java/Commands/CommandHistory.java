package Commands;

import java.util.Queue;

public class CommandHistory {
    private Queue<Command> queue;

    public void push(Command command) {
        queue.add(command);
    }

    public Command pop() {
        return queue.poll();
    }
}
