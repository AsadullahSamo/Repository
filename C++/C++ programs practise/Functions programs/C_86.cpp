#include<iostream>
using namespace std;
void sum(int, int);       // values in declaration and definition is parameters
int main(){
	int a=7;  int b=5;
	sum(a,b);     // values in call are called arguments
	
	return 0;
}

void sum(int a, int b){
	int sum;
	sum=a+b;
	cout<<sum;
}
