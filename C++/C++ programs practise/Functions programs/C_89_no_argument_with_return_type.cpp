#include<iostream>
using namespace std;  
int sum(void);   
int main(){                    // Syntax is:
	int s;					// void function name(no argument);  declaration
	s=sum();							//function name();  definition
	cout<<"Sum is "<<s<<endl;          // void function name(){     body
	                        //	statement;
	                        //	statement;
	                        //	no return statement;
							//  } */
return 0;						
}

int sum(){
	int a, b;
	cout<<"Enter first number ";    cin>>a;
	cout<<"Enter second number ";    cin>>b;
	int sum=a+b;
	return sum;
}
