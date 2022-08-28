#include<iostream>
using namespace std;
class date{
	private:
		int months, days, years;
		char ch;
	public:
		void getDate()
		{
			cout<<"Enter date in mm/dd/yy format: ";
			cin>>months>>days>>years;
		}
		void showDate()
		{
			cout<<"You entered "<<months<<"/"<<days<<"/"<<years<<endl;
		}
};

int main(){
	date d1;
	d1.getDate();
	d1.showDate();

	return 0;
}
