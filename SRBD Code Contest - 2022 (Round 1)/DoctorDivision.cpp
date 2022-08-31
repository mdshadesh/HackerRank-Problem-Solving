/*A Doctor travels from a division to other division where divisions are connected like a graph(directed graph) and the edge
weights are the probabilities of the doctor going from that division to other connected division but the doctor stays 10mins at 
each division now there will be given time and had to find the division in which he will be staying by that time and is determined 
by finding division which has high probability. Input is number of test cases followed by the number of nodes, edges, time after 
which we need to find the division in which he will be there, the edges starting point, end point, probability. Note: If he reaches
a point where there are no further nodes then he leaves the lab after 10 mins and the traveling time is not considered and during 
that 10min at 10th min he will be in next division, so be careful

find the division with highest probability that doctor is in it after 10 min is div 3 and probability is 0.7.

After 9 minutes dr has yet to move to another division he is in div 1 and probability is 1.0. Forty minutes later the division
with highest probabilty is 6 and probabilty is 0.77400

input 1 6 10 40 1 2 0.3 1 3 0.7 3 3 0.2 3 4 0.8 2 4 1 4 5 0.9 4 4 0.1 5 6 1.0 6 3 0.5 6 6 0.5

output  6

input 1 6 10 10 1 2 0.3 1 3 0.7 3 3 0.2 3 4 0.8 2 4 1 4 5 0.9 4 4 0.1 5 6 1.0 6 3 0.5 6 6 0.5

output  3 
*/


#include<iostream>
using namespace std;

int N,E,T,start;
float adj_mat[1000][1000];


void solution()
{
  cin>>N>>E>>T;
  for(int i=0;i<1000;i++)
      for(int j=0;j<1000;j++)
      {
          adj_mat[i][j]=0;

      }
   for(int i=0;i<E;i++)
   {
       int U,V;
       float probab;
       cin>>U>>V>>probab;
       adj_mat[U-1][V-1]=probab;

   }
   cin>>start;

   int num_traversal=T/10;
   int curr_node=start;

   while(num_traversal>0)
   {

       int next_node=-1;
       int max_probab=0;
       for(int i=0;i<N;i++)
       {
           if(adj_mat[curr_node][i]>max_probab)
           {

               max_probab=adj_mat[curr_node][i];
               next_node=i;
           }

       }
       if(next_node==-1)
       {
           cout<<"Exited the last lab"<<endl;
           return;

       }

       curr_node=next_node;
       num_traversal--;


   }


   cout<<"After"<<T<<" minutes,at node: "<<curr_node<<endl;

}

int main()
{  int t;
   cin>>t;
   while(t--)
   {
       solution();
   }

    return 0;

}


