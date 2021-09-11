
import java.io.*;
public class Driver {

	public static void main(String[] args) {
		BufferedReader br, in;
		try {
			//Bufferedreader reads the text from character input stream,Filereader from a file
			in = new BufferedReader(new InputStreamReader(System.in));
			br = new BufferedReader(new FileReader("ListOfAirLines.txt"));
			
			String name = in.readLine();
			
			String s;
			while((s = br.readLine()) != null) {
				
				String array[] = s.split(",");
				AirLine object = new AirLine(array);
				Location.writeFile(object,name,array[7]);
				
			}
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
