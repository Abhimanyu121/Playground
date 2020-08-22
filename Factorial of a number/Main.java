#include<iostream>
int main(){
  int num, fact=1;
  std::cin>>num;
  for(int i = num;i>=1; i-- ){
    fact = fact*i;
  }
  std::cout<<fact;
}