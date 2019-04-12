import java.util.*;

class Solution {
  /**
   * Find the shortest path between v and u in the graph g.
   *
   * @param g
   *     graph to search in.
   * @param v
   *     node to start from.
   * @param u
   *     node to reach.
   * @return the nodes you that form the shortest path, including v and u. An
   * empty list iff there is no path between v and u.
   */
  public static List<Vertex> shortestPath(Graph g, Vertex v, Vertex u) {
    GraphIterator git = new GraphIterator(g, v);
    Map<Vertex, Vertex> predecessors = new TreeMap<>();

    List<Vertex> result = new ArrayList<Vertex>();

    Vertex from = v;
    boolean hit = false;

    while(git.hasNext()){
      Vertex x = git.next();
      if(g.getNeighbours(from).contains(x)){
        predecessors.put(x, from);
      }
      else{
        from = x;
      }
    }
  }

  // FULL IMPLEMENTATION ON WEBLAB
  interface Vertex {
    int getId();
  }
  
  interface Graph {
    // Gets neighbours of v in this Graph, ordered by id
    public List<Vertex> getNeighbours(Vertex v);
    // Gets all vertices of this Graph
    public Collection<Vertex> getAllVertices();
  }
}