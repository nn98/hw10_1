package hw10_1;

public class DirectedMatrixGraph {
	int[][]g;
	public DirectedMatrixGraph(int n) {
		g=new int[n][n];
	}
	public boolean hasEdge(int v1,int v2) {
		if(g[v1][v2]!=0) return true;
		else return false;
	}
	public void addEdge(int v1,int v2) {
		if(this.hasEdge(v1, v2)) System.out.println("이미 존재하는 간선");
		else if(v1>g.length||v2>g.length) System.out.println("범위를 벗어난 정점");
		else g[v1][v2]=1;
	}
	public void printAdjacentVertices(int v) {
		if(v>g.length) System.out.println("범위를 벗어난 정점");
		else for(int i=0;i<g[v].length;i++) {
			if(g[v][i]==1) System.out.print(i+" ");
		}
	}
	public void depthFirstSearch(int v) {
		this.dfs(v);
	}
	private void dfs(int v) {
		if(v>=g.length) return;
		else {
			for(int i = 1; i <g.length; i++) { 
				if(g[v][i] == 1) { // && visit[i] == 0
					System.out.println(v + "->" + i); 
					dfs(i); 
				}
			}
		}
	}
}
