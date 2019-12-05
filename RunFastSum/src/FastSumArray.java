import java.util.ArrayList;
public class FastSumArray {
	private int top;
	private int length;
	private double sum;
    private ArrayList <Double> valuearr=new ArrayList<Double>();
    private ArrayList <Integer> indexarr=new ArrayList<Integer>();
	public FastSumArray(int leng)
	{
		sum=0;
		top=0;
		length=leng;
		for(int i=0;i<length;i++){
			valuearr.add(i,0.0);
			indexarr.add(i,0);
			
		}
		System.out.printf("%d\n",valuearr.size());
		System.out.printf("%d\n",indexarr.size());
			
		
	}
	public void set(int index,double value)
	{
			if(indexarr.contains(index))
				System.out.println("Index already taken!");
			else{
				indexarr.add(top,index);
				valuearr.remove(index);
				valuearr.add(index,value);
				top++;
			}
		
	}
	public double get(int index)
	{
		return valuearr.get(index);
	}
	public double fastSum()
	{
		for(int num:indexarr) 
			sum+=valuearr.get(num);
		return sum;
	}
	

}
