import java.util.ArrayList;

public class HorseBarn {
    private ArrayList<Horse> horses = new ArrayList<Horse>();

    public void addHorse(Horse h) {
        horses.add(h);
    }

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    /**
     * Performs Princess replacement, Chief insertion, and Gypsy/Magic additions
     * in one single traversal[cite: 53, 59].
     */
    public void modifyHorses() {
        int i = 0;
        while (i < horses.size()) {
            String name = horses.get(i).getName();

            // Replace Duke with Princess [cite: 54, 55]
            if (name.equals("Duke")) {
                horses.set(i, new Horse("Princess", 1445));
                System.out.println("Bye bye Duke");
            } 
            // Add Chief after Silver [cite: 56]
            else if (name.equals("Silver")) {
                horses.add(i + 1, new Horse("Chief", 1505));
                i++; // Skip Chief to avoid re-checking him
            } 
            // Add Gypsy and Magic on either side of Buddy [cite: 57, 59]
            else if (name.equals("Buddy")) {
                horses.add(i, new Horse("Gypsy", 1535)); // PDF Table 1 says 1535 [cite: 63]
                horses.add(i + 2, new Horse("Magic", 1425));
                i += 2; // Skip Gypsy and Buddy
            }
            i++;
        }
    }
}
