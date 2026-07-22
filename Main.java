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
	 * Parameters: input
	 * Return: taskList
	 */

	public static String[] promptLoop(Scanner input) {

		// initialize variables
		
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

	/*
	 * Name: timer()
	 * Purpose: to set a 25 minute work timer for each task and break timers after each work timer
	 * Parameters: tasks, longBreakInterval, input
	 * Returns: none
	 */

	public static void timer(String[] tasks, int longBreakInterval, Scanner input) {
		taskCounter = 1;
		
		do {
			
			for (String task : tasks) {
				print("You will be doing " + task + "for 25 minutes. GO!");

				Thread.sleep(1500000); 
				
				// Minutes to miliseconds: minutes * (1 minute/60 seconds) * (1000 miliseconds/1 second)

				print("Time is up!");

				taskCounter++;

				if (taskCounter % longBreakInterval == 0) {
					print("You have been granted a 15 minute break. GO!");

					Thread.sleep(900000);

					print("Time is up!");
				} else {
					print("You have been granted a 5 minute break. GO!");

                                        Thread.sleep(300000);

                                        print("Time is up!");
				}
			}

			print("Do you want to continue working?: ");

			String continue = input.nextLine();

			if (continue.compareTo("yes") == 0) {
				print("Great! Let's continue grinding!");
			} else {
				print("okay, have a nice day!");
			}

		} 
		while (continue.compareTo("yes") == 0);
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] tasks = promptLoop(input);

		print("This program will cycle between your entered tasks, with 5 min breaks in between except for an occassional 15 minute break. After how many tasks do you want a 15 minute break to occur?: ");

		int longBreakInterval = input.nextInt();
		input.nextLine();


	}
}
