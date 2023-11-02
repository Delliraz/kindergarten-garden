import java.util.*;

public class KindergartenGarden {
    private List<String> allNames = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry");
    private Map<Integer, List<Plant>> allPlants;


    public KindergartenGarden(String plants) {
        this.initializePlants(plants);
    }

    private void initializePlants(String plants) {
        List<String> strings = List.of(plants.split("\n"));
        this.allPlants = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            String currentString = strings.get(i);
            List<Plant> currentPlants = new ArrayList<>();
            for (int j = 0; j < currentString.length(); j++) {
                currentPlants.add(Plant.getPlant(currentString.charAt(j)));
            }
            this.allPlants.put(i, currentPlants);
        }
    }

    public KindergartenGarden(String plants, String[] names) {
        this.allNames = List.of(names);
        this.allNames = this.allNames.stream().sorted().toList();
        this.initializePlants(plants);
    }

    public List<Plant> getPlantsOfStudent(String name) {
        List<Plant> plantsOfStudent = new ArrayList<>();
        int indexOfStudent = this.allNames.indexOf(name) * 2;
        for (int i : this.allPlants.keySet()) {
            for (int j = indexOfStudent; j <= indexOfStudent + 1; j++) {
                plantsOfStudent.add(this.allPlants.get(i).get(j));
            }
        }
        return plantsOfStudent;
    }
}
