import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.*;

public class cipher
{
	static String c2 = "";
	static double freq = 0;
	static int total = 0;
	
	static String Decoded = "";
	static HashMap<Character, Double> hm = new HashMap();
	public static final String str = "abcdefghijklmnopqrstuvwxyz";
	public static void freq(){
		for(int i = 0; i <c2.length(); i++){
			char c = c2.charAt(i);
			if(c>=65 && c<= 90){
				Double val = hm.get(c);
				if(val != null){
					hm.put(c, val + 1.0);
				}else{
					hm.put(c,  1.0);
				}
				
			}
		}
	
	}
	
	public static void display(){
		//int freq = 0;
		
		for(Map.Entry<Character, Double> entry : hm.entrySet()){
			Character key = entry.getKey();
			Double val = entry.getValue();
			System.out.println(key);
			System.out.println(val);
			total = (int) (val + total); 
		}
		
		
		System.out.println(total);
		for(Map.Entry<Character, Double> entry : hm.entrySet()){
			Double val = entry.getValue();
			System.out.println(val);
			freq = (double) (val/total); 
			System.out.println(freq + "%");
		}
		
	}

	public static void main(String args[])throws IOException
	{
		//BufferedReader br = new BufferedReder(new InputStreamReader(System.in));
		String decoded = "";

		try{
			BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\drago\\workspace\\NSProject1\\src\\Saad.txt"));
		StringBuilder sb = new StringBuilder();
		String line = br2.readLine();
		
		while(line != null){
			sb.append(line);
			sb.append(System.lineSeparator());
			line = br2.readLine();
		}
	
		c2 = sb.toString();
		System.out.print(c2);
		
		
		//decrypt(Encrypted, 7);
		
		freq();
		display();
		//System.out.print(c2);
		for (int i = 0; i < c2.length(); i++) {
			//System.out.print(c2.charAt(i));
			//if((int)(c2.charAt(i)) >=65 && (int)(c2.charAt(i)) <= 90)
			{
				System.out.print((int)(c2.charAt(i)));
	
				switch (c2.charAt(i)) {
				case 'H':
					decoded += 'E';
					break;
				case 'O':
					decoded += 'T';
					break;
				case 'J':
					decoded += 'O';
					break;
				case 'E':
					decoded += 'A';
					break;
				case 'B':
					decoded += 'I';
					break;
				case 'L':
					decoded += 'N';
					break;
				case 'V':
					decoded += 'H';
					break;
				case 'M':
					decoded += 'R';
					break;
				case 'C':
					decoded += 'S';
					break;
				case 'G':
					decoded += 'D';
					break;
				case 'R':
					decoded += 'L';
					break;
				case 'S':
					decoded += 'U';
					break;
				case 'T':
					decoded += 'Y';
					break;
				case 'X':
					decoded += 'M';
					break;
				case 'F':
					decoded += 'C';
					break;
				case 'Z':
					decoded += 'G';
					break;
				case 'I':
					decoded += 'W';
					break;	
				case 'Q':
					decoded += 'P';
					break;	
				case 'N':
					decoded += 'F';
					break;	
				case 'D':
					decoded += 'B';
					break;	
				case 'Y':
					decoded += 'K';
					break;	
				case 'K':
					decoded += 'Y';
					break;	
				case 'U':
					decoded += 'X';
					break;	
				case 'W':
					decoded += 'X';
					break;	
				case 'P':
					decoded += 'J';
					break;	
				case 'A':
					decoded += 'Z';
					break;					
				default:
					decoded += c2.charAt(i);
					break;
				}				
			}
			
		}
		System.out.println(decoded);
		//*/
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}