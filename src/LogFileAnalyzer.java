
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;

public class LogFileAnalyzer {

	public static void main(String[] args) throws Exception{
		try{
			String fileReadName = args[0];
			String fileWriteName = args[1];
			int lineStart=Integer.parseInt(args[2]);
			int lineCount=Integer.parseInt(args[3]);
			int reportNumber = Integer.parseInt(args[4]);
			IStringDivision strDivision = new StringDivision(); 
			IStringDivisionOutput strDivisionOutput = new StringDivisionOutput();
			IStringProcess strProcess = new StringProcess(strDivision, strDivisionOutput);
			strProcess.stringProcess(lineStart, lineCount, fileReadName, fileWriteName);
			
		}	 
		catch (ArrayIndexOutOfBoundsException e){
			System.out.print("Array out of bonds!!!");
		}
		catch (InputMismatchException e){
			System.out.print("Enter integer value!!!");
		}
		catch (FileNotFoundException e){
			System.out.print("File not found!!!");
		}
	}
}


