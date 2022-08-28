#include<iostream>
using namespace std;
class Serial{
	private:
		static int s_no;
	public:
		string name;
		void setSno(){
			cout<<"Enter name of student ";
			cin>>name;
			s_no++;
		}
		int getSno(){
			cout<<"The serial number of "<<name<<" is "<<s_no<<endl;
		}
};
int Serial::s_no;	
int main(){
	Serial s1, s2, s3;
	
	s1.setSno();          
	s1.getSno();          cout<<endl;
	
	s2.setSno();          
	s2.getSno();          cout<<endl;
	
	s3.setSno();          
	s3.getSno();          cout<<endl;
	
	return 0;
}
