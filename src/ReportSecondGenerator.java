
public class ReportSecondGenerator implements IReportSecondGenerator {
	
	
	@Override
	public ReportSecond reportSecondGenerator(Line[] lineArray) {

		ReportSecond repSecond = new ReportSecond();
		
		for (int i = 0; i<lineArray.length; i++)
		{
			repSecond.setBytesAll(repSecond.getBytesAll()+ lineArray[i].getReply()) ;
		}
		return repSecond;
	}

}
