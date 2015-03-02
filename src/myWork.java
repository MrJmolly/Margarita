import java.io.*;
import java.util.InputMismatchException;

public class myWork {

	public static void main(String[] args) throws Exception{
		try{
			int n=Integer.parseInt(args[2]);
			int i=Integer.parseInt(args[3]);
			String nm = args[0];
			String nm1 = args[1];
			File f = new File(nm);
			File f1 = new File(nm1);
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
					strDiv(line);
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
	public static void strDiv(String str){

		strDivC s = new strDivC();
		String[] parts = new String[4];
		parts = str.split(" ");
		s.host = parts[0];
		s.time = parts[3]+" "+parts[4];
		s.req = parts[5]+" "+parts[6]+" "+parts[7];
		s.http = Integer.parseInt(parts[8]);
		s.reply = Integer.parseInt(parts[9]);
		strDivO(s);
	}
	public static void strDivO(strDivC s){
		System.out.println("----------------------------");
		System.out.println("Host: " + s.host);
		System.out.println("Time: " + s.time);
		System.out.println("Request: " + s.req);
		System.out.println("Http reply code: " + s.http);
		System.out.println("Bytes in reply: " + s.reply);
	
	}
	private static class strDivC{
		String host;
		String time;
		String req;
		int http;
		int reply;
		
	}
}
