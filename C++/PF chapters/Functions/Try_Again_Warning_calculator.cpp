#include<iostream>
using namespace std;
void calculator();
int main(){

	calculator();
	return 0;
}

void calculator(){
	int count;
	for(count=0; count>=0; count++){
	int num1=10, num2=5;
	char op;
	cout<<"Enter a operator ";
	cin>>op;
	if(op=='+'){
		cout<<"Sum is "<<num1+num2<<endl;
	} else if(op=='%'){
		cout<<"Remainder is "<<num1%num2<<endl;
	} else if(op=='-'){
		cout<<"Difference is "<<num1-num2<<endl;
	} else if(op=='*'){
		cout<<"Multiplication is "<<num1*num2<<endl;
	} else if(op=='/'){
		cout<<"Division is "<<num1/num2<<endl;
	} else {
		if(count>=3){
			cout<<"Invalid operator";
			exit(0);
		}
		cout<<"Try Again"<<endl;
	} // end of if else
  } // end of for
} // end of function
