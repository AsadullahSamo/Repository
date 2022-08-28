#include <iostream>
using namespace std;
int main(){

	
	float amount, result;
	float pound=1.487, franc=0.172, deutschemark=0.584, yen=0.00955;
	cout<<"Enter your amount\n";
	cin>>amount;
	
	result=amount*pound;
	cout<<"pound:"<<result<<"\n";
	
	result=amount*franc;
	cout<<"franc:"<<result<<"\n";
	
	result=amount*deutschemark;
	cout<<"deutschemark:"<<result<<"\n";
	
	result=amount*yen;
	cout<<"yen:"<<result<<"\n";
	
	return 0;
}
