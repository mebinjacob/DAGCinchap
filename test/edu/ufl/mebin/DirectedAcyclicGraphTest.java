package edu.ufl.mebin;

import static org.junit.Assert.*;

import org.junit.Test;

public class DirectedAcyclicGraphTest {
	private DirectedAcyclicGraph dag = new DirectedAcyclicGraph();

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	@Test
	public void addEdgeTest() {
		assertEquals(true, dag.addEdge("1", "2"));
		assertEquals(false, dag.addEdge("1", "2"));
		assertEquals(true, dag.addEdge("3", "4"));
		assertEquals(false, dag.addEdge("2", "1"));
	}
}
