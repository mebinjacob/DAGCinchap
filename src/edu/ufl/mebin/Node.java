package edu.ufl.mebin;

import java.util.ArrayList;
import java.util.List;

public class Node {
	private String value;
	private List<Node> adjList = new ArrayList<Node>();

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<Node> getAdjList() {
		return adjList;
	}

	public void setAdjList(List<Node> adjList) {
		this.adjList = adjList;
	}

}
