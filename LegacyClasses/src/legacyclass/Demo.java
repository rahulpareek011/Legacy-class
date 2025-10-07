package legacyclass;
import java.util.*;


public class Demo {
	public static void main(String[] args) {
//		//Using vector
//		Vector v = new Vector();
//		v.add("abd");
//		v.add("ald");
//		v.add("hgdk");
//		
//		Enumeration e = v.elements();
//		
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
		
		//Using Properties with enumeration
		Properties p1 = new Properties();
		p1.put("1","Java");
		p1.put("2","React");
		p1.put("3","DSA");
		
		// Get only values
        Enumeration enm = p1.elements();
        while(enm.hasMoreElements()) {
            System.out.println(enm.nextElement());
        }
		
		System.out.println();
		
		Enumeration<?> e1 = p1.propertyNames();
		
		while(e1.hasMoreElements()) {
			String keys = (String) e1.nextElement();
			String values = p1.getProperty(keys);
			System.out.println(keys + "-> " + values);
		}
		
		
	}

}
