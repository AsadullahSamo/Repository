#include<iostream>
using namespace std;
int main(){
	
	int num, i, sum, product;
	char ch;
	 
	while(ch!='q')
	{
		cout<<"Enter a number: ";
		cin>>num;
		cout<<"Press q to quit or any key to continue: ";
		cin>>ch;
		sum+=num;
		product*=num;
	}
	cout<<"Sum is: "<<sum<<endl;
	cout<<"Product is: "<<product<<endl;
	return 0;
}

