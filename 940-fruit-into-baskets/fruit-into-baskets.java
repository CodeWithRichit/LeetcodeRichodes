import java.util.ArrayList;
class Solution {
    public int totalFruit(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0,j=0,m=0;
        while(j<nums.length){
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            if(map.size()>2){
              int t=j-i;
              m=Math.max(m,t);
              while(i<=j && map.size()>2){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
               }
            }
            j++;
        }
        int t=j-i;
        m=Math.max(m,t);
        return m;



        //wrong ans
        // int ct=0,max=Integer.MIN_VALUE,i=0,j=0;
        // ArrayList<Integer> arr=new ArrayList<>();
        // while(j<nums.length){
        //     if(arr.size()<2 && arr.indexOf(nums[j])==-1){
        //         arr.add(nums[j]);
        //         ct++;
        //     }
        //     else if(arr.size()==2 && arr.indexOf(nums[j])==-1){
        //         arr.remove(0);
        //         arr.add(nums[j]);
        //         ct++;
        //     }
        //     if(ct>2){
        //         if(j-i+1>max){
        //             max=j-i+1;
        //         }
        //         i++;
        //         ct--;
        //     }
        //     j++;
        // }
        // if(j==nums.length){
        //   if(j-i+1>max){
        //     max=j-i+1;
        //   }
        // }
        // return max;
    }
}