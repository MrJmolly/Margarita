import java.io.IOException;
import java.text.ParseException;


public interface IStringProcess {
	public void stringProcess(int lineStart, int lineCount, String fileReadName, String fileWriteName) throws ParseException, IOException;

}
