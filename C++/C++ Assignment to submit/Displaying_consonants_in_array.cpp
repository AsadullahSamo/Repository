#include<iostream>
using namespace std;
int main(){
	
	char chars[]={"abcdefghijklmnopqrstuvwxyz"};
	char arrconsonants[]={};
	cout<<"In start array consonants is empty"<<endl;
	int i, j;
	cout<<"After loop array consonants has {";
	for(i=0; i<26; i++)
	{
		if(chars[i]=='a' || chars[i]=='e' || chars[i]=='i' || chars[i]=='o' || chars[i]=='u')
		{
			continue;
		}
		else
		{
			arrconsonants[i]=chars[i];
			cout<<arrconsonants[i];
		}
	}
	cout<<"} elements\n";
	
	return 0;
}

