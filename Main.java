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

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// initialize variables

		String taskInput = "";
		int taskIndex = 0;
		String[] taskList = new String[10]; // task total limited to 10 to prevent overworking

		// repetitive prompting for tasks

		while (taskInput != "stop" && taskIndex <= 9) {

			print("Enter a task you want to work on (say 'stop' to stop the loop): ");

			String task = input.nextLine();

			if (task != "stop") {
				taskList[taskIndex] = task;
			}

			taskIndex++;

		}

		print(taskList[0]);		
	}
}
