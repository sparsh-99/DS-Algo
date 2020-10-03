// Largest Sum Contiguous Subarray 
// Time Complexity: O(n)
#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int max_sum(vector<int> s){

    int ans = s[0], larger = s[0];
    for(int i = 1; i < s.size(); i++){
        larger = max(s[i], larger + s[i]);
        ans = max(larger, ans);
    }
    return ans;
}


int main(){
    cin.tie(NULL);
    cin.tie(NULL);
    ios::sync_with_stdio(0);
    
    vector<int> a;
    a.push_back(2);
    a.push_back(-3);
    a.push_back(2);
    a.push_back(-1);
    a.push_back(2);
    a.push_back(4);

    cout << max_sum(a) << endl;
    
    return 0;
}
