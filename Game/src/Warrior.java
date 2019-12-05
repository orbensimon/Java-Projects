
public class Warrior extends Hero{
	protected int attackpoints;
	static int warriorcounter=0;
	public Warrior(int lp,int ap)
	{
		super(lp);
		setattackpoints(ap);
		warriorcounter++;
	}
	public int getattackpoints()
	{
		return attackpoints;
	}
	public void setattackpoints(int at)
	{
		if(at<0)
			attackpoints=0;
		else
			attackpoints=at;
	}
	public Hero attack(Hero hero)
	{
		Hero newwarrior;
		if(hero instanceof Warrior)
		{
			if(hero.get()==get() && ((Warrior)hero).attackpoints==attackpoints)
			{
				System.out.printf("Error - hero can't attack himself\n");
				return newwarrior=null;
			}
			else
			{
			    hero.set(((Warrior)hero).lifepoints-attackpoints);
			    return newwarrior=null;
			}
		}
		else
		{
			hero.set(hero.lifepoints-attackpoints/2);
			if(hero.lifepoints <= lifepoints)
			{
				 newwarrior=new Warrior(lifepoints,attackpoints);
				 return newwarrior;
			}
			else
				return newwarrior= null;
				
		}
	}
	public static int getNoWarrior()
	{
		return warriorcounter;
	}
	public String toString()
	{
		return String.format("Warrior with %d lifePoints and %d attackPoints\n",lifepoints,attackpoints);
	}
	

}
