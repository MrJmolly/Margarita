
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.regex.Pattern;

public class myWork {

	public static void main(String[] args) throws Exception{
		try{
			int n=Integer.parseInt(args[2]);
			int i=Integer.parseInt(args[3]);
			File f = new File(args[0]);
			File f1 = new File(args[1]);
			int k=0;
			String line;
			BufferedReader br = new BufferedReader(new FileReader(f));
			BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
			while((line = br.readLine())!=null)
			{
				k++;
				if (k>=n && k<n+i){
					bw.write(line);
					bw.newLine();
					strDivO(strDiv(line));
				}
				else if (k>n+i) break;
			}
			br.close();
			bw.close();
		}	 
		catch (ArrayIndexOutOfBoundsException e){
			System.out.print("Array out of bonds!!!");
		}
		catch (InputMismatchException e){
			System.out.print("Enter integer value!!!");
		}
		catch (FileNotFoundException e){
			System.out.print("File not found!!!");
		}
	}
	public static strDivC strDiv(String str) throws ParseException{

		strDivC s = new strDivC();
		SimpleDateFormat format = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss Z", Locale.US);
		String[] parts = new String[4];
		parts = str.split(" ");
		if (Pattern.matches("(^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$)", parts[0])) s.setHostIp(parts[0]);
		else s.setHostName(parts[0]);
		s.setDate(format.parse(parts[3].replace("[", "") + " " + parts[4].replace("]", "")));
		s.setReq(parts[5]+" "+parts[6]+" "+parts[7]);
		s.setHttp(Integer.parseInt(parts[8]));
		s.setReply(Integer.parseInt(parts[9]));
		return s;
	}
	public static void strDivO(strDivC s){
		System.out.println("----------------------------");
		System.out.println("Host: " + s.getHostIp() + s.getHostName());
		System.out.println("Time: " + s.getDate());
		System.out.println("Request: " + s.getReq());
		System.out.println("Http reply code: " + s.getHttp());
		System.out.println("Bytes in reply: " + s.getReply());
	}
}
