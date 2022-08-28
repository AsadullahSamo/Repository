#include<iostream>
using namespace std;
int fab(int i);
int main(){

    cout<<"Nth term: "<<fab(0)<<endl;
    cout<<"Nth term: "<<fab(1)<<endl;
    cout<<"Nth term: "<<fab(2)<<endl;
    cout<<"Nth term: "<<fab(3)<<endl;
    cout<<"Nth term: "<<fab(4)<<endl;
    cout<<"Nth term: "<<fab(5)<<endl;

    return 0;
}

int fab(int i){
    if(i==0){
        return 0;
    }
    else if(i==1){
        return 1;
    }
    else{
        return fab(i-1) + fab(i-2);
    }
}