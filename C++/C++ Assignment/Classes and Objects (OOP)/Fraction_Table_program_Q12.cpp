#include<iostream>
#include<cmath>
#include<iomanip>
using namespace std;
class fraction{
	private:
		int num, den;
	public:
		fraction (int n, int d) : num(n), den(d) {} ;
		void setData(int n, int d)
		{
			num=n;
			den=d;
		}    // end of setData
		void mulfrac(fraction, fraction);
		void lowTerms();
		void display()
		{
			cout<<num<<"/"<<den;	
		}    // end of display
		void displayN()
		{
			cout<<setw(7)<<num<<"/"<<den;
		}  // end of displayN function
};        // end of class 

void fraction::mulfrac(fraction f1, fraction f2)
{
	num=f1.num*f2.num;
	den=f1.den*f2.den;
}     // end of mulfrac function
void fraction::lowTerms() {	
	long tnum, tden, temp, gcd;

	tnum = labs(num);	
	tden = labs(den);	

	if(tden == 0) {	
		cout <<"Illegal fraction: division by 0";
		exit(1);
	} else if (tnum == 0) {		
		num = 0; 
		den = 1;
		return;
	}
	
	while(tnum != 0) {
		if(tnum <tden) {	
			temp = tnum;	
			tnum = tden;
			tden = temp;	
		}
		tnum = tnum - tden;		
	}
	gcd = tden;		
	num = num/gcd;		
	den = den/gcd;
} // end of lowTerms function

int main(){
	
	fraction f(0, 0),  f1(0, 0), f2(0, 0);
	int x;
	char ch;
	
	do{
		cout<<"Enter a number: ";       
		cin>>x;         // x=3
		cout<<"   ";
		
		for(int i=1; i<x; i++)
		{
			f.setData(i, x);        // (2, 3)
			f.lowTerms();         // for simplifying fraction   
			f.display();          //           1/3  2/3
			cout<<"  ";         
		}
		for(int j=1; j<x; j++)    // 
		{
			cout<<endl;           
			f.setData(j, x);      // x=3
			f.lowTerms();        // for simplifying fraction
			f.displayN();        //  1/3 
			cout<<"    ";       // 2/3
			for(int k=1; k<x; k++)
			{
				f1.setData(k, x);        // k=1 x=3
				f2.setData(j, x);       //  j=1 x=3
				f.mulfrac(f1, f2);     //   
				f.lowTerms();         //     1/3*1/3=1/9   2/9
				f.display();        //  1/9   2/9
				cout<<"    ";         // 2/9   4/9
			}
		}
	cout<<"\nPress y to continue or n to exit ";
	cin>>ch;	
	} while(ch!='n');        //end of do while
	
	return 0;
}     // end of main
