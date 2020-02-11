//reading input from the user by using inputstreamreader class

package com.shil;

import java.io.InputStreamReader;

public class InputStreamReaderExam {

	public static void main(String[] args) throws Exception {
		
		InputStreamReader input = new InputStreamReader(System.in);
		System.out.println("enet 'q' to quit");
		char c;
		
		do {
			c= (char) input.read();
			System.out.println(c);
		}while(c!='q');
		input.close();
				
		
			
		}
	}


