#include<iostream>
using namespace std;
int main(){
	
	int count=0;
	char alphabets;
	for(alphabets='a'; alphabets<='z'; alphabets++){
		
		if(count%10==0){
			cout<<"\n";
		}
		cout<<(int)alphabets<<" ";
		count++;
	}
	
	return 0;
}
