#include<iostream>
using namespace std;
class YTChannel{
	private:	
		string name;
		int subCount;
	public:
		YTChannel(string n, int s): name(n), subCount(s)
				{cout<<"String";}
		
};
int main(){
	 YTChannel y1("WWE", 5000);
	cout<<y1;  // will give error cause << can't be used on user-deined
	//data type without . operator but we'll make it work by overloading it
	
	
	return 0;
}
