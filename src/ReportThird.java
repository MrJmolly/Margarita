
public class ReportThird implements IReportThird {

	@Override
	public void reportThird(Line[] lineArray) {
		
		int maxBytes = 0;
		String maxRequest = "";
		for (int i = 0; i<lineArray.length; i++)
		{
			if (lineArray[i].getReply()>maxBytes) 
				{
					maxBytes = lineArray[i].getReply();
					maxRequest = lineArray[i].getReq();
				}
		}
		
		System.out.println("----------------------------");
		System.out.println("Request with " + maxBytes + " bytes in reply: " + maxRequest );
		
	}

}
