#include<iostream>
#include<iomanip>
using namespace std;
int main(){
	
	cout<<"Vowels \t Consonants \n";
	
	char alphabets;
	for(alphabets='A'; alphabets<='Z'; alphabets++){
		if(alphabets=='A' || alphabets=='E' || alphabets=='I' || alphabets=='O' || alphabets=='U'){
			cout<<alphabets;
		} else {
			cout<<"\t"<<alphabets<<endl;
		} // end if else
	} // end for
	return 0;
} // end main
