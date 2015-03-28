
public class ReportThirdgenerator implements IReportThirdGenerator {

	
	
	@Override
	public ReportThird reportThirdGenerator(Line[] lineArray) {
		
		int maxBytes = 0;
		ReportThird repThird = new ReportThird();
		for (int i = 0; i<lineArray.length; i++)
		{
			if (lineArray[i].getReply()>maxBytes) 
				{
					maxBytes = lineArray[i].getReply();
					repThird.setMaxRequest(lineArray[i].getReq());
				}
		}
		
		return repThird;
		
	}

}
