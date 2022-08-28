#include<iostream>
using namespace std;
double power(double num, int p=2);    // p has default value 2
char power(char num, int p=2);
int power(int num, int p=2);
long power(long num, int p=2);
float power(float num, int p=2);

int main(){
	char separate, ch;
	double d;
	int i, p=2;        // default power is 2
	float f; 
	long l;
	
	cout<<"Enter a double type number in (n^p) format to get its power ";
	cin>>d>>separate>>p;
	cout<<"The power is "<<power(d, p)<<endl;      
	
	cout<<"Enter a char type number in (n^p) format to get its power ";
	cin>>ch>>separate>>p;
	cout<<"The power is "<<power(ch, p)<<endl;      
	
	cout<<"Enter an int type number in (n^p) format to get its power ";
	cin>>i>>separate>>p;
	cout<<"The power is "<<power(i, p)<<endl;      
	
	cout<<"Enter a float type number in (n^p) format to get its power ";
	cin>>f>>separate>>p;
	cout<<"The power is "<<power(f, p)<<endl;      
	
	cout<<"Enter a long type number in (n^p) format to get its power ";
	cin>>l>>separate>>p;
	cout<<"The power is "<<power(l, p)<<endl;      
	
	return 0;
}

double power(double num, int p){     
	double result=1.0;
	for(int i=0; i<p; i++)
	{
		result=result*num;
	}
	return result;     
}

char power(char ch, int p){
	char result='a';     
	for(int i=0; i<p; i++)
	{
		result=result*ch;
	}
	return result;      
}

int power(int j, int p){
	int result=1;     
	for(int i=0; i<p; i++)      
	{
		result=result*j;
	}
	return result;     
}

float power(float f, int p){
	float result=1.0;     
	for(int i=0; i<p; i++)
	{
		result=result*f;
	}
	return result;     
}

long power(long l, int p){
	long result=1;     
	for(int i=0; i<p; i++)      
	{
		result=result*l;        
	}
	return result;     
}
