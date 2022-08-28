#include<iostream>
using namespace std;
int main(){
	int x, y, space;
	for(int x=1; x<=5; x++){
		for(int space=1; space<=(5-x); space++){
			cout<<" ";
		}
			for(int y=1; y<=(2*x)-1; y++){
				cout<<"*";
			}
		cout<<endl;
	}
	return 0;
}
