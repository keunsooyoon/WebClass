package y20211005;

import java.io.FileWriter;
import java.io.IOException;

public class fileExam {
/*
 *  지금까지는 출력으로 모니터를 사용하여 결과값을 나타내는 프로그램만 작성하였다. 
 *  이번에는 파일로 출력하는 방법에 대해 알아보자. 
 *  
 */
	public static void main(String[] args) throws IOException{
		FileWriter output = new FileWriter("out.txt");
		for(int i = 1 ; i < 11 ; i++) {
			String data = i + "번째 줄입니다. \n";
			output.write(data);
		}
		output.close();
	}
	
	
	
	
}
