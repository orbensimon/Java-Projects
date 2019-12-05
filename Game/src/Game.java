import java.util.ArrayList;

public class Game {
	public static void main(String args[]) {
		ArrayList < Hero> heroes= new ArrayList<Hero>();
		Hero newHero;
		heroes.add(new Warrior(0,5));
		heroes.add(new Warrior(15,2));
		heroes.add(new Magician(15,2));
		printNoHeroes();
		int initial = heroes.size();
		for (int i=0; i<initial; ++i) {
		for (int j=i+1; j<initial; ++j) {
		newHero=heroes.get(i).attack(heroes.get(j));
		if (newHero !=null) heroes.add(newHero);
		newHero=heroes.get(j).attack(heroes.get(i));
		if (newHero !=null) heroes.add(newHero);
		}
		}
		printNoHeroes();
		for (int i=0; i<heroes.size(); ++i) {
		System.out.println("Hero "+i+ " is a "+heroes.get(i));
		}
		heroes.get(0).attack(heroes.get(0));
		}
		static public void printNoHeroes(){
		System.out.println("There are "+Warrior.getNoWarrior()+
		" Warriers and "+
		Magician.getNoMagician()+" Magicians in the game");
		}

}
