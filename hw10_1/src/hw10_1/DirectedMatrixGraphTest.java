package hw10_1;

import java.util.Scanner;

public class DirectedMatrixGraphTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("hw10_1: ������\n\n�׷����� ���� �� �Է�:");
		int n=s.nextInt();
		DirectedMatrixGraph d=new DirectedMatrixGraph(n);
		System.out.print("�׷����� ���� �� �Է�:");
		int v=s.nextInt();
		for(int i=0;i<v;i++) {
			int v1=s.nextInt();
			int v2=s.nextInt();
			d.addEdge(v1, v2);
		}
		for(int i=0;i<v;i++) {
			System.out.print("���� "+i+"�� ������ ���� :");
			d.printAdjacentVertices(i);
			System.out.println();
		}
		for(int i=0;i<n;i++) d.depthFirstSearch(i);
	}
}
