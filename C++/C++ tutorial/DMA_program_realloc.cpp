#include<iostream>
#include<stdlib.h>
using std::cout;
using std::cin;
using std::endl;
int main(){
	
	int *ptr, i, n /*, n2*/;
	cout<<"Enter the number of values: ";
	cin>>n;
	ptr = (int*)calloc(n, sizeof(int));
	if(ptr==NULL){
    	cout<<"Memory not available!";
    	exit(1);
	}
	
	for(i=0; i<n; i++){
		cin>>*(ptr+i);
	}    // end of for loop
		// updating the size of memory
		cout<<"Enter the updated value of n: ";
		cin>>n;
		int *ptr1 = (int*)realloc(ptr, n*sizeof(int));
		if(ptr==NULL){
    	cout<<"Memory not available!";
    	exit(1);
		}
//		if(n2<n)
//			goto Destination;
//		// Enter updated values
//		for(i=n; i<n2; i++){
//		cin>>*(ptr1+i);
//		}
		
//		Destination:
		cout<<"Previous address: "<<ptr<<endl;
		cout<<"New address: "<<ptr1<<endl;
		// Now printing values
		for(i=0; i<n; i++){
			cout<<*(ptr1+i)<<endl;
		}
		free(ptr1);
		
		return 0;
}      
