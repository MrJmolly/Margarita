
public class ReportSecondGenerator implements IReportGenerator<ReportParameters, ReportSecond> {
	
	
	@Override
	public ReportSecond reportGenerator(ReportParameters reportParameters) {

		ReportSecond repSecond = new ReportSecond();
		
		for (int i = 0; i<reportParameters.getLine().length; i++){
			if (reportParameters.getLine()[i].getDate().getTime()>reportParameters.getDateFrom().getTime() && reportParameters.getLine()[i].getDate().getTime()<reportParameters.getDateTo().getTime())
			repSecond.setBytesAll(repSecond.getBytesAll()+ reportParameters.getLine()[i].getReply()) ;
		}
		return repSecond;
	}
}
