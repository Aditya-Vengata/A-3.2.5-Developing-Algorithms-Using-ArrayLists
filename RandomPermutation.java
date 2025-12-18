import java.util.ArrayList;

public class RandomPermutation {
    /**
     * Overloaded next method to randomize an ArrayList of Horses[cite: 76, 79].
     * @param list The original ArrayList of Horses[cite: 78].
     * @return A new ArrayList with the horses in random order[cite: 79, 80].
     */
    public ArrayList<Horse> next(ArrayList<Horse> list) {
        ArrayList<Horse> result = new ArrayList<Horse>();
        // Create a copy to avoid modifying the original list
        ArrayList<Horse> copy = new ArrayList<Horse>(list);
        
        while (copy.size() > 0) {
            int index = (int) (Math.random() * copy.size());
            result.add(copy.remove(index));
        }
        return result;
    }
}
