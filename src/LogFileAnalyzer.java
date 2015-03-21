
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
			Line[] lineArray = new Line[lineCount];
			IStringDivision strDivision = new StringDivision(); 
			IStringDivisionOutput strDivisionOutput = new StringDivisionOutput();
			IStringProcess strProcess = new StringProcess(strDivision, strDivisionOutput);
			strProcess.stringProcess(lineStart, lineCount, fileReadName, fileWriteName, lineArray);
			IReportFirst repFirst = new ReportFirst();
			IReportSecond repSecond = new ReportSecond();
			IReportThird repThird = new ReportThird();
			IReports reports = new Reports(repFirst, repSecond, repThird);
			reports.reportChoose(reportNumber, lineArray);
			
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


