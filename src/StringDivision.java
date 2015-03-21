import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;


public class StringDivision implements IStringDivision {

	@Override
	public Line stringDivision(String str) throws ParseException {
		Line stringDiv = new Line();
		SimpleDateFormat format = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss Z", Locale.ENGLISH);
		String[] parts = new String[4];
		parts = str.split(" ");
		stringDiv.setHost(parts[0]);
		stringDiv.setDate(format.parse(parts[3].replace("[", "") + " " + parts[4].replace("]", "")));
		stringDiv.setReq(parts[5]+" "+parts[6]+" "+parts[7]);
		stringDiv.setHttp(Integer.parseInt(parts[8]));
		if(parts[9].equals("-")) stringDiv.setReply(0);
		else stringDiv.setReply(Integer.parseInt(parts[9]));
		return stringDiv;
	}

}
