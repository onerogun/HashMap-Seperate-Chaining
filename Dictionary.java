import java.util.ArrayList;
import java.util.List;

public class Dictionary<X,Y> {
	
	private List<Entry<X,Y>> dictionary;
	private final static int INITIAL_SIZE = 11;
	
	public Dictionary() {
		this(INITIAL_SIZE);
	}
	
	public Dictionary(int size) {
		
		
		
		dictionary = new ArrayList<Entry<X,Y>>(size);
		for(int i = 0; i < size; i++) {
			dictionary.add(i, null);
		}
		
		System.out.println( dictionary.toString());
		System.out.println(dictionary.size());
	}
	
	public void add(Entry<X,Y> newEntry) {
		int position = newEntry.hashCode() % INITIAL_SIZE;
		if(dictionary.get(position) == null) {
			dictionary.set(position, newEntry);
		} else {
			Entry<X,Y> tempEntry = dictionary.get(position);
			while(tempEntry.getNext() != null) {
				tempEntry = tempEntry.getNext();
			}
			tempEntry.setNext(newEntry);
		}
	}
	
	public boolean remove(Entry<X,Y> entry) {
		int position = entry.hashCode() % INITIAL_SIZE;
		if(dictionary.get(position) == null) {
			return false;
		} else {
			Entry<X,Y> tempEntry = dictionary.get(position);
			if(tempEntry.equals(entry)) {
				dictionary.set(position,null);
				return true;
			}

			
			while(tempEntry.getNext() != null) {
				if(tempEntry.getNext().equals(entry)) {
					
					tempEntry.setNext(null);
					return true;
				}
				tempEntry = tempEntry.getNext();
			}
			
			return false;
		}
	}
	
	public boolean contains(Entry<X,Y> entry) {
		int position = entry.hashCode() % INITIAL_SIZE;
		if(dictionary.get(position) == null) {
			return false;
		} else {
			Entry<X,Y> tempEntry = dictionary.get(position);
			
			while(tempEntry != null) {
				if(tempEntry.equals(entry)) {
					return true;
				}
				tempEntry = tempEntry.getNext();
			}
			return false;
		}
		
		
	}
	
	public void printContent() {
		for(int i = 0; i < dictionary.size(); i++) {
			Entry<X,Y> current = dictionary.get(i);
			
			System.out.println("Position " + i);
			while(current != null) {
				System.out.println( "\t" + current.toString());
				current = current.getNext();
			}
		}
	}

}
