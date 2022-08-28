#include<iostream>
using namespace std;
int main(){
	// nested for loops is used for patterns and shapes
	// this first loop is for spaces and row and second is for columns
	// trick for shapes 
	
	// count rows in shape and write first loop
	// count max columns and write second loop
	// use endl for new lines where row ends
	int x, y, space;
	for(int x=1; x<=20; x++){
		for(int space=1; space<=(20-x); space++){
			cout<<" ";
		}
			for(int y=1; y<=(2*x)-1; y++){
				cout<<"*";
			}
		cout<<endl;
	}
	return 0;
}
