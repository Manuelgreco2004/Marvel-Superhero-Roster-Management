public class SuperheroRoster {
    public static void main(String[] args) {
        // 1. Declare and initialize parallel arrays for hero names, abilities, and power levels
        String[] heroNames = {"Spider-Man", "Iron Man", "Black Widow", "War Machine"};
        String[] abilities = {"Web-slinging, spider powers, super-strength", "Flying, high-tech armor, powerful arsenal", "Stealth and close-range combat", "Heavy armor and heavy arsenal"};
        int[] powerLevels = {150, 120, 80, 180};


        System.out.println();
        System.out.println("--- Marvel Superhero Roster Management ---");
        System.out.println();

        
        // 2. Print each hero's details using a loop
        for (int i = 0; i < heroNames.length; i++) {
            System.out.println("Hero Identity: " + heroNames[i]); 
            System.out.println("Abilities: " + abilities[i]);
            System.out.println("Power Level: " + powerLevels[i]);
        }
        System.out.println();

        // 3. Call the searchHero method to find a specific hero by name
        System.out.println("--- Hero Search ---");
        searchHero(heroNames, abilities, powerLevels, "Iron Man");
        searchHero(heroNames, abilities, powerLevels, "Thor"); // Testing a missing hero
        System.out.println();

        // 4. Calculate and display the average power level by calling calculateAveragePower method
        System.out.println("--- Average Power Level ---");
        double avgPower = calculateAveragePower(powerLevels);
        System.out.println("Average Power Level: " + avgPower);
        System.out.println();

        // 5. Create an array of Superhero objects and populate it with sample heroes
        System.out.println("--- Sample Hero Descriptions ---");
        Superhero[] team = new Superhero[4];
        team[0] = new Superhero("Black Panther", "Vibranium suit with sharp claws", 90);
        team[1] = new Superhero("Yellow Wasp", "Ability to shrink and create 'stings'", 50);
        team[2] = new Superhero("The Hulk", "Gamma radiation, super-strength, super-durability", 5000);
        team[3] = new Superhero("Thor", "Wields the power of thunder, god-like powers", 3000);

        // Displaying each hero using the class method
        for (Superhero hero : team) {
            hero.displayHero();
        }

        // On my own. Want to test out Supervillain Class and arrays.

        System.out.println();
        System.out.println("--- WARNING! ---");
        System.out.println("--- WARNING! ---");
        System.out.println("--- WARNING! ---");
        System.out.println();
        System.out.println("--- SUPERVILLAINS APPROACHING! ANALYZING INDIVIDUALS: ---");
        System.out.println();

        Supervillain[] mob = new Supervillain[4];
        mob[0] = new Supervillain("Crimson Dynamo", "Soviet armor, destructive arsenal", 200);
        mob[1] = new Supervillain("Venom", "Parasitic symbiote, deadly shape-shifting powers", 350);
        mob[2] = new Supervillain("Whirlwind", "Wind powers capable of creating tornados", 100);
        mob[3] = new Supervillain("The Red Skull", "Leader of HYDRA", 70);


        for (Supervillain villain : mob) {
            villain.displayVillain();
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