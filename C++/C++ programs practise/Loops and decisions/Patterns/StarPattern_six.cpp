#include<iostream>
using namespace std;
int main(){
	
	int x, y, space;
	for(x=7; x>=1; x--){
		for(space=1; space<=(7-x); space++){
			cout<<" ";
		}
		for(y=1; y<=(2*x)-1; y++){
			cout<<"*";
		}
		cout<<endl;
	}
	
	
	cout<<endl<<endl<<endl;
	
	int a,rows, gaps, b;
	cout<<"Enter number of rows:";
	cin>>rows;
	for(a=rows; a>=1; a--){
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
