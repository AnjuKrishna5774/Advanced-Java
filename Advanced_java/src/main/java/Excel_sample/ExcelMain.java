package Excel_sample;
import java.io.IOException;
public class ExcelMain {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		 
			
			String s=Excelcode.readStringData(1, 0);
			System.out.println(s);
			String s1=Excelcode.readIntegerData(1, 1);
			System.out.println(s1);
		
	}

}
