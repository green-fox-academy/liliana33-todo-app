import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

class ToDoMain {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Command Line Todo Application\n" +
                    "=============================\n" +
                    "\n" +
                    "Command line arguments:\n" +
                    " -l   Lists all the tasks\n" +
                    " -a   Adds a new task\n" +
                    " -r   Removes a task\n" +
                    " -c   Completes a task\n");

        } else if (args[0].equals("-l")) {
            Path tasks = Paths.get("src/tasks.txt");
            listTasks();
        }
    }

    public static void listTasks() {

        try {
            Path filePath = Paths.get("src/tasks.txt");
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(0));
            }
            if (lines.isEmpty()) {
                System.out.println("No todos for today! :)");
            }

        }
        catch (IOException e) {
                System.out.println("Could not read the file");
                System.exit(2);
        }
    }
}