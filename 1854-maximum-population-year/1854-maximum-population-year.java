class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] lives = new int[101];

        for(int i=0;i<logs.length;i++){
            int birth = logs[i][0]-1950;
            int death = logs[i][1]-1950;
            lives[birth]++;
            lives[death]--;
        }
        for(int i=1;i<lives.length;i++){
            lives[i]=lives[i-1]+lives[i];
        }

        int year=0;
        int max=0;
        for(int i=0;i<lives.length;i++){
            if(max<lives[i]){
                max = lives[i];
                year=i;
            }
        }
        return year+1950;
    }
}