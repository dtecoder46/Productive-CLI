import java.util.Scanner;

public class Main {

	/*
	 * Name: print()
	 * Purpose: to make printing easier
	 * Parameters: text - the string to print
	 * Returns: none
	 */

	public static void print(String text) {
		System.out.println(text);
	}

	/*
	 * Name: promptLoop()
	 * Purpose: to continuously ask for task input
	 * Parameters: none
	 * Return: taskList
	 */

	public static String[] promptLoop() {

		// initialize variables
		
		Scanner input = new Scanner(System.in);

                String taskInput = "";
                int taskIndex = 0;
                String[] taskList = new String[10]; // task total limited to 10 to prevent overworking
		
		// repetitive prompting for tasks

                while (taskIndex <= 9) {

                        print("Enter a task you want to work on (say 'stop' to stop the loop): ");

                        String task = input.nextLine();

                        if (task.compareTo("stop") == 0) {
				break;
                        }

			taskList[taskIndex] = task;

                        taskIndex++;

                }

		return taskList;
	}

	public static void main(String[] args) {

		String[] tasks = promptLoop();

		print(tasks[0]);

	}
}
