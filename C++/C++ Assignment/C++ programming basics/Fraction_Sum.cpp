#include <iostream>
#include<iomanip>
using namespace std;
int main(){
	
	char fraction;
	int a, b, c, d, sum1, sum2;
	
	cout<<"Enter first fraction\n";
	cin>>a>>fraction>>b;
	cout<<"Enter second fraction\n";
	cin>>c>>fraction>>d;
	sum1=(a*d)+(b*c);
	sum2=b*d;
	
	cout<<"The sum of first and second fraction is:"<<sum1<<"/"<<sum2<<endl;
	
	return 0;
}
