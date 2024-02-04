import java.util.*;

public class Cetrta 
{
    public static <T extends Comparable<T>> Iterator<T> zlitje(Iterator<T> a, Iterator<T> b) 
    {

      return new Iterator<T>()
      {
        T elementA = null;
        T elementB = null;
  
        @Override
        public boolean hasNext()
        {
          if(elementA == null && a.hasNext()) elementA = a.next();
          if(elementB == null && b.hasNext()) elementB = b.next();

          return elementA != null || elementB != null;
        }

        @Override
        public T next()
        {
          if(elementA != null && elementB != null) 
          {
            return (elementA.compareTo(elementB) < 0) ? vrniElement(elementA) : vrniElement(elementB);
          }
          
          T element = (elementA != null) ? elementA : elementB;
          
          return vrniElement(element);
        }

        private T vrniElement(T element)
        {
          T temp = element;
          if(elementB == element)
          {
            elementB = null;
          }
          else
          {
            elementA = null;
          }

          return temp;
        }

      };
    }
}
