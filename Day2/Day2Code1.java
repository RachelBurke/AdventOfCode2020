import java.io.*;
import java.util.*;

public class Day2Code1
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
                int times = count(passAndPolicy[3], passAndPolicy[2].charAt(0), 0);
                if(times >= Integer.parseInt(passAndPolicy[0]) && times <= Integer.parseInt((passAndPolicy[1])))
                {
                    valid++;
                }
            }
        }
        System.out.println("Valid: " + String.valueOf(valid)); //591
	}
	
	private static int count(String password, char policyChar, int index) {
        if (index >= password.length()) {
            return 0;
        }
        
        int count = password.charAt(index) == policyChar ? 1 : 0;
        return count + count(password, policyChar, index + 1);
    }
}
