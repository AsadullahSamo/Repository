#include<iostream>
#include<conio.h>
using namespace std;

class toolBooth{
	private:
		unsigned int cars, cars1;
		double money;
	public:
		toolBooth() : cars(0), money(0.0) {};
	void payingcar()  
	{
		cars++;
		money+=0.50;
	}
	void nopaycar()  
	{
		cars1++;
	}
	void display() const 
	{
		cout<<"\nPaying Cars are "<<cars<<" and the money collected is "<<money<<endl;
		cout<<"Nonpaying cars are "<<cars1<<endl;
	}
};

int main(){
	toolBooth car1;
	char ch;
	cout<<"Enter 'p' to count a paying car and \'n to count a non paying car with money\n and e to exit the program "<<endl;
	
	do{
		cin>>ch;
	if(ch=='p'){
		car1.payingcar();
	}
	if(ch=='n'){
		car1.nopaycar();
	}
} while(ch!='e'); //end of do while
	 car1.display();
	 cout<<endl;
	
	return 0;
}
