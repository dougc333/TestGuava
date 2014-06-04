import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Optional;  

//dont return nulls
public class TestOption {
	static final Map<String,String> restaurantLocs = new HashMap<String,String>(); 

	static{
	 restaurantLocs.put("villa de sol","mtn view");
	 restaurantLocs.put("dish dash","sunnyvale");
	 restaurantLocs.put("akimo","san francisco");
	 restaurantLocs.put("seto","san jose");				
	}
	
	public static Optional<String> getRestaurantName(final String name){
		return Optional.fromNullable(restaurantLocs.get(name));
	}
	
	static public Optional<Double> divide(int numerator, int denominator){
		Double result=0.00;
		try{
			result = (double)numerator/denominator;
		}
		catch(Exception ex){
			System.out.println("cannot divide by 0");
			result=null; 
		}
		return Optional.fromNullable( result);
	}
	public static void main(String []args){
		System.out.println(getRestaurantName("akimo"));
		System.out.println(getRestaurantName("not here")); //no npe
		System.out.println(divide(100,0));
		System.out.println(divide(100,20));
		
		
	}
}
