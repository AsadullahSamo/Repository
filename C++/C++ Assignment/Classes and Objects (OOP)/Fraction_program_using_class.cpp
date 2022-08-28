#include<iostream>
#include<cmath>
using namespace std;
class fraction{
	private:
		int num, den;
		char slash;
	public:
		fraction() : num(0), den(0) {} 
		void getfrac();	
		void operation(fraction, fraction, char);
		void result();
		void lowterms();
};

void fraction::getfrac()
{
	cin>>num>>slash>>den;
} // end of getfrac function
void fraction::operation(fraction f1, fraction f2, char op)
{
	switch(op){
	case '+':
		cout<<"Addition of two fractions is ";
		num=(f1.num*f2.den)+(f1.den*f2.num);
		den=f1.den*f2.den;
		break;
	case '-':
		cout<<"Subtraction of two fractions is ";
		num=(f1.num*f2.den)-(f1.den*f2.num);
		den=f1.den*f2.den;
		break;
	case '*':
		cout<<"Multiplication of two fractions is ";
		num=f1.num*f2.num;
		den=f1.den*f2.den;
		break;
	case '/':
		cout<<"Division of two fractions is ";
		num=f1.num*f2.den;
		den=f1.den*f2.num;
		break;
	}
} // end of operation function
void fraction::result()
{
	cout<<num<<"/"<<den<<endl;
} // end of showfrac function
void fraction::lowterms()
{
	long tnum, tden, temp, gcd;

	tnum = labs(num);         // labs function returns absolute value i.e. labs(num) = |num| = num
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
		if(tnum <tden) {	 // make sure numerator is always greater
			temp = tnum;	
			tnum = tden;
			tden = temp;	
		}
		tnum = tnum - tden;      // 6=6-4=2		
	}
	gcd = tden;		         // gcd=4
	num = num/gcd;		    // num=6/4=1
	den = den/gcd;		    // den=20/20=1
	cout <<num <<"/" <<den;
	cout <<endl;
} // end of lowterms function

int main(){

	fraction frac1, frac2, frac3;
	char optr;
	
	cout<<"Enter first fraction: ";	
	frac1.getfrac();
	cout<<"Enter second fraction: ";
	frac2.getfrac();
	cout<<"Enter operation to perform ";
	cin>>optr;
	frac3.operation(frac1, frac2, optr);
	frac3.result();
	cout<<"\nLowest terms of fraction is ";
	frac3.lowterms();
	
	return 0;
}
