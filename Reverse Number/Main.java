#include <iostream>
int main() 
{
	int num, rev=0 ; 
  	std::cin>>num;
  	while(num!=0){
    	rev=(rev*10)+ (num%10);
      	num = num/10;
    }
  	std::cout<<rev;
	return 0;
}