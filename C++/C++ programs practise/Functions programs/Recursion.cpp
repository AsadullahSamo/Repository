#include<iostream>
using namespace std;
int display(int i);
int main(){

    display(1);

}

int display(int i){
    if(i<=10){
    cout<<"Hello\n";
    display(i+1);
    }
    else {
    return 1;
    }
}