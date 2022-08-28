#include<iostream>                      //       *
using namespace std;                   //      * *
int main(){                           //     * * *
	                                //     * * * *
	int x, y;
	for(x=1; x<=5; x++){
		for(y=5; y>=1; y--){         // x=2, y=3
			if(y>x)                   // " "
			cout<<" ";
			else
			cout<<"*";
		}	
	cout<<endl;
	}
	
	int a, b;
	for(a=1; a<=5; a++){
		for(b=1; b<=5; b++){         // a=1, b=1
			if(b<=a)
			cout<<" ";
			else
			cout<<"*";
		}	
	cout<<endl;
	}
	return 0;
}
