import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;


public class StringProcess implements IStringProcess {

	private IStringDivision strDivision;
	private IStringDivisionOutput strDivisionOutput;
	public StringProcess (IStringDivision strDivision, IStringDivisionOutput strDivisionOutput)
	{
		this.strDivision = strDivision;
		this.strDivisionOutput = strDivisionOutput;
	}
	@Override
	public void stringProcess(int lineStart, int lineCount, String fileReadName, String fileWriteName, Line[] lineArray) throws ParseException, IOException {
		File fileRead = new File(fileReadName);
		File fileWrite = new File(fileWriteName);
		int count = 0;
		int countLine = 0;
		String line;
		BufferedReader bufferedReader = new BufferedReader(new FileReader(fileRead));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileWrite));
		while((line = bufferedReader.readLine())!=null)
		{
			count++;
			if (count>=lineStart && count<lineCount+lineStart){
				System.out.println("----------------------------");
				System.out.println("Divided string number " + (countLine+1));
				bufferedWriter.write(line);
				bufferedWriter.newLine();
				strDivisionOutput.stringDivisionOutput(lineArray[countLine]=strDivision.stringDivision(line));
				countLine++;
			}
			else if (count>lineCount) break;
		}
		bufferedReader.close();
		bufferedWriter.close();

	}

}
