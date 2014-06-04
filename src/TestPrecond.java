import com.google.common.base.Preconditions;


public class TestPrecond {
	static private int[] intArray = {1,2,3,4,5};

	static public int getArrayElement(int index){
		Preconditions.checkElementIndex(index, intArray.length);
		return intArray[index];
	}
	
	
	
	
	public static void main(String args[]){
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
		//at TestPrecond.getArrayElement(TestPrecond.java:6)
		//at TestPrecond.main(TestPrecond.java:14)
		System.out.println(getArrayElement(10));
		
		
	}
}
