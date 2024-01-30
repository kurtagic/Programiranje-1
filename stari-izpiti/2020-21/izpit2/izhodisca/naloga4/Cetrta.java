import java.util.*;

public class Cetrta 
{

    public static <T> List<T> razmnozi(List<T> seznam, int n) 
	{
        List<T> list = new ArrayList<>();
        for (int i = 0; i < seznam.size(); i++)	
		{
            for (int j = 0; j <= i % n; j++)
			{
                list.add(seznam.get(i));
            }
        }

        return list;
    }

    public static <T> Iterator<T> razmnozevalnik(List<T> seznam, int n)
	{      
		return new Iterator<T>() 
		{
			int index = 0;
			int count = 0;

			@Override
			public T next() 
			{
				count++;
				return seznam.get(index);
			}

			@Override
			public boolean hasNext() 
			{
				if (count > index % n) 
				{
					count = 0;
					index++;
				}
				
				return seznam.size() > index;
			}
        };
    }
}
