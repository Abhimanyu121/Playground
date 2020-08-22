#include<iostream>

void pft(int n, int start) { 
 for (int j = start; j<=n; j++){
   int sum = 0;
    for (int i=1;i<j;i++) {
        if (j%i==0) {
            sum+=i;
        }
    }
   if(sum==j){
   	std::cout<<sum<<" ";
   }
 }

} 
int main(){
	int n1,st;
  	std::cin>>st>>n1;
  	pft(n1,st);
 
}