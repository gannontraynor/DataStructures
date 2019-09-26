package assignment5;
import week1examples.SimplerBST;
import java.util.*;
import algs13.Queue;

//Gannon Traynor

public class A5ReorganizingBST<K extends Comparable<? super K>, V> {
	private SimplerBST<K, V> tree;
	public int size;
	
	public A5ReorganizingBST() {	
		tree = new SimplerBST<K, V>();
		size = 0;
	}
	
	public V get(K key) {
		return tree.get(key);
	}
	
	public void put(K key, V value) {
		if (tree.contains(key) != false) {
			tree.put(key, value);
			size++;
		}
		if (size % 100 == 0); reorganize();
		
	}
	
	public void delete(K key) {
		tree.delete(key);
		size--;
		if (size % 100 == 0); reorganize();

	}
	
	public int height() {
		return tree.height();
	}
	
	private void reorganize() {
		SimplerBST<K,V> tempTree = new SimplerBST<K, V>();
		ArrayList<K> keys = new ArrayList<K>();
		for(K key: tree.keys())
			keys.add(key);
		for(K key: listByMedians(keys))
			tempTree.put(key, tree.get(key));
		tree = tempTree;
	}
	
	private Iterable<K> listByMedians(List<K> keys) {
		Queue<K> medianQueue = new Queue<>();
		Queue<Integer> queueLeft = new Queue<>();
		Queue<Integer> queueRight = new Queue<>();
		queueLeft.enqueue(0);
		queueRight.enqueue(keys.size()-1);
		while (!queueLeft.isEmpty()) {
			int left = queueLeft.dequeue();
			int right = queueRight.dequeue();
			if (left <= right) {
				int medianIndex = (right+left)/2;
				K median = keys.get(medianIndex);
				medianQueue.enqueue(median);
				queueLeft.enqueue(left);
				queueRight.enqueue(medianIndex-1);
				queueLeft.enqueue(medianIndex+1);
				queueRight.enqueue(right);
			}
		}
		return medianQueue;
	}
			
}
