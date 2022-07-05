#include<string>
#include<iostream>
using namespace std;

int main(){

    string temp;
    while(cin>>temp){
        if(temp.size()>7){
            if(temp.substr(0,7)=="http://"){
                cout<<temp<<endl;
            }
        }
    }

}