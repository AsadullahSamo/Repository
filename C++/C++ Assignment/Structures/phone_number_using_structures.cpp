#include<iostream>
using namespace std;
struct phone{
	int area_code;
	int exchange;
	int number;
};

int main(){
	
	phone my_phone={212, 767, 8900};
	phone your_phone;
	cout<<"Enter your area code, exchange, and number: ";
	cin>>your_phone.area_code;
	cin>>your_phone.exchange;
	cin>>your_phone.number;
	
	cout<<"My number is ("<<my_phone.area_code<<") "<<my_phone.exchange<<"-"<<my_phone.number<<endl;
	cout<<"Your number is ("<<your_phone.area_code<<") "<<your_phone.exchange<<"-"<<your_phone.number<<endl;
	return 0;
}
