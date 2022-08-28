#include<iostream>
using namespace std;
int main(){
	int x, y, rows;
	cout<<"Enter number of rows ";    cin>>rows;
	for(x=1; x<=rows; x++){
		for(y=1; y<=rows-x; y++){
			cout<<" ";
		}
		for(y=1; y<=rows; y++){			
			cout<<"*";
		}
		cout<<endl;
	} // end of outer for
	
	
	
	
	
	int a, b, row, columns;
	cout<<"Enter number of rows ";    cin>>row;
	cout<<"Enter number of columns ";    cin>>columns;
	
	for(a=1; a<=row; a++){
		for(b=1; b<=row-a; b++){
			cout<<" ";
		}
		for(b=1; b<=columns; b++){			
			cout<<"*";
		}
		cout<<endl;
	} // end of outer for
	return 0;
}
