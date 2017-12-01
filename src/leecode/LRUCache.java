package leecode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {

	public static void main(String[] args) {
		LRUCache lruCache = new LRUCache(2);
		lruCache.put(1, 1);
		lruCache.put(2, 2);
		System.out.println(lruCache.get(1));
		lruCache.put(3, 3);
		System.out.println(lruCache.get(2));

	}

	public class Element {
		public Integer key;
		public Integer value;

		public Element(Integer key, Integer value) {
			this.key = key;
			this.value = value;
		}
	}

	Map<Integer, Element> map;
	LinkedList<Element> linkedList;
	int capacity;

	public LRUCache(int capacity) {
		map = new HashMap<>();
		linkedList = new LinkedList<>();
		this.capacity = capacity;
	}

	public int get(int key) {
		if (map.containsKey(key)) {
			Element element = map.get(key);
			linkedList.remove(element);
			linkedList.add(element);
			return element.value;
		} else {
			return -1;
		}
	}

	public void put(int key, int value) {
		if (map.containsKey(key)) {
			linkedList.remove(map.get(key));
			Element newEle = new Element(key, value);
			linkedList.add(newEle);
			map.put(key, newEle);
		} else {
			if (linkedList.size() == capacity) {
				Element element = linkedList.remove();
				map.remove(element.key);
			}
			Element ele = new Element(key, value);
			map.put(key, ele);
			linkedList.add(ele);
		}
	}
}
