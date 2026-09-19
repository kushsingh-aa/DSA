class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int x=Math.max(x1,Math.min(x2,xCenter));
        int y=Math.max(y1,Math.min(y2,yCenter));

        int dist_x=xCenter-x;
        int dist_y=yCenter-y;

        return (dist_x*dist_x)+(dist_y*dist_y)<=(radius*radius);
    }
}