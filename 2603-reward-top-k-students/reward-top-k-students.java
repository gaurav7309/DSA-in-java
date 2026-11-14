class Solution {
    public static class pair{
        int student_id;
        int ranking ;
        pair(int student_id,int ranking){
            this.student_id = student_id;
            this.ranking = ranking;
        }
    }
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
     var pq = new PriorityQueue<pair>((a,b) ->{
        if(b.ranking==a.ranking){
        return Integer.compare(a.student_id,b.student_id);
        }
     return Integer.compare(b.ranking,a.ranking);

     });

     HashSet<String> positive = new HashSet();
     HashSet<String> negative = new HashSet();
    for(String temp : positive_feedback) {
    positive.add(temp);
    }
    for(String temp : negative_feedback) {
    negative.add(temp);
    }

     
     for(int i = 0;i<report.length;i++){
        String check = report[i];
        String[] traverse = check.split(" ");
        
        // for the positive feedback
         
         int score = 0;  //for the checking if the student has the more than onw time report positive ans the negative feedbck


//         for(String pos : positive_feedback){
            for(String trav: traverse){
             if(positive.contains(trav)){
             score+=3;
             }
             else if(negative.contains(trav)){
             score-=1;
             }
            }
           
      //  }
        // if the positive not the student report then check for the negative feedback

        // for(String neg : negative_feedback){
        //     for(String trav: traverse){
        //      if(neg.equals(trav)){
        //      score-=1;
        //      }
        //     }
           
        // }
         pq.add(new pair(student_id[i],score));
     }

      List<Integer>  ans = new ArrayList<>();

     while(k-->0){
     pair temp = pq.remove();
     ans.add(temp.student_id);
     }
      return ans;
    }
}