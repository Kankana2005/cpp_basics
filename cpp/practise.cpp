#include<bits/stdc++.h>
using namespace std;
int count_digits(int n){
    // int cnt = 0;
    // 1.method
    // while(n>0){
    //     int lastdidgit = n%10;
    //     cnt = cnt+1;
    //     n = n/10;

    // 2.mathod
    int cnt = int(log10(n)+1);
    return cnt;
    }
int reverse_digits(int n){
    int rev = 0;
    while(n>0){
        int lastdigit = n%10;        
        n=n/10;
        rev = (rev*10)+lastdigit;

    }
    return rev;
}    
void palindrome(int n){
    int p = 0;
    int temp = n;
    while(n>0){
        int lastdigit = n%10;        
        n=n/10;
        p = (p*10)+lastdigit;
}
if (p==temp){
    cout<<"true";
}
else{
    cout<<"false";
}
}

void armstrong_no(int n){
    int dup = n;
    int sum = 0;
    int digits = int(log10(n) + 1); 
    while(n>0){
        int ld = n%10;
        sum += pow(ld,digits);
        n = n/10;
    }
    if(dup == sum){
        cout<<"Its an Armstrong No.";
    }
    else{
        cout<<"Its not an armstrong Number";
    }
}

void print_all_divisors(int n){
    for(int i=1;i<=n;i++){
        if(n%i==0){
            cout<<i<<endl;
        }

    }
}
int main(){
int n;
cout<<"Enter the number to count the digits"<<endl;
cin>>n;
// cout<<count_digits(n);
// cout<<reverse_digits(n);
// palindrome(n);
// armstrong_no(n);
print_all_divisors(n);
return 0;
}

