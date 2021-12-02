import java.io.*;
import java.util.*;

public class Day2Code2
{
	public static void main(String[] args) {
	    
        ArrayList<String> list = new ArrayList<String>();
        
	    try {
            FileInputStream fStream = new FileInputStream("Day2Input.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fStream));
            
            String strLine;
            
            while ((strLine = br.readLine()) != null)   {
              list.add(strLine);
            }
            
            fStream.close();
    	} catch (Exception e) {
            System.err.println("Error while reading file: " + e.getMessage());
        }
        
        int valid = 0;
        if (list.size() > 0) {
            for(String str : list) {
                String[] passAndPolicy = str.split("[-:\\s]+");
                char first = passAndPolicy[3].charAt(Integer.parseInt(passAndPolicy[0])-1);
                char last = passAndPolicy[3].charAt(Integer.parseInt(passAndPolicy[1])-1);
                if(first == passAndPolicy[2].charAt(0)) {
                    if(last != passAndPolicy[2].charAt(0)) {
                        valid++;
                    }
                }
                else {
                    if(last == passAndPolicy[2].charAt(0)) {
                        valid++;
                    }
                }
            }
        }
        System.out.println("Valid: " + String.valueOf(valid)); //335
	}
}
