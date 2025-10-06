package legacyclass;
import java.util.*;


public class Demo {
	public static void main(String[] args) {
		//Using vector
		Vector v = new Vector();
		v.add("abd");
		v.add("ald");
		v.add("hgdk");
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
