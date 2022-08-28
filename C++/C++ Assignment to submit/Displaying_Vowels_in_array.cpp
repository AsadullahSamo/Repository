#include<iostream>
using namespace std;
int main(){
	
	char chars[]={"abcdefghijklmnopqrstuvwxyz"};
	char vowels[]={};
	cout<<"In start array vowels is empty"<<endl;
	int i, j;
	cout<<"After loop array vowels has {";
	for(i=0; i<26; i++)
	{
		if(chars[i]=='a' || chars[i]=='e' || chars[i]=='i' || chars[i]=='o' || chars[i]=='u')
		{
		vowels[i]=chars[i];
		cout<<vowels[i];
		}
	}
	cout<<"} elements\n";
	
	return 0;
}
