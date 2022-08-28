#include<iostream>
#include<string>
using namespace std;
class binary{
	private:
	string s;
	public:
		void read(){
		cout<<"Enter a binary number ";
		cin>>s;			
		}
		void chk_binary(){
			for(int i=0; i<s.length(); i++)
			{
				if(s.at(i)!='1' && s.at(i)!='0')
				{
					cout<<"Incorrect binary format"<<endl;
					exit(0);
				}
			}
		}
		void ones_compliment(){
			for(int i=0; i<s.length(); i++)
			{
				if(s.at(i)=='0')
				{
					s.at(i)='1';
				} else
				{
					s.at(i)='0';
				}
			}
		}
		void display(){
			for(int i=0; i<s.length(); i++)
			{
				cout<<s.at(i);
			}
			cout<<endl;
		}
};

int main(){
	binary b;
	b.read();
	b.chk_binary();
	cout<<"Displaying your binary number before compliment"<<endl;
	b.display();
	b.ones_compliment();
	cout<<"Displaying your binary number after compliment"<<endl;
	b.display();
	
	return 0;
}
