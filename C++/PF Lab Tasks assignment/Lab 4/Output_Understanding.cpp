#include<iostream>
using namespace std;
int main(){
		
		int i = 3;
		i++;
		cout<<i;   	// "4"
		++i;                     
		cout<<i;   	// "5"
		cout<<++i;  	// "6"        because i first increases then prints value 
		cout<<i++;  	// "6"			and here value is first print then increased 
		cout<<i;   	// "7"    }			at this line
}
