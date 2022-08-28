#include<iostream>                      //       *******
using namespace std;                   //        ******
int main(){                           //         *****
	                                //           ****
	int x, y;
	for(x=1; x<=7; x++){
		for(y=7; y>=1; y--){         // x=1, y=1
			if(y>=x)
			cout<<"*";
			else
			cout<<" ";
		}	
	cout<<endl;
	}
	
	return 0;
}
