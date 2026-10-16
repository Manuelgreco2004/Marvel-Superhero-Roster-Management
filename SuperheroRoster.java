public class SuperheroRoster {
    public static void main(String[] args) {
        // 1. Declare and initialize parallel arrays for hero names, abilities, and power levels
        String[] heroNames = {"Spider-Man", "Iron Man", "Black Widow", "War Machine"};
        String[] abilities = {"Web-slinging", "Flying and high-tech armor", "Stealth and combat", "Heavy armor and heavy arsenal"};
        int[] powerLevels = {85, 90, 80, 100};

        System.out.println("");
        System.out.println("--- Marvel Superhero Roster Management ---");
        System.out.println("");
        
        // 2. Print each hero's details using a loop
        for (int i = 0; i < heroNames.length; i++) {
            System.out.println("Hero: " + heroNames[i] + " | Ability: " + abilities[i] + " | Power Level: " + powerLevels[i]);
        }
        System.out.println();

        // 3. Call the searchHero method to find a specific hero by name
        System.out.println("--- Search Testing ---");
        searchHero(heroNames, abilities, powerLevels, "Iron Man");
        searchHero(heroNames, abilities, powerLevels, "Thor"); // Testing a missing hero
        System.out.println();

        // 4. Calculate and display the average power level by calling calculateAveragePower method
        System.out.println("--- Average Power Level ---");
        double avgPower = calculateAveragePower(powerLevels);
        System.out.println("Average Power Level: " + avgPower);
        System.out.println();

        // 5. Create an array of Superhero objects and populate it with sample heroes
        System.out.println("--- Character Descriptions ---");
        Superhero[] team = new Superhero[4];
        team[0] = new Superhero("Black Panther", "Vibranium suit with sharp claws", 90);
        team[1] = new Superhero("Yellow Wasp", "Ability to shrink and create 'stings'", 50);
        team[2] = new Superhero(heroNames[2], abilities[2], powerLevels[2]);
        team[3] = new Superhero(heroNames[3], abilities[3], powerLevels[3]);

        // Displaying each hero using the class method
        for (Superhero hero : team) {
            hero.displayHero();
        }
    }

    // Method: searchHero
    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        boolean found = false;
        
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.println("Found! Hero: " + names[i] + " | Ability: " + abilities[i] + " | Power Level: " + powerLevels[i]);
                found = true;
                break; 
            }
        }
        
        if (!found) {
            System.out.println("Hero \"" + target + "\" not found.");
        }
    }

    // Method: calculateAveragePower
    public static double calculateAveragePower(int[] powerLevels) {
        if (powerLevels.length == 0) {
            return 0;
        }
        
        int sum = 0;
        for (int level : powerLevels) {
            sum += level;
        }
        
        return (double) sum / powerLevels.length;
    }
}