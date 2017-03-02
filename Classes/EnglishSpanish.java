/**
 * @author Anders
 *
 */

public class EnglishSpanish implements Comparable<EnglishSpanish>
{
	public String Spanish;
	private String EnlishMeaning;

	public EnglishSpanish(String spanish, String english)
	{
		Spanish = spanish;
		EnlishMeaning = english;
	}

	public String get()
	{
		return EnlishMeaning;
	}

	@Override
	public int compareTo(EnglishSpanish arg0)
	{
		return Spanish.toLowerCase().compareTo(arg0.Spanish.toLowerCase());
	}
	
	@Override
	public String toString()
	{
		return Spanish + " : " + EnlishMeaning;
		
	}
	
	public int compareTo(String arg0)
	{
		return Spanish.compareTo(arg0);
	}

}
