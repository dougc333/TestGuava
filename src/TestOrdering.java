
import java.util.List;
import java.util.LinkedList;

import com.google.common.base.Preconditions;
import com.google.common.collect.Collections2;
import com.google.common.collect.Ordering;



//problem, collection classes can contain null values
//extra code to test and compare with nulls ....
public class TestOrdering {
	class Bug{
		public String name;
		public boolean canBite;
		public boolean canKillYou;
		
		public Bug(String n , boolean bite, boolean kill){
			name=Preconditions.checkNotNull(n);
			canBite=Preconditions.checkNotNull(bite);
			canKillYou=Preconditions.checkNotNull(kill);
		}
	}
	
	public static void main(String []args){
		TestOrdering o = new TestOrdering();
		TestOrdering.Bug m= o.new Bug("horse fly",true,false);
		TestOrdering.Bug t= o.new Bug("tsetse fly",true,true);
		List<Bug> list= new LinkedList<Bug>();
		list.add(m);
		list.add(t);
		list.add(null);
		Collections2.
		Collections2.sort(list,Ordering.natural().nullsLast());
	}
}
