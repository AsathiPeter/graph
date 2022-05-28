package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

        int V;
        ArrayList<Integer> adjecency[];
        Main( int noOfVertexes) {
            V = noOfVertexes;
            adjecency = new ArrayList[noOfVertexes];
            for (int i = 0; i < noOfVertexes; i++) {
                adjecency[i] = new ArrayList<>();
            }

            void edge(int x, int y){
                adjecency[x].add(y);
            }
            void breathFirstSearch( int sourceVertex){
                boolean[] visited = new boolean[V];

                ArrayList<Integer> a1 = new ArrayList<Integer>();
                visited[sourceVertex] = true;
                a1.add(sourceVertex);
                while (!a1.isEmpty()) {
                    sourceVertex = a1.remove(0);
                    System.out.println(sourceVertex + " ");
                    Iterator i = adjecency[sourceVertex].iterator();
                    while (i.hasNext()) ;
                    int n = (int) i.next();
                    if (!visited[n]) {
                        visited[n] = true;
                        a1.add(n);
                    }


                }
            }

            public static void main (String[]args){
                Main g1 = new Main(6);
                g1.edge(0, 1);
                g1.edge(0, 2);
                g1.edge(0, 5);
                g1.edge(1, 0);
                g1.edge(1, 2);
                g1.edge(2, 0);
                g1.edge(2, 1);
                g1.edge(2, 3);
                g1.edge(2, 4);
                g1.edge(3, 2);
                g1.edge(4, 2);
                g1.edge(4, 5);
                g1.edge(5, 0);
                g1.edge(5, 4);

                g1.breathFirstSearch(0);
            }
        }



}
