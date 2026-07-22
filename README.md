# Productive-CLI
A Java CLI tool to help you get work done.

# Algorithm
1. Read any saved tasks from a CSV
2. Take task input, store in a list
    1. Loop until the user inputs "stop"
        1. Ask the user for a task
3. Ask the user after how many tasks should a longer 15 minute break occur, store in longBreakInterval
4. While the user doesn’t want to stop
    1. Loop through the task dictionary
        1. 25 minute timer
        2. If the task counter is divisible by longBreakInterval, start a 15 minute break
            1. Otherwise start a 5 minute break
    2. Ask the user if they want to continue
5. Store tasks in an CSV file

# Issue log
```diff
- I limited the number of tasks to 10 by capping taskIndex at 9, but I am still able to input up to 11 tasks before the program crashes
+ The OR operator allowed for the loop to continue since you did not enter "stop", regardless of whether or not the 9-index limit was met. Use the AND operator
```

# References
1. My Java course notes
2. w3Schools Java: https://www.w3schools.com/java/default.asp
