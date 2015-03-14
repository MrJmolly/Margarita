
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class LogFileAnalyzer {

	public static void main(String[] args) throws Exception{
		try{
			int lineStart=Integer.parseInt(args[2]);
			int lineCount=Integer.parseInt(args[3]);
			String fileReadName = args[0];
			String fileWriteName = args[1];
			StringProcess strProcess = new StringProcess();
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

