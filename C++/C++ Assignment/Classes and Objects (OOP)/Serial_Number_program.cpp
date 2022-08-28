#include<iostream>
using namespace std;
class serial{
	private:
		int serial_no;
		static int count;
	public:
		serial() 
		{
			count++;       
			serial_no=count;     
		} 				    // end of constructor with no args
		void display() const
		{
			cout<<"I am object number "<<serial_no<<endl;
		}  				// end of display function
};   				   // end of class serial
int serial::count=0;  // initializing count

int main(){
	
	serial s1, s2, s3;          // calling constructors
	s1.display();              // displaying message 
	s2.display();
	s3.display();
	
	return 0;
}
