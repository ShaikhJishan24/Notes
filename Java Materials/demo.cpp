#include<iostream>
using namespace std;

class abc{

    public:
    int a= 10;
};

int main(){

    abc obj;
    abc *ptr = &obj;
    // cout << obj.a ;
    cout << (*ptr).a ;
    cout << ptr->a ;
}