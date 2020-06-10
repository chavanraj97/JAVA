public class Vowels
{
	public static void main(String[] args)
	{
		char a = 'a';
		int b = 0;
		switch(a)
		{
			case 'a': 
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U': b = 1;
		}
		
		if(b == 1)
		{
			System.out.println( a + " is a vowel");
		}

		else
		{
			System.out.println(a + " is not a vowel");
		}
	}
}
		