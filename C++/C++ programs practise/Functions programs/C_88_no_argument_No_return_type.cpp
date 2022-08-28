#include<iostream>
using namespace std;  
void sum(void);   
int main(){                    // Syntax is:
							// void function name(no argument);  declaration
	sum();							//function name();  definition
	                        // void function name(){     body
	                        //	statement;
	                        //	statement;
	                        //	no return statement;
							//  } */
return 0;						
}

void sum(){
	int a=5, b=7;
	int sum=a+b;
	cout<<"sum is:"<<sum;
}
