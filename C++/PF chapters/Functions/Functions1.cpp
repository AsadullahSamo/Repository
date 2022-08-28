#include<iostream>
using namespace std;
void repchar(char, int);   // function declaration
int main(){
	
	repchar('-', 50);  // function call
	cout<<"Data type    Space\n";
	cout<<"int          4bytes\n";
	cout<<"long         4bytes\n";
	cout<<"double       8bytes\n";
	repchar('=', 25);  // function call
	cout<<"char         2bytes\n";
	cout<<"bool         1byte\n";
	repchar('*', 40);  // function call
	
	return 0;
}

// function definition
void repchar(char ch, int n){ // function declarator
	for(int j=0; j<n; j++){   
		cout<<ch;
	}
	cout<<endl;
}
