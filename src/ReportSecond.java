
public class ReportSecond implements IReportSecond {
	
	@Override
	public void reportSecond(Line[] lineArray) {

		int bytesAll = 0;
		
		for (int i = 0; i<lineArray.length; i++)
		{
			bytesAll += lineArray[i].getReply();
		}
		System.out.println("----------------------------");
		System.out.println("Bytes over all request: " + bytesAll);
	}

}
