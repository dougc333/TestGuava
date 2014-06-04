import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;


//to create a toString() method with less typing
//to make compareTo easier with Compareablechain
//to make Object equality easier when an object can be a null; used to avoid NPEs in production code
public class ObjectsCaseClass implements Comparable{
   private String name;
   private int age;
   
    
   public ObjectsCaseClass(String n, int age){
	   this.name=n;
	   this.age = age;
   }
   
   public String getName() {
	return name;
   }
   public int getAge() {
	return age;
   }

   @Override
   public String toString(){
	   return Objects.toStringHelper(getClass())
		  .add("name",name)
		  .add("age",age)
		  .toString();
   }
   
   
   @Override
   public int compareTo(Object that) {
   	return ComparisonChain.start().compare(this.getName(), ((ObjectsCaseClass)that).getName()).result();
   }
   
   
   public static void main(String []args){
	   ObjectsCaseClass o = new ObjectsCaseClass("asdf",100);
	   System.out.println(o.toString());
   }

}
