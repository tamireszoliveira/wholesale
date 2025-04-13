package controller;
import model.queue;

public class Fila<T> {
	private queue<T> fila = new queue<T>();
	
	public void insert(T item) {
		fila.insert(item);
	}
	
	public T remove() throws Exception {
		return fila.remove();
	}
	
	public boolean isEmpty() {
		return fila.isEmpty();
	}
	
	public int size() {
		return fila.size();
	}
	
	/*public T list() {
		return fila.list();
	} */
}
