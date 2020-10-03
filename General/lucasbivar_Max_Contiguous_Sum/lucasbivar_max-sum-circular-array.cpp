// Largest Sum Contiguous Subarray in Circular Array
// Time Complexity: O(n)
#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;


int max_sum_circular_array(vector<int> v){
    int sum = 0;
    for(int i = 0; i < v.size(); i++){
        sum += v[i];
    }

    int local_min = v[0], global_min = v[0], local_max = v[0], global_max = v[0];

    for(int i = 1; i < v.size(); i++){
        //max subarray sum
        local_max = max(v[i], local_max+v[i]);
        global_max = max(local_max, global_max);

        //min subarray sum
        local_min = min(v[i], v[i]+local_min);
        global_min = min(local_min, global_min);
    }

    if(global_min == sum){ //if all values from array are negative
        return global_max;
    }
    return max(global_max, sum - global_min);
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
 
    cout << max_sum_circular_array(a) << endl;
    
    return 0;
}
