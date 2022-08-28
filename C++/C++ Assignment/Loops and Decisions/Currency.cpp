#include<iostream>
using namespace std;
int main(){
	
	char ch;
	do{
		char temp;
		int pounds1, shilings1, pence1, pounds2, shilings2, pence2;
		cout<<"Enter first amount: \x9c";
		cin>>pounds1>>temp>>shilings1>>temp>>pence1;
		cout<<"Enter second amount: \x9c";
		cin>>pounds2>>temp>>shilings2>>temp>>pence2;
		
		pounds1+=pounds2;
		shilings1+=shilings2;
		pence1+=pence2;
		
		if(pence1>11){
			shilings1+=(pence1/12);
			pence1=pence1%12;
			
		} else if(shilings1>19){
			pounds1+=(shilings1/20);
			shilings1=shilings1%20;
		}
		
		cout<<"Total is \x9c:"<<pounds1<<"."<<shilings1<<"."<<pence1<<endl;
		cout<<"Do you want to continue (y/n) ?:";
		cin>>ch;
		
	} while(ch=='y');
	cout<<endl;
	return 0;
}
