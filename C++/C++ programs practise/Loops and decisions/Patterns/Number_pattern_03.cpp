#include<iostream>
using namespace std;                        //  5 5 5 5 5 
int main(){                                //   4 4 4 4
	int rows, cols;                       //    3 3 3
	for(rows=5; rows>=0; rows--)
	{
		for(cols=1; cols<=rows; cols++)
		{
			
			cout<<rows;
		}
	cout<<endl;
	}


	return 0;
}
