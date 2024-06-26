import java.io.*;
public class CountChar{
	public static void main(String[] args) {
		try{
			PrintWriter pw = new PrintWriter("abc.txt");
			pw.write("Hello \n");
			pw.write("Darshan University");
			pw.close();

			int charCount = 0;
			int wordCount = 0;
			int lineCount = 0;
			String line;

			BufferedReader br = new BufferedReader(new FileReader("abc.txt")); 
			while((lineCount = br.readline) !=null){
				lineCount ++;
				charCount = charCount + line.length();
				wordCount += wordCount;
			}

		}
		catch(Exception e){
			e.printStackTrace(); 
		}
	}
}