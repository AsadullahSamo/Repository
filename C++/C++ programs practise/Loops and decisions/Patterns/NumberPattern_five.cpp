#include<iostream>
using namespace std;
int main(){
	
	int x,y, num=1;
	for(x=1; x<=5; x++){
		for(y=1; y<=x; y++){
			cout<<num;
			num++;
		}
		cout<<endl;
	}
	
	
	cout<<endl<<endl<<endl;
	
	int a,b, rows, numb=1;
	cout<<"Enter number of rows:";
	cin>>rows;
	for(a=1; a<=rows; a++){
		for(b=1; b<=a; b++){
			cout<<numb;
			numb++;
		}
		cout<<endl;
	}
	return 0;
}
