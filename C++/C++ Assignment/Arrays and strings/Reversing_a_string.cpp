#include<iostream>
#include<cstring>
using namespace std;
const int size=50;
void reversit(char []);

int main(){
	
	char str[size];
	cout<<"Enter a string ";
	cin.get(str, size);
	
	reversit(str);
	cout<<"Reverse string is ";
	cout<<str<<endl;
	
	
	return 0;
}

void reversit(char s[])
{
	// string is Able was I ere
	int len=strlen(s);  // len=14     // strlen to find length of a string
	for(int i=0; i<len/2; i++)       // i=0  i<7
	{
		// int a=5, b=7;
		// like int temp=a          // temp=5
		     //  a=b               //   a=7
		     // b=temp            // b=5
		char temp=s[i];            // temp=s[0]
		s[i]=s[len-i-1];          // s[0]=s[13]        or e=A
		s[len-i-1]=temp;         // s[13]=s[0]         // A=e
	}
}
