package edu.ufl.mebin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectedAcyclicGraph {
	Map<String, Node> nodes = new HashMap<String, Node>();
	/**
     * Add an edge from {@code source} to {@code destination} and return
     * {@code true} if the edge is added as a result of this function. If
     * either {@code source} or {@code destination} does not exist, create
     * them before adding the edge.

     * @param source the name of the source node
     * @param destination the name of the destination edge
     * @return {@code true} if the edge is added as a result of this 
     * method call
     */
	public boolean addEdge(String source, String destination) {
		if (nodes.containsKey(source) && nodes.containsKey(destination)) {
			// both the nodes exist
			Node sourceNode = nodes.get(source);
			Node destinationNode = nodes.get(destination);
			List<Node> sourceAdjList = sourceNode.getAdjList();
			List<Node> destAdjList = destinationNode.getAdjList();
			if (isPresent(sourceAdjList, destinationNode) || isPresent(destAdjList, sourceNode) ){
				return false;
			} else {
				sourceAdjList.add(destinationNode);
			}
		}

		if (!nodes.containsKey(source)) {
			Node sourceNode = new Node();
			sourceNode.setValue(source);
			nodes.put(source, sourceNode);
		}

		if (!nodes.containsKey(destination)) {
			Node destinationNode = new Node();
			destinationNode.setValue(destination);
			nodes.put(destination, destinationNode);
		}
		nodes.get(source).getAdjList().add(nodes.get(destination));
		
		return true;
	}

	private boolean isPresent(List<Node> list, Node n) {
		return list.contains(n);
	}
}
