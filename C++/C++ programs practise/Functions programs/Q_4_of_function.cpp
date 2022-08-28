#include<iostream>
using namespace std;
int func(){
	static int num=16;
	return num--;
}
int main(){
	
	for(func(); func(); func())
		{
		cout<<func()<<" ";	
		}
	return 0;
}
