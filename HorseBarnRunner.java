import java.util.ArrayList;

public class HorseBarnRunner {
    public static void main(String[] args) {
        HorseBarn barn = new HorseBarn();
        
        // Setup initial data from Test Case 1 [cite: 52, 63]
        barn.addHorse(new Horse("Buddy", 1340));
        barn.addHorse(new Horse("Thunder", 1450));
        barn.addHorse(new Horse("Buttercup", 1200));
        barn.addHorse(new Horse("Bandit", 1390));
        barn.addHorse(new Horse("Silver", 1210));
        barn.addHorse(new Horse("Duke", 1410));

        ArrayList<Horse> activeList = barn.getHorses();

        // Task 1: Calculate Average [cite: 36, 113]
        double sum = 0;
        for (Horse h : activeList) { sum += h.getWeight(); }
        double avg = sum / activeList.size();
        System.out.println("Average weight: " + avg);

        // Task 2: Heaviest and Lightest [cite: 39, 112]
        Horse heaviest = activeList.get(0);
        Horse lightest = activeList.get(0);
        for (Horse h : activeList) {
            if (h.getWeight() > heaviest.getWeight()) heaviest = h;
            if (h.getWeight() < lightest.getWeight()) lightest = h;
        }
        System.out.println("Heaviest horse: " + heaviest.getName() + " at " + heaviest.getWeight());
        System.out.println("Lightest horse: " + lightest.getName() + " at " + lightest.getWeight());

        // Task 3: Modify the list [cite: 40, 53]
        System.out.println("\nAdded and deleted:");
        barn.modifyHorses();
        
        for (Horse h : activeList) {
            System.out.println(h.getName() + ": " + h.getWeight());
        }

        // Task 4: Randomize and Pair [cite: 70, 95]
        System.out.println("\nRandomized Pairs:");
        RandomPermutation rp = new RandomPermutation();
        ArrayList<Horse> randomHorses = rp.next(activeList); [cite: 76, 79]

        for (int i = 0; i < randomHorses.size(); i += 2) { [cite: 117]
            if (i + 1 < randomHorses.size()) {
                System.out.println(randomHorses.get(i).getName() + " and " + randomHorses.get(i+1).getName());
            } else {
                System.out.println(randomHorses.get(i).getName() + " has no partner."); [cite: 97]
            }
        }
    }
}
