import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Initiator {
	List<Integer> collection;

	public Initiator() {
		collection = new LinkedList<Integer>();
	}

	// Creates a list of unique elements
	public void initiate(int seed) {
		collection.clear();
		for (int i = 1; i < 10000; i++) {
			if ((i % seed) != 0)
				collection.add(i);
		}
	}

	public int countIntersection(Initiator other) {
		int count = 0;
		for (Integer i : collection) {
			if (other.getCollection().contains(i)) {
				count++;
			}
		}
		return count;
	}

	protected Collection<Integer> getCollection() {
		return collection;
	}
}
