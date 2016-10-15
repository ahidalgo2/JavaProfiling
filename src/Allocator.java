import java.util.Collection;
import java.util.HashMap;

public class Allocator {
	private static class MyAlloc {
		private int id;

		private MyAlloc(int id) {
			this.id = id;
		}

		private int getId() {
			return id;
		}
	}

	private HashMap<Integer, MyAlloc> map = new HashMap<Integer, MyAlloc>();

	public void go() {
		alloc(10000);
		long yieldCounter = 0;
		while (true) {
			Collection<MyAlloc> myAllocSet = map.values();
			for (MyAlloc c : myAllocSet) {
				if (!map.containsKey(c.getId()))
					System.out.println("Now this is strange!");
				if (++yieldCounter % 1000 == 0)
					Thread.yield();
			}
		}
	}

	private void alloc(int count) {
		for (int i = 0; i < count; i++) {
			map.put(i, new MyAlloc(i));
		}
	}

}
