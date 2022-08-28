#include<iostream>
using namespace std;
int main(){
	int x, y, rows;
	cout<<"Enter number of rows ";        cin>>rows;
	
	for(x=1; x<=rows; x++){
		for(y=1; y<=rows; y++){			
			if(x==1 || x==rows || y==rows || y==1 || x==y || y==(rows-x+1))
				cout<<"*";
			 else 
				cout<<" ";
			
	} // end of inner for
		cout<<endl;
	} // end of outer for
	return 0;
}
