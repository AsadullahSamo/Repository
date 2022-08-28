#include<iostream>
#include<conio.h>
using namespace std;
int main(){
	int chcount=0;
	int wdcount=1;
	char ch='a';
	
	cout<<"Enter a phrase: ";
	ch=getche();
	while(ch!='\r'){
		ch=getche();
		if(ch==' '){
			wdcount++;
		} else {
			chcount++;
		}
	}
	cout<<"\nWords="<<wdcount<<endl;
	cout<<"Letters="<<chcount<<endl;
	return 0;
}
