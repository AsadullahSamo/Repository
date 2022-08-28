#include<iostream>
using namespace std;
int main(){
	
	int x, space, y;
	for(x=1; x<=5; x++){         // outer loop for rows always
		for(space=1; space<=(5-x); space++){
			cout<<" ";
		}
		for(y=1; y<=(2*x)-1; y++){
			cout<<"*";
		}
		cout<<endl;
	}
	
	
	cout<<endl<<endl<<endl;
	
	int a, b, rows, gaps;
	cout<<"Enter number of rows:";
	cin>>rows;
	for(a=1; a<=rows; a++){
		for(gaps=1; gaps<=(rows-a); gaps++){
			cout<<" ";
		}
		for(b=1; b<=(2*a)-1; b++){
			cout<<"*";
		}
		cout<<endl;
	}
	return 0;
}
