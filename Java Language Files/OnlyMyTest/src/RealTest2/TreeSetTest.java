package RealTest2;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(5);
		treeSet.add(7);
		treeSet.add(9);
		
		SortedSet<Integer> headSet1 = treeSet.headSet(5);
		NavigableSet<Integer> headSet2 = treeSet.headSet(5, true);
		
		SortedSet<Integer> subSet1 = treeSet.subSet(3, 7);
		NavigableSet<Integer> subSet2 = treeSet.subSet(3, false, 7, true);
		
		SortedSet<Integer> tailSet1 = treeSet.tailSet(5);
		NavigableSet<Integer> tailSet2 = treeSet.tailSet(5, false);
		
		System.out.print("headSet(5) : ");
		for(Integer i : headSet1)
			System.out.print(i + " ");
		System.out.println();
		
		System.out.print("headSet(5, true) : ");
		for(Integer i : headSet2)
			System.out.print(i + " ");
		System.out.println();
		
		System.out.print("subSet(3, 7) : ");
		for(Integer i : subSet1)
			System.out.print(i + " ");
		System.out.println();
		
		System.out.print("subSet(3, false, 7, true) : ");
		for(Integer i : subSet2)
			System.out.print(i + " ");
		System.out.println();
		
		System.out.print("tailSet(5) : ");
		for(Integer i : tailSet1)
			System.out.print(i + " ");
		System.out.println();

		System.out.print("tailSet(5, false) : ");
		for(Integer i : tailSet2)
			System.out.print(i + " ");
		System.out.println();
	}
}