package TestCsvReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromCsvFile {

	public static void main(String[] args) throws IOException {
		
		//initializing the fileName variable as name of input file to read
		String fileName = "TestFile.csv";
		
		/*FileReader is used to read the characters from input file.
		 * if FileReader is not used, BufferReader will read and buffer the text as TestFile.csv instead of 
		 * the actual characters in the input file
		*/
		FileReader file = new FileReader(fileName);
		BufferedReader reader = new BufferedReader(file);
		String line = null;
		
		
		try{
		while ((line = reader.readLine()) !=null) {
			String[] csvList = line.split(";");
			for (int i = 0; i<csvList.length;i++)
			System.out.println(csvList[i] );
			  }
		   } catch(FileNotFoundException e){
			e.printStackTrace();
		   }
			
		}
		

}


