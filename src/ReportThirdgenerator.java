
public class ReportThirdGenerator implements IReportGenerator<ReportParameters, ReportThird> {

	
	
	@Override
	public ReportThird reportGenerator(ReportParameters reportParameters) {
		
		int maxBytes = 0;
		ReportThird repThird = new ReportThird();
		for (int i = 0; i<reportParameters.getLine().length; i++)
		{
			if (reportParameters.getLine()[i].getDate().getTime()>reportParameters.getDateFrom().getTime() && reportParameters.getLine()[i].getDate().getTime()<reportParameters.getDateTo().getTime()){
				if (reportParameters.getLine()[i].getReply()>maxBytes) 
				{
					maxBytes = reportParameters.getLine()[i].getReply();
					repThird.setMaxRequest(reportParameters.getLine()[i].getReq());
				}
		}
		}
		return repThird;
	}
}
