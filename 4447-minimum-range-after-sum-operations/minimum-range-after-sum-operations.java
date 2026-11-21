class Solution {
    public int minRange(int a, int b, int c) {
        int af_val = a;
        int bf_val = b;
        int cf_val  = c;
        int min = Integer.MAX_VALUE;
        // first find out the min range  of the wihtiout chsnging thr ele
        int for_max  =  Math.max(a,Math.max(b,c));
        int for_min = Math.min(a,Math.min(b,c));
        min = Math.min(for_max-for_min,min);
        
//         int af_min = 0;
//         int af_val = 0;
//         // then after the chnaging the inimum valut theh ifnd out the min then return the min value\
//         // ifnd out the whihc i ne has the min = a,b,c
//         if(for_min==a){
//         // af_val = a;
//         a = b+c;
//         min = Math.max(a,Math.max(b,c))-Math.min(a,Math.min(b,c));
//         }
//     else if(for_min==b){
//     // af_val = b;
//     b = a+c;
//       min = Math.max(a,Math.max(b,c))-Math.min(a,Math.min(b,c));
//     }
// else{
//     // af_val = c;
//     c = a+b;
//       min = Math.max(a,Math.max(b,c))-Math.min(a,Math.min(b,c));
// }
//      // then chnage the value of th emiun to become th e max then fin dout mimn value\
//      /// then altimateky rety7urn the min value thw t are th min lkout ht ehtnw,
// return min;

        // the new logic id saying that of we have to first finsd 09out the for the a converting teh a to the b+C

        a = bf_val+cf_val;
        for_max  =  Math.max(a,Math.max(bf_val,cf_val));
        for_min = Math.min(a,Math.min(bf_val,cf_val));
        min = Math.min(for_max-for_min,min);
        // a = af_val;
        
        // the n we have t checking for th  b value then we have to move forthuerr the of rht ec
    
         b = af_val+cf_val;
        for_max  =  Math.max(af_val,Math.max(b,cf_val));
        for_min = Math.min(af_val,Math.min(b,cf_val));
        min = Math.min(for_max-for_min,min);
        // b = bf_val;
        // then altimately cheiking of rht e c then we have ot ginf out trh ,in  va;ur
       
         c = bf_val+af_val;
        for_max  =  Math.max(af_val,Math.max(bf_val,c));
        for_min = Math.min(af_val,Math.min(bf_val,c));
        min = Math.min(for_max-for_min,min);
        c = cf_val;
        return min;
    }
}