
public class Reports implements IReports{
	
	private IReportFirst repFirst;
	private IReportSecond repSecond;
	private IReportThird repThird;
	public Reports (IReportFirst repFirst, IReportSecond repSecond, IReportThird repThird)
	{
		this.repFirst = repFirst;
		this.repSecond = repSecond;
		this.repThird = repThird;
	}
	
	public void reportChoose(int reportNumber, Line[] lineArray){
		if (reportNumber == 1) repFirst.reportFirst(lineArray);
		else if (reportNumber == 2 ) repSecond.reportSecond(lineArray);
		else if (reportNumber == 3 ) repThird.reportThird(lineArray);
		
	}

}
