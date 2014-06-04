import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;



//when convertinng a list of strings to a csv delimited string the last symbol is a comma has to be deleted
public class SplitterAndJoiner {

	static public String makeCSV(List<String> list){
		if(list==null || list.size()==0){
			return null;
		}
		StringBuilder sb = new StringBuilder();
		for(String s:list){
			sb.append(s+",");
		}
		
		return sb.toString().substring(0,sb.toString().length()-1);
	}
	
	static public String makeCSVJoiner(List<String>list){
		Joiner joiner = Joiner.on(",").skipNulls();
		return joiner.join(list);
	}
	
	static public List<String> splitCSV(String s){
		if (s==null) return new LinkedList();
		StringTokenizer st = new StringTokenizer(s);
		List<String> list = new LinkedList<String>();
		while(st.hasMoreTokens()){
			list.add(st.nextToken());
		}
		return list;
	}
	
	static public List<String> splitCSVSplitter(String s){
		Iterable<String> it = Splitter.on(",").omitEmptyStrings().trimResults().split(s);
		return Lists.newLinkedList(it);
	}
	
	static public void main(String []args){
		List<String> list = new LinkedList<String>();
		{
			list.add("a");
			list.add("b");
			list.add("c");	
		}
		System.out.println(makeCSV(list));
		System.out.println(makeCSVJoiner(list));
		
		//splitter is the reverse pattern 
		System.out.println(splitCSV("a,b,c"));
		System.out.println(splitCSVSplitter("a,b,c"));

	}
}
