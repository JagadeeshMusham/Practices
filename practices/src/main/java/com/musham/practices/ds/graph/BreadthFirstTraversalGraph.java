package com.musham.practices.ds.graph;

import java.util.Iterator;
import java.util.LinkedList;


// Todo J, Have to re-look

//This class represents a directed graph using adjacency list
//representation
class BreadthFirstTraversalGraph {
	private int nVertices; // No. of vertices
	private LinkedList<Integer> adjacencyList[]; // Adjacency Lists

	// Constructor
	BreadthFirstTraversalGraph(int nodeCount) {
		nVertices = nodeCount;
		adjacencyList = new LinkedList[nVertices];
		for (int counter = 0; counter < nVertices; ++counter)
			adjacencyList[counter] = new LinkedList();
	}

	// Function to add an edge into the graph
	void addEdge(int v, int w) {
		adjacencyList[v].add(w);
	}

	// prints BFS traversal from a given source s
	void breadthFirstSearchTraversal(int startingNode) {
		// Mark all the vertices as not visited(By default
		// set as false)
		boolean visited[] = new boolean[nVertices];

		// Create a queue for BFS
		LinkedList<Integer> queue = new LinkedList<Integer>();

		// Mark the current node as visited and enqueue it
		visited[startingNode] = true;
		queue.add(startingNode);

		while (queue.size() != 0) {
			// Dequeue a vertex from queue and print it
			startingNode = queue.poll();
			System.out.print(startingNode + " ");

			// Get all adjacent vertices of the dequeued vertex s
			// If a adjacent has not been visited, then mark it
			// visited and enqueue it
			Iterator<Integer> adjacentNodes = adjacencyList[startingNode].listIterator();
			while (adjacentNodes.hasNext()) {
				int adjacentNode = adjacentNodes.next();
				if (!visited[adjacentNode]) {
					visited[adjacentNode] = true;
					queue.add(adjacentNode);
				}
			}
		}
	}

	// Driver method to
	public static void main(String args[]) {
		BreadthFirstTraversalGraph bftg = new BreadthFirstTraversalGraph(4);

		bftg.addEdge(0, 1);
		bftg.addEdge(0, 2);
		bftg.addEdge(1, 2);
		bftg.addEdge(2, 0);
		bftg.addEdge(2, 3);
		bftg.addEdge(3, 3);

		System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

		bftg.breadthFirstSearchTraversal(2);
	}
}
