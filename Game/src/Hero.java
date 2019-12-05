
public abstract class Hero {
	protected int lifepoints;
	public Hero(int lp)
	{
		lifepoints=lp;
	}
	public void set(int lp)
	{
		lifepoints=lp;
	}
	public int get()
	{
		return lifepoints;
	}
	public abstract Hero attack(Hero hero);

}
