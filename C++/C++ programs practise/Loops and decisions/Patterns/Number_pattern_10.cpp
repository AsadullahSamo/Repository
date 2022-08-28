#include<iostream>
using namespace std;
int main(){                              
	    int i, j, count=0, count1=0, k=0;                       
	for(i=1; i<=5; i++)               // i=2   
	{                               
	 for(j=1; j<=5-i; j++)           // j=1
	  {
	  	cout<<"  ";                  //  "      " 
	  	count++;                  // count=3
	  }
		while(k!=2*i-1)           //i=2
		{
			if(count<=4)
			{
				cout<<i+k<<" ";         //   2 3 2 
				count++;              //   count=5
			}
			else
			{
				count1++;
				cout<<i+k-2*count1<<" ";
			}
			k++;                       // 1
		}     
		count1=count=k=0;                 //  
		cout<<endl;
	}                                                
	return 0;
}
