
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
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
			ReportParameters reportParameters = new ReportParameters();
			IStringProcess strProcess = new StringProcess(strDivision, strDivisionOutput);
			reportParameters.setLine(strProcess.stringProcess(lineStart, lineCount, fileReadName, fileWriteName));
			SimpleDateFormat format = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss", Locale.ENGLISH);
			reportParameters.setDateFrom(format.parse(args[5]));
			reportParameters.setDateTo(format.parse(args[6]));
			if (reportNumber == 1){
				IReportGenerator<ReportParameters, ReportFirst > repFirstGen = new ReportFirstGenerator();
				repFirstGen.reportGenerator(reportParameters).treeMapToString();
			}
			else if (reportNumber == 2){
				IReportGenerator<ReportParameters, ReportSecond> repSecondGen = new ReportSecondGenerator();
				System.out.println("Bytes over all requests: " + repSecondGen.reportGenerator(reportParameters).getBytesAll());
			}
			else {
				IReportGenerator<ReportParameters, ReportThird> repThirdGen = new ReportThirdGenerator();
				System.out.println("Max Request: " + repThirdGen.reportGenerator(reportParameters));
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


