#include<iostream>
using namespace std;
int main(){
	
	int x, y, rows;
	cout<<"Enter number of rows:";
	cin>>rows;
	for(x=1; x<=rows; x++){
		for(y=1; y<=x; y++){
			cout<<"*";
		}	
	cout<<endl;
	}
	
	int a, b;
		for(a=rows-1; a>=1; a--){
			for(b=1; b<=a; b++){
				cout<<"*";
			}
			cout<<endl;
		}
	return 0;
}
