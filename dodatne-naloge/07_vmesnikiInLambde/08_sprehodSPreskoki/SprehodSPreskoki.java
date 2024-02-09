import java.util.*;

public class SprehodSPreskoki<T> implements Iterable<T>
{
    private List<T> list;

    public SprehodSPreskoki(List<T> seznam, int korak)
    {
        list = new ArrayList<>();

        int start = (korak > 0) ? 0 : seznam.size() - 1;

        for(int i = start; 0 <= i && i < seznam.size(); i += korak)
        {
            list.add(seznam.get(i));
        }
    } 

    @Override
    public Iterator<T> iterator()
    {
        return list.iterator();
    }
}
