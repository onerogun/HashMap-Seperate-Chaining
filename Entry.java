
	class Entry  <X, Y> {
	

	    private final X key;

	    private Y value;

	    private Entry<X, Y> next;
	    

	    public Entry(X key, Y value) {

	        this.key = key;

	        this.value = value;

	        this.next = null;
	        
	    }

	    public Entry(X key, Y value,  Entry<X, Y> next) {

	        this.key = key;

	        this.value = value;

	        this.next = next;
	        
	    }
	    
	    




		public X getKey() {
			return key;
		}






		public Y getValue() {
			return value;
		}






		public Entry<X, Y> getNext() {
			return next;
		}






		public void setValue(Y value) {
			this.value = value;
		}






		public void setNext(Entry<X, Y> next) {
			this.next = next;
		}






		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((key == null) ? 0 : key.hashCode());
			result = prime * result + ((value == null) ? 0 : value.hashCode());
			return result;
		}



		@Override
		public boolean equals(Object obj) {

			if(obj instanceof Entry<?,?>) {
				Entry<?,?> otherEntry = (Entry<?,?>) obj;
				return this.key.equals(otherEntry.key) && this.value.equals(otherEntry.value);
			} else {
				return false;
			}
	
		}






		@Override
		public String toString() {
			return "Entry [key=" + key + ", value=" + value + "]";
		}







	    
	    
	

}
