import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
class filechars {
    public static void main(String args[])
    {
        try
		{
			int chars=0;
			int code=0;
			FileInputStream fis = new FileInputStream("test.txt");
			while(fis.available()!=0)
			{
				code = fis.read();
				if(code!=10)
				chars++;
			}
			System.out.println("No.of characters = "+chars);
			fis.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Cannot find the specified file...");
		}
		catch(IOException i)
		{
			System.out.println("Cannot read file...");
		}
	}
}
