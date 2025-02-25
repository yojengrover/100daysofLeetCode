class Solution {
    public int lastStoneWeight(int[] s) {
        if (s.length <= 0){
            return 0;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone: s){
            pq.add(stone);
        }
        //System.out.println("s ="+ pq.size());
            while(pq.size()>1){
               
                int h = pq.remove();
                int l = pq.remove();
                //System.out.println("h"+h+"- l ="+ (h-l));
                if(h>l){
                  pq.add(h-l);
                }
               
            }
            if(pq.size() == 1){
                return pq.remove();
            }
            return 0;
        
        
    }
}