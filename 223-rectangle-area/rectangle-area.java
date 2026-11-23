class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
       // finding the rectangle area of the first rectangle
       int  len_rec_x = ax2  - ax1;
       int len_rec_y = ay2  - ay1;
       int rec_area1 =  len_rec_x*len_rec_y;
       // then fins out eh area of the second rectange;
       int  len_rec_x1 = bx2  - bx1;
       int len_rec_y2 = by2  - by1;
       int rec_area2 =  len_rec_x1*len_rec_y2;
       // then fidn out the area of the rectengale thea are the common between the both are the rectangles
       int comm_rec_ax2 = Math.min(ax2,bx2);
       int comm_rec_by2 = Math.min(ay2,by2);
       int comm_rec_ax1 = Math.max(ax1,bx1);
       int comm_rec_by1 = Math.max(ay1,by1);
       // then calculate the area of the overlappong area
       int commom_area_x_axis = Math.max(0,comm_rec_ax2 - comm_rec_ax1);
       int commom_area_y_axis = Math.max(0,comm_rec_by2 - comm_rec_by1);
       int common_area = commom_area_x_axis*commom_area_y_axis;
       // then calculare the area od the full rectangel  
       int ans = rec_area1+rec_area2-common_area;
       return ans;
    }
}