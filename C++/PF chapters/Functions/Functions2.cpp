#include<iostream>
using namespace std;
void repchar(char, int);   // function declaration
void repchar2(char, int);
int main(){
	char ch;
	int n;
	
	cout<<"Enter character to enter:";     cin>>ch;
	cout<<"Enter number of times to enter:";     cin>>n;
	
	repchar(ch, n);  // function call
	cout<<"Data type    Space\n";
	cout<<"int          4bytes\n";
	cout<<"long         4bytes\n";
	cout<<"double       8bytes\n";
	
	char ch2;
	int n2;
	cout<<"Enter character to enter:";     cin>>ch2;
	cout<<"Enter number of times to enter:";     cin>>n2;
	
	repchar(ch2, n2);  // function call
	cout<<"char         2bytes\n";
	cout<<"bool         1byte\n";
	repchar(ch, n);  // function call
	
	return 0;
}

// function definition
void repchar(char ch, int n){ // function declarator
	for(int j=0; j<n; j++){   
		cout<<ch;
	}
	cout<<endl;
}

void repcha2(char ch2, int n2){ // function declarator
	for(int j=0; j<n2; j++){   
		cout<<ch2;
	}
	cout<<endl;
}
