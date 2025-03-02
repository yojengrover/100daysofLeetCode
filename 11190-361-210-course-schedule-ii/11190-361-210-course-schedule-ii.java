class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List <List<Integer>> ad = new ArrayList<>();
        int[] inDir = new int[numCourses];
        int count = 0;

        for(int i = 0; i < numCourses; i++){
            ad.add(new ArrayList<>());
        }

        for(int[] prerequisite: prerequisites ){
            int course = prerequisite[0];
            int pre = prerequisite[1];
            ad.get(pre).add(course);
            inDir[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(inDir[i] == 0){
                queue.offer(i);
            }
        }
        int[] ans = new int[numCourses];
        while(!queue.isEmpty()){
            int cur = queue.poll();
            ans[count] = cur;
            count++;
            for(int nei : ad.get(cur)){
                inDir[nei]--;
                if(inDir[nei] == 0){
                queue.offer(nei);
                }
            }
        }

        if(count == numCourses){
            return ans;
        }
        int[] emp = new int[0];
        return emp;
    }
}