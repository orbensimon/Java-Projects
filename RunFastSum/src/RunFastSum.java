
public class RunFastSum {
	public static void main(String argc[]){
		FastSumArray fs = new FastSumArray(100);
		int i;
		fs.set(5, 5.005);
		fs.set(2, 2.002);
		fs.set(9, 9.009);
		fs.set(3, 3.003);
		fs.set(4, 4.004);
		System.out.println("First 10 entries:");
		for(i=0; i < 10; i++)
		System.out.println( i+": "+fs.get(i));
		System.out.println("fastsum: "+fs.fastSum());
	}

}
