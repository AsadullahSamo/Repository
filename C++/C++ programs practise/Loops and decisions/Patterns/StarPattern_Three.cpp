#include<iostream>
using namespace std;
 int main(){
 	int x, y;
 	
 	for(x=1; x<=5; x++){	 // for rows
 		for(y=1; y<=5; y++)  // for *
		{     
	 	if((x+y)<=5)
	 		cout<<" ";
		  else 
		 cout<<"*";	
		}
	 cout<<endl;
}	 
	cout<<endl<<endl<<endl;
	
	
	int a, b, rows;
	cout<<"Enter number of rows:";
	cin>>rows;
	for(a=1; a<=rows; a++){
		for(b=1; b<=rows; b++){
		if((a+b)<=rows)
		cout<<" ";
		else 
		cout<<"*";
		}
		cout<<endl;
	}
		return 0;
	 }
	 
