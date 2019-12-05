package wordcount;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;

public class WordCounter {
	public static void main(String args[]){
		boolean scanflag=true;
		boolean argflag=false;
	    int wordcounter=0;
	    Object arr[];
		Map<String,Integer> map=new TreeMap<String,Integer>();
		Iterator<String> it;
		Set<String> set=new TreeSet<String>();
		String word;
		File file;
		PrintWriter out1=null;
		PrintWriter out2=null;
		String filename;
		String outfile,outfile2;
		String pattern="\\n|\\s([A-Zb-km-z])?[\\s]|\\s|\\.[\\s]|\\,[\\s]|[0-9]{1,}+([A-Za-z]{1,})?|[A-Za-z]{1,}+[0-9]{1,}|[^A-Za-z&&[^']]{1,}|[']{2,}";
		Scanner scanfilename=new Scanner(System.in);
		Scanner scnr = null;
		do
		{
			try
			{
				if(!argflag)
				{
					file=new File(args[0]);
					scnr=new Scanner(file);
					out1= new PrintWriter(args[1]);
					out2= new PrintWriter(args[2]);
					scanflag=false;
				}
				else
				{
					System.out.println("Plz re-enter path of input file:");
					filename=scanfilename.nextLine();
					file=new File(filename);
					scnr=new Scanner(file);
					scanflag=false;
					
				}
				
			}
			catch(IOException exc)
			{
				System.out.println("File path not found");
				argflag=true;
			}
			catch(IndexOutOfBoundsException iob)
			{
				System.out.println("Arguments passed incorecetly");
				argflag=true;
			}
			
		}while(scanflag);
		scanflag=true;
		scnr.useDelimiter(pattern);
		while(scnr.hasNext())
		{
			word=scnr.next();
			if(word.length()!=0)
			{
				wordcounter++;
				word=word.toLowerCase();
				if(word.startsWith("'"))
				{
					word=word.substring(1,word.length());
				}
				if(word.endsWith("'"))
					word=word.substring(0,word.length()-1);
				if(map.containsKey(word))
					map.put(word,map.get(word)+1);
				else
					map.put(word,1);
			}
			
		}
		if(out1==null)
		{
			do
			{
				try
				{
					System.out.println("Output file didnt recived as argument plz enter output file path:");
					outfile=scanfilename.nextLine();
					out1= new PrintWriter(outfile);
					scanflag=false;
				}
				catch(IOException e)
				{
					System.out.println("path wasnt found plz try again");
				}
			}while(scanflag);
			
		}
		scanflag=true;
		if(out2==null)
		{
			do
			{
				try
				{
					System.out.println("Output file #2 didnt recived as an argument plz enter output file path:");
					outfile2=scanfilename.nextLine();
					out2= new PrintWriter(outfile2);
					scanflag=false;
				}
				catch(IOException e)
				{
					System.out.println("path of output file #2 wasnt found plz try again");
				}
			}while(scanflag);
			
		}
		out1.println(wordcounter+ "	words were found");
		out1.println(map.size()+"	of these were distinct");
		set.addAll(map.keySet());
		it=set.iterator();
		while(it.hasNext())
		{
			word=it.next();
			out1.println("	"+word+"	"+map.get(word));
		}
		out2.println(wordcounter+ "	words were found");
		out2.println(map.size()+"	of these were distinct");
		arr=map.entrySet().toArray();
		Arrays.sort(arr,new ValueComparator());
		ArrayList<Object> arrlist=new ArrayList<Object>();
		for(Object e:arr)
			arrlist.add((Map.Entry<String,Integer>)e);
		int i=0;
		for(Object e:arrlist)
			out2.println("rank:		"+ ++i +"		frequency:		"+ ((Map.Entry<String,Integer>)e).getValue()+((Map.Entry<String,Integer>)e).getKey());
		System.out.println("FINISH!");
		out1.close();
		out2.close();
	}

}
