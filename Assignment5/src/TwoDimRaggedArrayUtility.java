import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public final class TwoDimRaggedArrayUtility {
	
	/**
	 * An empty constructor
	 */
	public TwoDimRaggedArrayUtility() {
		
		//EMPTY
	}
	
	/**
	 * This returns the average from the data array
	 * @param data
	 * @return totalSum/count
	 */
	static double getAverage(double[][] data) {
		
		
		/*
		 * This will hold the total sum 
		 * from the array
		 */
		double totalSum = 0;
		
		/*
		 * This will keep count of the amount of numbers in the array
		 * in order to get the average
		 */
		double count = 0;
		
		/*
		 * This for loop is to get the rows
		 */
		for(int a = 0; a < data.length; a++) {
			
			//This second for loop will grt the columns
			for(int b = 0; b < data[a].length; b++) {
				
				//The numbers from data will add onto the total
				totalSum += data[a][b];
				
				//This keeps count
				count++;
				
				
			}
			
		}
		
		//This will yield the average
		return totalSum/count;
	}
	
	/**
	 * This method will get the column total from
	 * the array
	 * @param data
	 * @param col
	 * @return totalCol
	 */
	static double getColumnTotal(double[][] data, int col) {
		
		//This will be used to hold the total column
		double totalCol = 0;
		
		/*
		 * This for loop will be used to 
		 * get the numbers from the data array
		 */
		for(int c = 0; c < data.length; c++) {
			
			//This will check if any number is less than or equal to 0
			if(col < 0 || data[c].length <= col) {
				
				//Nothing
			}
			
			/*
			 * This will add the number from the
			 * columns to the total columns
			 */
			if(col == 1 && data[c].length == 1) {
				
				//This adds onto the total columns variable
				totalCol += data[c][col-1];
			}
			else {
				
				totalCol += data[c][col];
			}
			
		}
		
		/*
		 * This returns the total amount from t
		 */
		return totalCol;
	}
	
	/**
	 * This will yeild the highest array in the data
	 * @param data
	 * @return
	 */
	static double getHighestInArray(double[][] data) {
		
		/*
		 * This variable will hold the highest number 
		 * in the given array
		 */
		double largeNum = 0;
		
		/*
		 * A nested for loop to get through each number 
		 * in the given array
		 */
		for(int d = 0; d < data.length; d++) {
			
			for(int e = 0; e < data[d].length; e++) {
				
				/*
				 * if true, it'll hold the largest 
				 * value from the array
				 */
				if(data[d][e] > largeNum) {
					
					largeNum = data[d][e];
				}
				
			}
		}
		
		return largeNum;
	}
	
	/**
	 * This will retur the greates number in the 
	 * columns
	 * @param data
	 * @param col
	 */
	static double getHighestInColumn(double[][] data, int col) {
		
		/*
		 * This variable will hold the largest 
		 * number within the columns
		 */
		double largeNumCol = 0;
		
		/*
		 * This will go through the array
		 * to get the numbers from each column
		 */
		for(int f = 0; f < data.length; f++) {
			
			/*
			 * Nothing will happen if the 
			 * col number is less than 0 
			 */
			if(col < 0 || data[f].length <= col) {
				
				//Nothing will happen
			}
			if(data[f][col] > largeNumCol) {
				
				largeNumCol = data[f][col];
			}
		}
		
		return largeNumCol;
	}
	
	/**
	 * This method is used to get the highest index
	 * from the column
	 * @param data
	 * @param col
	 * @return g
	 */
	static int getHighestInColumnIndex(double[][] data, int col) {
		
		//This variable will be returned
		int g = 0;
		
		//This variable will keep hold of the index
		double highNum = 0;
		
		/*
		 * A regular loop to get through the array
		 */
		for(int h = 0; h < data.length; h++) {
			
			if(col < 0 || data[h].length <= 0) {
				
				//Does nothing
			}
			if(highNum < data[h][col]){
				
				g = h;
				
				highNum = data[h][col];
				
			}
			
		}
		
		//Returns the highest column index
		return g;
	}
	
	/**
	 * This is used from the 
	 * @param data
	 * @param row
	 * @return
	 */
	static double getHighestInRow(double[][] data, int row) {
		
		/*
		 * This variable will be 
		 * used to hold the highest number in 
		 * the row
		 */
		double highInRow = 0;
		
		/*
		 * This if statement will check
		 * whether the row is less than 0 
		 * and that the array length is less
		 * or equal to the row.
		 */
		if(row < 0 || data.length < row) {
			
			return 0;
		}
		
		/*
		 * This for loop will go through rows from the array 
		 * and find the highest number in there
		 */
		for(int i = 0; i < data[row].length; i++) {
			
			//If true, highInRow will get the highest value
			if(highInRow < data[row][i]) {
				
				highInRow = data[row][i];
			}
			
		}
		
		return highInRow;
	}
	
	/**
	 * 
	 * @param data
	 * @param row
	 * @return
	 */
	static int getHighestInRowIndex(double[][] data, int row) {
		
		/*
		 * This variable will hold the index with the 
		 * highest number
		 */
		int j = 0; 
		
		/*
		 * This will hold the highest row
		 * value for comparing
		 */
		double highRow = 0;
		
		/*
		 * If the row less than 0 or 
		 * the length of the array iss less than or equal
		 * to the row it...
		 * @return 0
		 * 
		 */
		if(row < 0 || row > data.length) {
			
			return 0;
		}
		
		/*
		 * This loop goes through the array for 
		 * the rows
		 */
		for(int k = 0; k < data[row].length; k++) {
			
			/*
			 * If the value in the array
			 * is larger than highRow, it becomes the value of 
			 * highRow
			 */
			if(highRow < data[row][k]) {
				
				//This gets the index for the highest value
				j = k;
				
				highRow = data[row][k];
				
			}
			
		}
		
		//This returns the index with the highest value
		return j;
		
		
	}
	
	/**
	 * 
	 * @param data
	 * @return
	 */
	static double getLowestInArray(double[][] data) {
		
		/*
		 * This variable will be used to
		 * hold the lowest number from 
		 * the array
		 */
		double lowNum = 0;
		
		/*
		 * Another nested loop for the array 
		 */
		for(int l = 0; l < data.length; l++) {
			
			
			for(int m = 0; m < data[l].length; m++) {
				
				/*
				 * This will give the  lowNum
				 * variable the lowest value from 
				 * the array
				 */
				if(lowNum == 0 || lowNum > data[l][m]) {
					
					lowNum = data[l][m];
				}
				
			}
			
		}
		
		//This will return the lowest value
		return lowNum;
		
	}
	
	/**
	 * 
	 * @param data
	 * @param col
	 * @return
	 */
	static double getLowestInColumn(double[][] data, int col) {
		
		/*
		 * This variable here is to keep 
		 * track of the lowest number in the 
		 * array in order for comparison
		 */
		double lowestNum = 0;
		
		/*
		 * this for loop
		 * is here to get the lowest column
		 */
		for(int n = 0; n < data.length; n++) {
			
			
			/*
			 * this will check whether or not the
			 * columns is less than zero or the length 
			 * isnt equal or less than the number of columns 
			 */
			if(col < 0 || data[n].length <= col) {
				
				//This make the statement continue
				
			}
			if(lowestNum == 0 || lowestNum > data[n][col]) {
				
				lowestNum = data[n][col];
				
			}
			
			
		}
		
		//returns the lowest number from the columns
		return lowestNum;
	}
	
	/**
	 * This method will bring in the lowest column index from the 
	 * from the data array
	 * @param data
	 * @param col
	 * @return
	 */
	static int getLowestInColumnIndex(double[][] data, int col) {
		
		/*
		 * this is to hold the lowest number
		 * from the array
		 */
		double lowNum = 0;
		
		/*
		 * This variable is used to hold the index that
		 * contains the lowest number from the array
		 */
		int o = 0;
		
		/*
		 * Nested loop for the array
		 */
		for(int p = 0; p < data.length; p++) {
			
			
			/*
			 * This if statement checks whether the length of
			 * the array is <= the number of columns or 
			 * the number of columns is less than 0
			 */
			if(data[p].length <= col || col < 0) {
				
				//This just continues 
			}
			if(lowNum > data[p][col] || lowNum == 0 ){
				
				//o inherits the index number from p
				o = p;
				
				/**
				 * the lowest number from the array
				 */
				lowNum = data[p][col];
				
			}
		}
		
		//returns the variable o
		return o;
	}
	
	/**
	 * This method will try to get
	 * the lowest number in the row from the array
	 * @param data
	 * @param row
	 * @return
	 */
	static double getLowestInRow(double[][] data, int row) {
		
		
		/*
		 * this variable will hold the 
		 * lowest number from the row in the array
		 */
		double rowLowNum = 0;
		
		/*
		 * this checks whether the rows is less than
		 * 0 or the array length is less than the row
		 */
		if(row < 0 || data.length < row) {
			
			return 0;
			
		}
		
		/**
		 *  A loop that goes through the array
		 */
		for(int q = 0; q < data[q].length; q++) {
			
			
			if(rowLowNum > data[row][q] || rowLowNum == 0) {
				
				/*
				 * This will get the lowest 
				 * number from the row
				 */
				rowLowNum = data[row][q];
			}
		}
		
		//returns the lowest number
		return rowLowNum;
		
	}
	
	/**
	 * This method gets the lowest number from the array
	 * and it's index
	 * @param data
	 * @param row
	 * @return r
	 */
	static int getLowestInRowIndex(double[][] data, int row) {
		
		/*
		 * holds the lowest number from the row
		 */
		double lowNum = 0;
		
		/*
		 * Hold the lowest number's 
		 * index 
		 */
		int r = 0;
		
		/*
		 * This checks the rows and array length to see 
		 * if they are eligible
		 */
		if(row < 0 || row > data.length) {
			
			return 0;
		}
		
		/*
		 * A loop that goes through the array rows
		 */
		for(int s = 0; s < data[s].length; s++) {
			
			/*
			 * if a number from the array is less than the number
			 * from lownum, lownum gets that number
			 */
			if(lowNum > data[row][s] || lowNum == 0) {
				
				//gets the index
				r = s;
				
				//lownum initiates to the lowest number
				lowNum = data[row][s];
				
			}
			
		}
		
		//returns the lowest number index
		return r;
	}
	
	/**
	 * It get the total sum from the rows
	 * @param data
	 * @param row
	 * @return
	 */
	static double getRowTotal(double[][] data, int row) {
		
		/*
		 * This will be used to hold the 
		 * sum of the rows
		 */
		double sumRows = 0;
		
		/*
		 * This for loop will go through the rows 
		 * and get their number
		 */
		for(int l =0; l < data[row].length; l++) {
			
			sumRows += data[row][l];
		}
		
		return sumRows;
		
	}
	
	/**
	 * 
	 * @param data
	 * @return
	 */
	static double getTotal(double[][] data) {
		
		/*
		 * This variable will hold
		 * the total sum from the array, column and rows
		 */
		double arrayTotal = 0;
		
		/*
		 * This nested loop is here to acquire
		 * the values from the array
		 */
		for(int m = 0; m < data.length; m++) {
			
			
			for(int n = 0; n < data[m].length; n++) {
				
				//This adds onto the arrayTotal variable
				arrayTotal += data[m][n];
				
			}
		}
		
		return arrayTotal;
	}
	
	/**
	 * 
	 * @param file
	 * @return
	 * @throws FileNotFoundException
	 */
	static double[][] readFile(File file) throws FileNotFoundException{
		
		/*
		 * This variable will keep track of 
		 * the amount of rows in the array
		 */
		int rowAmount = 0;
		
		/*
		 * This is used to read of the file 
		 * from the...file
		 */
		Scanner input = new Scanner(file);
		
		/*
		 * This is a temp array to use 
		 * so we can get the rows
		 */
		String[][] tempArray = new String[10][10];
		
		/*
		 * 
		 */
		while(input.hasNext()) {
			
			tempArray[rowAmount] = input.nextLine().split(" ");
			
			//This will keep count of the amount of rows
			rowAmount++;
			
		}
		
		//Closes the scanner for the file
		input.close();
		
		/*
		 * This array will be returned
		 */
		double[][] resultArray = new double[rowAmount][];
		
		/*
		 * This nested for loop goes through the array 
		 * and puts the rows and columns
		 * in the result array
		 */
		for(int r = 0; r < rowAmount; r++) {
			
			/*
			 * This variable is used to hold the column index
			 * and is the same length as the amount of rows'
			 * from the temp array
			 */
			int columns = tempArray[rowAmount].length;
			
			resultArray[rowAmount] = new double[columns];
			
			//This loop is to go through the columns
			for(int c = 0; c < columns; c++) {
				
				/*
				 * This puts the value in the result array from 
				 * the temp array
				 */
				resultArray[r][c] = Double.parseDouble(tempArray[r][c]);
				
			}
			
			
		}
		
		//Returns the double array
		return resultArray;
	}
	
	/**
	 * 
	 * @param data
	 * @param outputFile
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	static void writeToFile(double[][] data, File outputFile) throws IOException, FileNotFoundException{
		
		
		/**
		 * This will create a fileWriter object 
		 * so you'll be able to write a file
		 */
		FileWriter fileOutput = new FileWriter(outputFile);
		
		/*
		 * This nested loop will read the given array
		 */
		for(int t = 0; t < data.length; t++) {
			
			for(int u = 0; u < data[t].length; u++) {
				
				/*
				 * This command will write onto the file 
				 * with the values from the arrays
				 */
				fileOutput.write(data[t][u] + " ");
				
				
			}
			
			//This will print to the next line
			fileOutput.write("\n");
		}
		
		/*
		 * This will be closing down the fileOutput object
		 */
		fileOutput.close();
		
	}
}
