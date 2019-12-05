
public class Magician extends Hero {
	protected int magicpoints;
	static int magiciancounter=0;
	public Magician(int lp,int mp)
	{
		super(lp);
		setmagicpoints(mp);
		magiciancounter++;
	}
	public void setmagicpoints(int mp)
	{
		if(mp<0)
			magicpoints=0;
		else 
			magicpoints=mp;
	}
	public int getmagicpoints()
	{
		return magicpoints;
	}
	public Hero attack(Hero hero)
	{
		Hero newmagician;
		if(hero instanceof Magician && hero.get()==lifepoints && ((Magician)hero).magicpoints==magicpoints)
		{
				System.out.printf("Error - hero can't attack himself\n");
				return newmagician=null;
		}
		else
		{
			hero.set(hero.get()/magicpoints);
			if(hero.get()<=0)
			{
				newmagician=new Magician(lifepoints,magicpoints);
				return newmagician;
			}
			else
				return newmagician=null;
			
		}
	}
	public static int getNoMagician()
	{
		return magiciancounter;
	}
	public String toString()
	{
		return String.format("Magician with %d lifePoints and %d spellpointsPoints\n",lifepoints,magicpoints);
	}
	

}
