public class ToDoMain {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Command Line Todo Application\n" +
                    "=============================\n" +
                    "\n" +
                    "Command line arguments:\n" +
                    "-l   Lists all the tasks\n" +
                    "-a   Adds a new task\n" +
                    "-r   Removes a task\n" +
                    "-c   Completes a task");
        }
    }
}
