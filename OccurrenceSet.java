import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class OccurrenceSet<T> implements Set<T>{
	Map<T, Integer> HashMap = new HashMap();
	Comparator<? super T> comparator;
	
	public TreeSet<String> ToString(){
		Set<String> keys = (Set<String>) HashMap.keySet();
		TreeSet<String> sortedkeys = new TreeSet<>(keys);
		return sortedkeys;
	}
		
	@Override
	public boolean add(T word) {
		boolean x = false;
		if (HashMap.containsKey(word)){
			int count = HashMap.get(word);
			HashMap.put(word, count + 1);
			x = true;
		}else{
			HashMap.put(word, 1);
		}
		return x;
	}

	@Override
	public boolean addAll(Collection<? extends T> collect) {
		HashMap<T, Integer> start = new HashMap();
		boolean x = false;
		for (T element : collect){
			if (HashMap.containsKey(element)){
				int y = HashMap.get(element);
				HashMap.put(element, y + 1);
				x = true;
			}else{
				HashMap.put(element, 1);
				x = true;
			}
		}
		return x;
	}
		
	@Override
	public boolean remove(Object a) {
		if(HashMap.containsKey(a)){
			HashMap.remove(a);
			return true;
		}
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> collect) {
		boolean t = false;
		for (Object element : collect){
			if (HashMap.containsKey(element)){
				HashMap.remove(element);
				t = true;
			}
		}
		return t;
	}

	@Override
	public boolean retainAll(Collection<?> collect) {
		Map<T, Integer> decoy = new HashMap<T, Integer>(HashMap);
		boolean x = false;
		for(Object element : decoy.keySet().toArray()){
			if(decoy.containsKey(element) == false){
				decoy.remove(element);
				x = true;
			}
		}
		return x;
	}
		
	@Override
	public boolean contains(Object collect) {
		boolean x = false;
		if(HashMap.containsKey(collect) == true){
				x = true;}
		return x;
	}

	@Override
	public boolean containsAll(Collection<?> collect) {
		boolean x = true;
		int count = 0;
		int count1 = 0;
		for (Object element : collect){
			if (HashMap.containsKey(element)){
				count ++;
				x = true;
			}else{
				count1++;
			}
		}
		if (count1 == count){
			x = false;
		}
		return x;
	}
		
	@Override
	public int size(){
		return HashMap.size();
	}
		
	@Override
	public void clear() {
		HashMap.clear();
	}

	@Override
	public boolean isEmpty() {
		boolean x = false;
		if(HashMap.size() == 0){
			x = true;
		}
		return x;
	}

	@Override
	public Iterator<T> iterator() {
		T[] a = (T[]) new Object[HashMap.size()];
		Set<T> newSet = (Set<T>) HashMap.keySet();
		ArrayList<T> sort = new ArrayList<T>();
		Collections.sort(sort, (Comparator<? super T>) comparator);
		return (sort.iterator());

		}
		
	@Override
	public Object[] toArray() {
		Set<T> keys = HashMap.keySet();
		TreeSet<T> sortable = new TreeSet<>(keys);
		String[] ans = sortable.toArray(new String[sortable.size()]);
		return ans;
	}
		
	public String toString(){
		Set<T> keys = HashMap.keySet();
		TreeSet<T> sortable = new TreeSet<>(keys);
		return sortable.toString();	
	}
	
	@Override
	public <T> T[] toArray(T[] a) {
		T[] ta = HashMap.entrySet().toArray(a);
		return ta;
	}
}

