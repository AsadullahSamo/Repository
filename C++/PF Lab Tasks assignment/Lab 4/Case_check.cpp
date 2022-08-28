#include<iostream>
using namespace std;
int main(){

	char ch;
	cout<<"Enter a character:";
	cin>>ch;
	
	if(ch>='a' && ch<='z'){
		cout<<"Lowercase";
	} else if(ch>='A' && ch<='Z'){
		cout<<"Uppercase";
	} else {
		cout<<"Invalid character";
	}
	return 0;
}
