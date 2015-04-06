import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;


public class StringDivision implements IStringDivision {

	@Override
	public Line stringDivision(String str) throws ParseException {
		Line stringDiv = new Line();
		SimpleDateFormat format = new SimpleDateFormat("[dd/MMM/yyyy:HH:mm:ss Z]", Locale.ENGLISH);
		String[] parts = new String[3];
		String[] parts1 = new String[2];
		parts = str.split("( - - )|( \")|((\"))");
		stringDiv.setHost(parts[0]);
		stringDiv.setDate(format.parse(parts[1]));
		stringDiv.setReq(parts[2]);
		System.out.println(parts[3]);
		if (parts[3].equals(" HTTP/1.0")) {
			stringDiv.setReq(parts[2]+parts[3]);
			parts1=parts[4].split(" ");
			stringDiv.setHttp(Integer.parseInt(parts1[1]));		
			if(parts1[2].equals("-")) stringDiv.setReply(0);
			else stringDiv.setReply(Integer.parseInt(parts1[2]));
		}
		else{
		parts1=parts[3].split(" ");
		stringDiv.setHttp(Integer.parseInt(parts1[1]));		
		if(parts1[2].equals("-")) stringDiv.setReply(0);
		else stringDiv.setReply(Integer.parseInt(parts1[2]));
		}
		return stringDiv;
	}
}
