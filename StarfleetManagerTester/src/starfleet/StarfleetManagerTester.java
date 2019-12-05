package starfleet;
import java.util.ArrayList;

public class StarfleetManagerTester {
	public static void main(String[] args) {

		System.out.println("*** STARFLEET COMMAND OFFICIAL REPORT ***\n");

		ArrayList<ISpacecraft> fleet = generateStarfleet();

		System.out.println("Fleet Ships by Commission Year:");
		for (String shipDescription : StarfleetManager.getSpacecraftDescriptionsByCommissionYear(fleet)) {
			System.out.println(shipDescription);
		}

		System.out.println();
		System.out.println("Ship Counts by Type:");
		StarfleetManager.printInstanceNumberPerClass(fleet);

		System.out.println();
		System.out.println("Weapon Types:");
		for (String  weaponName: StarfleetManager.getFleetWeaponNames(fleet)) {
			System.out.println("\t" + weaponName);
		}

		System.out.println();
		System.out.println("Fleet Totals:");
		System.out.println("\tTotal Fire Power:              " + StarfleetManager.getTotalFleetFirePower(fleet));
		System.out.println("\tTotal Cargo Capacity:          " + StarfleetManager.getTotalFleetCargoCapacity(fleet));
		System.out.println("\tAverage Fleet Speed:           " + StarfleetManager.getFleetAverageOfMaximalSpeed(fleet));
		System.out.println("\tTotal Annual Maintenance Cost: " + StarfleetManager.getTotalMaintenanceCost(fleet));

	}

	public static ArrayList<ISpacecraft> generateStarfleet() {
		ArrayList<ISpacecraft> fleet = new ArrayList<ISpacecraft>();

		fleet.add(new CargoShip("USS Lantree", 2421, 5.3f, 5000,3));
		fleet.add(new CargoShip("USS Peres", 2311, 5.3f, 4000,6));

		ArrayList<Weapon> weapons = new ArrayList<Weapon>();
		weapons.add(new Weapon("Laser Canons",10,100));
		weapons.add(new Weapon("Quantum Torpedoes",120,200));
		fleet.add(new Cruiser("USS Defiant",2423,6f, 100, weapons));

		weapons = new ArrayList<Weapon>();
		weapons.add(new Weapon("Laser Canons",10,100));
		weapons.add(new Weapon("Photon Torpedoes",100,200));
		fleet.add(new Destroyer("USS Excalibur",2416,8, 100, weapons,3));

		fleet.add(new ResearchShip("USS Enterprise", 2467,9.3f, 2000, 4));
		fleet.add(new ResearchShip("USS Voyager", 2567,9.1f, 2000, 3));
		return fleet;
	}


}
