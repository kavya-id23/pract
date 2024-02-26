
class Value
{
	public static void main(String args[])
	{
	int value = 1, i=1;
		while(++value <= 10)
		{
			System.out.println(value);
			if (value>=5 && value<=8)
			{
				continue;
			}
			else
			{
				System.out.println(value+"  "+i++);	
			}
     		}
  	}
}
											
 