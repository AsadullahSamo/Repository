#include<iostream>
#include<conio.h>
using namespace std;
class Square{
	private:
		int num;
	public:
		void setNum(int n){
			num=n;
			}
		void chkCond(){
			cout<<"Press space bar to display its square"<<endl;
			if(getch()==' ')
			{
  				cout<<getNum();
				cout<<endl;
			}
			else
			{
				cout<<"You did not pressed space so its End of program\n";
			}
		}
		int getNum(){
			return num*num;
		}
};

int main(){
	Square number;
	
	int numb;
	cout<<"Enter a number: ";
	cin>>numb;
	number.setNum(numb);
	number.chkCond();
	
	return 0;
}
