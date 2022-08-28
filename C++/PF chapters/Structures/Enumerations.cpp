#include<iostream>
using namespace std;
#include<conio.h>

int main(){
	enum itsaWord{NO, YES};
	itsaWord isWord=NO;
	
	char ch='a';
	int wordcount=0;
	cout<<"Enter a phrase ";
	do{
		ch=getche();
		if(ch==' ' || ch=='\r'){
		if(isWord==YES){
			wordcount++;
			isWord=NO;
		}
	}
	else if(isWord==NO)
		isWord=YES;
	} while(ch!='\r');
	cout<<"\nWords="<<wordcount<<endl;
	
	return 0;
}
