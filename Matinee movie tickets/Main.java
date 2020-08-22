#include<iostream>
using namespace std;
int main()
{

  double  time, age;
  cin>>age>>time;
  if(time==13.30){
  	if(age>13){
    	cout<<"$5.00";
    }
    else{
    	cout<<"$2.00";
    }
  }
  else{
  	if(age>13){
    	cout<<"$8.00";
    }
    else{
    	cout<<"$4.00";
    }
  }
  //Type your code here.
}