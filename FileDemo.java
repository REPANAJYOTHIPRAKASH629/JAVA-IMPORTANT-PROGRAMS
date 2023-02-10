import java.io.*;
class FileDemo
{
	public static void main(String args[])
	{
		try
		{
			int lines=0,chars=0,words=0;
			int code=0;
			FileInputStream fis = new FileInputStream("sample.txt");
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