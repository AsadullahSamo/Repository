#include<iostream>
using namespace std;
int count=0;
void calling();

int main(){
	count++;
	calling();
	calling();
	calling();
	cout<<"The main program count value is "<<count<<endl;
	
	return 0;
}

void calling(){
	static int a=0;
	a++;
	cout<<"I have been called "<<a<<" times"<<endl;
	
}
