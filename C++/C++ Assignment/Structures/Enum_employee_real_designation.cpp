#include<iostream>
#include<conio.h>
using namespace std;
int main(){
	
	string ch;
	enum etype{laborer, secretary, manager, accountant, executive, researcher};
	etype x;
	
	cout<<"Enter employee type (first letter only)";
	cout<<" laborer, secretary, manager, accountant, executive, researcher): ";
	
	switch(getche()){        // switch statement to input 
		case 'l':
		x=laborer;
		break;
		case 's':
		x=secretary;
		break;
		case 'm':
		x=manager;
		break;
		case 'a':
		x=accountant;
		break;
		case 'e':
		x=executive;
		break;
		case 'r':
		x=researcher;
		break;
	}
	switch(x){               // switch statement for output
		case 0:
		ch="laborer";
		break;
		case 1:
		ch="secretary";
		break;
		case 2:
		ch="manager";
		break;
		case 3:
		ch="accountant";
		break;
		case 4:
		ch="executive";
		break;
		case 5:
		ch="researcher";
		break;
	}
	cout<<"\nEmployee type is "<<ch<<endl;
	return 0;
}
