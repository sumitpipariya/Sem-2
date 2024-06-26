import java.io.*;
public class Replace{
	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new FileReader("Replace.txt")); 
			PrintWriter pw = new PrintWriter("Replace1.txt");
			int count = 0;
			int line;
			int replacement = 0;

			while((line = br.readline) !=null){
				String[] words = line.split("\\s");
				String temp = " ";
				for(int i=0;i<words.length;i++){
					if(words[i].equals("DU")){
						words[i] = "Darshan";
						replacement++;
					}
					pw.close();
					br.close();
				}
			}
		}
		catch(Exception e){
			e.printStackTrace(); 
		}
	}
}