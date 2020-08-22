#include<iostream>
int main()
{
	int num, temp, count=0;
  	std::cin>>num;
  if(num==0){
  	std::cout<<1;
    return 0;
  }
  	while(num!=0){
    	num = num/10;
      	count++;
    }
  std::cout<<count;
}