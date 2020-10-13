import java.util.Arrays;

public class Driver 
{
	public static void main(String[] args)
	{
		
		BibleBookCollection theNewTestament = new BibleBookCollection("data.dat");
		try
		{
			BibleBook answer = theNewTestament.getFirstBookGivenSearchTerm("lol");
			answer.display();
		}
		catch(Exception e)
		{
			System.out.println("No Book Found");
		}}}
		
