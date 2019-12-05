package starfleet;

public class ResearchShip extends Spacecraft{
	private int num_of_labs;
	public static int num_of_rs_ships=0;
	
	// ResearchShip  constructor, first call to Spacecraft constructor
	public ResearchShip(String name, int commissionYear, float maximalSpeed,int cargoCapacity, int numberOfResearchLabs)
	{
		super(name,commissionYear,maximalSpeed,cargoCapacity);
		num_of_labs=numberOfResearchLabs;
		setAnnualMaintenanceCost(numberOfResearchLabs);
		num_of_rs_ships++;
	}
	public void setAnnualMaintenanceCost(int numberOfResearchLabs)
	{
		maintenance_coast=3000+(1500*numberOfResearchLabs);
	}
	public int getAnnualMaintenanceCost()
	{
		return maintenance_coast;
	}
	// set and get to number of labs, not needed unless number of labs can changed
	public void set_labs(int numoflabs)
	{
		num_of_labs=numoflabs;
		setAnnualMaintenanceCost(numoflabs);
	}
	public int getnum_labs()
	{
		return num_of_labs;
	}
	public String toString()
	{
		return String.format("%s	NumberOfResearchLabs=%d\n",super.toString(),num_of_labs);
	}
}
