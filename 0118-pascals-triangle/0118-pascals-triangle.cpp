class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        
        vector<vector<int>> list;
        
        pascal(list,numRows);
        
        return list;
    }
    
public : 
    vector<int> pascal(vector<vector<int>>& list,int n){
        
        if(n == 1){
            list.push_back({1});
            return {1};  
        } 
        else{
            vector<int> line = {1};
            vector<int> prev = pascal(list,n-1);
            
            for(int i = 0;i<prev.size()-1;i++){
                line.push_back(prev[i] + prev[i+1]);
            }
            
            line.push_back(1);
            list.push_back(line);
            return line;
        }
    }
};