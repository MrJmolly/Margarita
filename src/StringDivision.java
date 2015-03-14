import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Pattern;


public class StringDivision implements IStringDivision {

	@Override
	public Line stringDivision(String str) throws ParseException {
		Line stingDiv = new Line();
		SimpleDateFormat format = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss Z", Locale.ENGLISH);
		String[] parts = new String[4];
		parts = str.split(" ");
		if (Pattern.matches("(^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$)", parts[0])) stingDiv.setHostIp(parts[0]);
		else stingDiv.setHostName(parts[0]);
		stingDiv.setDate(format.parse(parts[3].replace("[", "") + " " + parts[4].replace("]", "")));
		stingDiv.setReq(parts[5]+" "+parts[6]+" "+parts[7]);
		stingDiv.setHttp(Integer.parseInt(parts[8]));
		stingDiv.setReply(Integer.parseInt(parts[9]));
		return stingDiv;
	}

}
