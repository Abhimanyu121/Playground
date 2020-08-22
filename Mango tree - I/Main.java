#include<iostream>
using namespace std;
int main()
{
  int row, col, count;
  cin>>row>>col>>count;
  bool flag= false;
  if(count<col){
  	flag =true;
  }
  if(count%row==1){
  	flag = true;
  }
  if(count == col){
  	flag = true;
  }
  if(flag)
	cout<<"Yes";
  else
    cout<<"No";
}