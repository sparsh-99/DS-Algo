#include<iostream>
#include<set>
#include<list>
#include<algorithm>
using namespace std;

typedef struct nodes {
   int dest;
   int cost;
}node;

class Graph {
   int n;
   list<node> *adjList;
   private:
      void showList(int src, list<node> lt) {
         list<node> :: iterator i;
         node tempNode;

         for(i = lt.begin(); i != lt.end(); i++) {
            tempNode = *i;
            cout << "(" << src << ")---("<<tempNode.dest << "|"<<tempNode.cost<<") ";
         }
         cout << endl;
      }
   public:
      Graph() {
         n = 0;
      }

      Graph(int nodeCount) {
         n = nodeCount;
         adjList = new list<node>[n];
      }

      void addEdge(int source, int dest, int cost) {
         node newNode;
         newNode.dest = dest;
         newNode.cost = cost;
         adjList[source].push_back(newNode);
      }

      void displayEdges() {
         for(int i = 0; i<n; i++) {
            list<node> tempList = adjList[i];
            showList(i, tempList);
         }
      }

      friend void dijkstra(Graph g, int *dist, int *prev, int start);
};

void dijkstra(Graph g, int *dist, int *prev, int start) {
   int n = g.n;

   for(int u = 0; u<n; u++) {
      dist[u] = 9999;   //set as infinity
      prev[u] = -1;    //undefined previous
   }

   dist[start] = 0;   //distance of start is 0
   set<int> S;       //create empty set S
   list<int> Q;

   for(int u = 0; u<n; u++) {
      Q.push_back(u);    //add each node into queue
   }

   while(!Q.empty()) {
      list<int> :: iterator i;
      i = min_element(Q.begin(), Q.end());
      int u = *i; //the minimum element from queue
      Q.remove(u);
      S.insert(u); //add u in the set
      list<node> :: iterator it;

      for(it = g.adjList[u].begin(); it != g.adjList[u].end();it++) {
         if((dist[u]+(it->cost)) < dist[it->dest]) { //relax (u,v)
            dist[it->dest] = (dist[u]+(it->cost));
            prev[it->dest] = u;
         }
      }
   }
}

main() {
   int n = 7;
   Graph g(n);
   int *dist = new int[n];
   int *prev = new int[n];
   int start = 0;
   int edges;
   cout<< "enter the number of edges";
   cin>>edges;
   for(int i=0;i<=edges*2;i++){
       int source,dest,cost;
       cout<<"enter edges in source-destination-cost format";
       cin>>source>>dest>>cost;
       g.addEdge(source,dest,cost);
   }



   dijkstra(g, dist, prev, start);

   for(int i = 0; i<n; i++)
      if(i != start)
         cout<<start<<" to "<<i<<", Cost: "<<dist[i]<<" Previous: "<<prev[i]<<endl;
}
