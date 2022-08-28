#include<iostream>
#include<stdlib.h>
using std::cout;
using std::cin;
using std::endl;
int *display();
int main(){
	
		int i, *ptr1;
		ptr1 = display();
		cout<<"Values are\n";
		for(i=0; i<3; i++){
			cout<<*(ptr1+i)<<endl;
		}
		free(ptr1);
		ptr1 = NULL;
			
		return 0;
}      

int *display(){
	int *ptr, i;
	ptr = (int*)malloc(3*sizeof(int));
	if(ptr==NULL){
    	cout<<"Memory not available!";
    	exit(1);
	}
	
	cout<<"Enter the values: ";
	for(i=0; i<3; i++){
		cin>>*(ptr+i);
	}    // end of for loop
	return ptr;
}
