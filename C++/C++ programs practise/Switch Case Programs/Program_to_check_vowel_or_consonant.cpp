#include<iostream>
using namespace std;
int main(){
	
	char ch;
	cout<<"Enter alphabet: "<<endl;
	cin>>ch;
	
	switch(ch){
		case 'a':		cout<<ch<<" is vowel\n";     break;
		case 'e':		cout<<ch<<" is vowel\n";     break;
		case 'i':		cout<<ch<<" is vowel\n";     break;
		case 'o':		cout<<ch<<" is vowel\n";     break;
		case 'u':		cout<<ch<<" is vowel\n";     break;
		case 'A':		cout<<ch<<" is vowel\n";     break;
		case 'E':		cout<<ch<<" is vowel\n";     break;
		case 'I':		cout<<ch<<" is vowel\n";     break;
		case 'O':		cout<<ch<<" is vowel\n";     break;
		case 'U':		cout<<ch<<" is vowel\n";     break;
		default:        cout<<ch<<" is Consonant\n";
	}
	
	return 0;
}
