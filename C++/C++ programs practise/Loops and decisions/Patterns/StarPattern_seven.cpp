#include<iostream>
using namespace std;
int main(){
	
	int x, space, y, rows;
	cout<<"Enter rows:";
	cin>>rows;
	for(x=1; x<=rows; x++){         // outer loop for rows always
		for(space=1; space<=(rows-x); space++){
			cout<<" ";
		}
		for(y=1; y<=(2*x)-1; y++){
			cout<<"*";
		}
		cout<<endl;
	}
	
	int a, b, gaps;
	for(a=rows-1; a>=1; a--){
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
