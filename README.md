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

# References
1. My Java course notes
