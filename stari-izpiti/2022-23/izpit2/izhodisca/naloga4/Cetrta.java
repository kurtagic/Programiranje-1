import java.util.*;

public class Cetrta {

    public static Set<String> najMnozica(Map<String, Set<String>> sopomenke) {
        return Collections.max(sopomenke.entrySet(), Comparator.comparingInt(entry -> entry.getValue().size())).getValue();
    }

    public static Map<Set<String>, Integer> pogostost(String besedilo, Map<String, Set<String>> sopomenke) 
	{
        String[] besede = besedilo.split(" ");
		
		Map<Set<String>, Integer> frekvence = new HashMap<>();
		
        for (String beseda : besede)
		{
            sopomenke.entrySet().stream()
				.filter(entry -> entry.getValue().contains(beseda))
				.findFirst()
				.ifPresent(entry -> frekvence.put(entry.getValue(), frekvence.getOrDefault(entry.getValue(), 0) + 1));
        }
		
		return frekvence;
    }
}
