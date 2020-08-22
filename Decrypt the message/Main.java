#include<iostream>

bool div(int n) 
{  int sum =0;
    for (int i=1;i<n;i++) 
        if (n%i==0) 
            sum +=i;

	return sum==n;
} 
int main(){
	int n1, n2;
  	std::cin>>n1>>n2;
  	bool status = div(n1+n2);
  if(status)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
}