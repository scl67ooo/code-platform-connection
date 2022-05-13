package sandbox;

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {

	public static List<Object> filterList(final List<Object> g) {
		List<Object> a = new ArrayList<Object>();
		for (Object o : g) {
			if (o instanceof Integer) {
				if ((int)o >= 0) {
					a.add((Integer) o);
				}
			}
		}
		return a;
	}
}
