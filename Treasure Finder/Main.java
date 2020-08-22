#include<iostream>
using namespace std;
int gcd(int a, int b) 
{ 
    if (b == 0) 
        return a; 
    return gcd(b, a % b);  
      
} 
int main()
{
  int a, b,c,mid, hf;
  cin>>a>>b>>c;
 	if(a>b){
    	if(a<c){
        	mid =a;
        }
      	else{
        	if(b>c){
            	mid =b;
            }
         	else{
            	mid = c;
            }
        }
    }
  	else{
    	if(c<b){
        	mid =c;
        }
      	else {
        	if(a>b){
            	mid = a;
            }
          	else{
            	mid =b;
            }
        }
    }
  hf = gcd(a,b);
  hf= gcd(hf,c);
  cout<<"The treasure is in box which has number "<<mid<<endl;
  cout<<"The code to open the box is "<<hf;
}
