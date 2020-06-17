import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class HMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap mp = new HashMap();
		mp.put(1, new String("pop"));
		mp.put(2, new String("pop"));
		mp.put(3, new String("pop"));
		mp.put(1, new String("pops"));
		System.out.println(mp);

		Set ts = mp.entrySet();
		ts.add(56);
		System.out.println(ts);

	}

}
