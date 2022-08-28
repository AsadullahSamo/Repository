#include<iostream>
using namespace std;
static const int LIMIT=50;
class safearray{
	private:
		int a[LIMIT];	
	public:
void putel(int ind, int v){
	if(0<=ind || ind<=LIMIT-1 )
	{
		a[ind]=v;
	}
	else
	{
		cout<<"Index is out of bounds\n";
		exit(0);
	}
}// end of function putel
int getel(int ind){
	int temp;
	if(0<=ind || ind<=LIMIT-1 )
	{
		 temp=a[ind];
		cout<<"Array element"<<ind<<"is equal to "<<temp<<endl;
	}
	else
	{
		cout<<"Index is out of bounds\n";
		exit(0);
	}
} // end of function getel
};
int main(){
	safearray arr;
	char chc, ch;
	cout<<"Enter 'a' to enter an array element and 'b' to enter index ";
	cin>>chc;
	
	do{
	switch(chc)
	{
	case 'a':
		int i, v;
		cout<<"Enter the array index and value ";
		cin>>i>>v;
		arr.putel(i, v);
		break;
	case 'b':
		int j, temp;
		cout<<"Enter the array index ";
		cin>>j;
		temp=arr.getel(j);
		default:
		cout<<"Invalid input";
	} // end of switch
	cout<<"Do another (y/n)? ";
	cin>>ch;
} while(ch!='n'); // end of do while
		
	return 0;
}

