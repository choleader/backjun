package forWhile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Practice {

	public static void main(String[] args) throws IOException {
		
		  BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	        String str = br.readLine();   // 입력을 5 4 로 받음
	        StringTokenizer st = new StringTokenizer(str);
	        int a = Integer.parseInt(st.nextToken());  //5
	        int b = Integer.parseInt(st.nextToken());  //4

	        String k = "나는로춘남";
	        
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        bw.write(k + "\n");

	        bw.flush();
	        
	        bw.write("5");

	        bw.write(String.valueOf(b));

	        bw.flush();
	        bw.close();
	    
	}
}
	
	
	
	
