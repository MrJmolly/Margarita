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
}