# Sudoku-Generator by Julianne Peyton-Brene
The project serves to generate a completely solved 9x9 Sudoku board, which I implemented by filling in the first row with random numbers from 1-9, and using a backtracking algorithm to fill in the rest based off of the first row.
To run the program, simply copy-and-paste the sourcecode in the file titled "main.java" into a compiler, and click run. The project uses only the Java console.

The backtracking algorithm goes through each index of the board after the first row, tries to fill it in with a number from 1-9 (chosen from the loop), checks if it can do so without violating Sudoku's game rules, and fills it in if possible. Then, it goes back into itself to check if the board is finished, and continues if it isn't. 

The only file is this one, the design document (which details the thought process behind the algorithm), and the source code.
