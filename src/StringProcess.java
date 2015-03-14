import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;


public class StringProcess implements IStringProcess {

	@Override
	public void stringProcess(int lineStart, int lineCount, String fileReadName, String fileWriteName) throws ParseException, IOException {
		File fileRead = new File(fileReadName);
		File fileWrite = new File(fileWriteName);
		int count=0;
		BufferedReader bufferedReader = new BufferedReader(new FileReader(fileRead));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileWrite));
		while((bufferedReader.readLine())!=null)
		{
			count++;
			if (count>=lineStart && count<lineStart+lineCount){
				String line = bufferedReader.readLine();
				bufferedWriter.write(line);
				bufferedWriter.newLine();
				StringDivision strDivision = new StringDivision();
				StringDivisionOutput strDivisionOutput = new StringDivisionOutput();
				strDivisionOutput.stringDivisionOutput(strDivision.stringDivision(line));
			}
			else if (count>lineStart+lineCount) break;
		}
		bufferedReader.close();
		bufferedWriter.close();

	}

}
