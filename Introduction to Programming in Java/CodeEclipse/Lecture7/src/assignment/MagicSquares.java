package assignment;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MagicSquares {
    public static boolean testMagic(String pathName) throws IOException {
        // Open the file
        BufferedReader reader = new BufferedReader(new FileReader(pathName));

        boolean isMagic = true;
        int lastSum = -1;
        int[][] matrix = new int[16][16]; 
        
        // For each line in the file ...
        int rowNumber = 0;
        String line;
        while ((line = reader.readLine()) != null) {
        	// If line is empty
        	if(line.length() == 0) continue;
        	
            // ... sum and store each row of numbers
            String[] parts = line.split("\t"); 
            int sum = 0;
            int colNumber = 0;
            for (String part : parts) {
            	try {
            		int tmp = Integer.parseInt(part);
            		matrix[rowNumber][colNumber] = tmp;
            		sum += tmp;
            	} catch(NumberFormatException e) {
                    System.out.println(part + "cannot transform");
                }
            	
            	colNumber++;
            }
            
            //Compare the sum
            if (lastSum == -1) {
                // If this is the first row, remember the sum
                lastSum = sum;
            } else if (lastSum != sum) {
                // if the sums don't match, it isn't magic, so stop reading
                isMagic = false;
                break;
            }
            
            rowNumber++;
        }
        
        reader.close();
        return isMagic;
    }

    
    public static void main(String[] args) throws IOException {
        String[] fileNames = { "./src/Mercury.txt", "./src/Luna.txt" };
        for (String fileName : fileNames) {
            System.out.println(fileName + " is magic? " + testMagic(fileName));
        }
    }
}

