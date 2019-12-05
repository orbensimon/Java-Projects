package starfleet;

public class CargoShip extends Spacecraft {
	private int space_cranes;
	public static int num_of_cargo_ship=0;
	// CargoShip constructor, first call to Spacecraft constructor
	public CargoShip(String name, int commissionYear, float maximalSpeed,int cargoCapacity, int numberOfSpaceCranes)
	{
		super(name,commissionYear,maximalSpeed,cargoCapacity);
		setNumberOfSpaceCranes(numberOfSpaceCranes);
		setAnnualMaintenanceCost(cargoCapacity,numberOfSpaceCranes);
		num_of_cargo_ship++;
	}
	public void setNumberOfSpaceCranes(int numberOfSpaceCranes)
	{
		space_cranes=numberOfSpaceCranes;
	}
	public int getNumberOfSpaceCranes()
	{
		return space_cranes;
	}
	public void setAnnualMaintenanceCost(int cargoCapacity,int numberOfSpaceCranes)
	{
		maintenance_coast=2000+(500*numberOfSpaceCranes)+(2*cargoCapacity);
	}
	public int getAnnualMaintenanceCost()
	{
		return maintenance_coast;
	}
	// set and get to number of cranes, not needed unless number of cranes can changed
	public void set_cranes(int numofcranes)
	{
		space_cranes=numofcranes;
		setAnnualMaintenanceCost(cargo_capacity,numofcranes);
		
	}
	public int getnum_cranes()
	{
		return space_cranes;
	}
	public String toString()
	{
		return String.format("%s	NumberOfSpaceCranes=%d\n",super.toString(),space_cranes);
	}

}
