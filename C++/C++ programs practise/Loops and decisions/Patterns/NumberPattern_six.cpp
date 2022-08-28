#include<iostream>
using namespace std;              //            1        space=4 number=1
 int main(){                     //            21
 	int x, y;                    //           321
 	                                  //     4321
 	for(x=1; x<=5; x++){	 // for rows
 		for(y=5; y>=1; y--)  // for *
		{     
	 	if((y<=x))             // x=1, y=1                             
	 		cout<<y;
		  else 
		 cout<<" ";	
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
	 
