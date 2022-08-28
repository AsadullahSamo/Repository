#include<iostream>
using namespace std;
int main(){
	
	int count=0;
	char ch1, ch2, alphabets;
	cout<<"Enter first character:";
	cin>>ch1;
	cout<<"Enter second character:";
	cin>>ch2;
	
	cout<<"Characters between "<<ch1<<" and "<<ch2<<" are:";
	for(alphabets=++ch1; alphabets<ch2; alphabets++){
		cout<<alphabets;
		count++;
}
	cout<<endl;
	cout<<"The number of characters between"<<" "<<ch1<<" and "<<ch2<<" is "<<count;
	return 0;
}
