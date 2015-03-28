
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

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
			if (reportNumber == 1){
				IReportFirstGenerator repFirstGen = new ReportFirstGenerator();
				repFirstGen.reportFirstGenerator(strProcess.stringProcess(lineStart, lineCount, fileReadName, fileWriteName)).treeMapToString();;
				
			}
			else if (reportNumber == 2){
				IReportSecondGenerator repSecondGen = new ReportSecondGenerator();
				System.out.println("Bytes over all requests: " + repSecondGen.reportSecondGenerator(strProcess.stringProcess(lineStart, lineCount, fileReadName, fileWriteName)).getBytesAll());
			}
			else {
				IReportThirdGenerator repThirdGen = new ReportThirdgenerator();
				System.out.println("Max Request: " + repThirdGen.reportThirdGenerator(strProcess.stringProcess(lineStart, lineCount, fileReadName, fileWriteName)));
				
			}
			
			
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


