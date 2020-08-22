#include<iostream>
using namespace std;
int main()
{
  string str;
  int num;
  cin>>str>>num;
  if(str=="front"){
  	if(num==1){
    	cout<<"Left Handed";
    }
    else{
    	cout<<"Right Handed";
    }
  }
  else{
  	if(num!=1){
    	cout<<"Left Handed";
    }
    else{
    	cout<<"Right Handed";
    }
  }
}