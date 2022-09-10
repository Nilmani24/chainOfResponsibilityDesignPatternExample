package com.company;
// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
       int arr[][] = new int[][]{
               {1, 1, 1},
               {1, 1, 0},
               {1, 0, 1},
               {1, 1, 2 }
       };
       Solution solution = new Solution();
        solution.floodFill(arr,0,0,2);
    }

}
// } Driver Code Ends

class Pair{
    int x;
    int y;
    Pair(int x,int y){
        this.x = x;
        this.y = y;
    }
}
class Solution
{
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        int curr = image[sr][sc];
        helper(image,sr,sc,curr,newColor);
        return image;

    }
    public void helper(int[][] image, int sr, int sc,int curr, int newColor){

        Queue<Pair> queue = new LinkedList<Pair>();
        queue.add(new Pair(sr,sc));
        if(isValid(image,sr,sc,curr,newColor)){
            image[sr][sc] = newColor;
        }

        while(!queue.isEmpty()){
            Pair pair = queue.remove();

            if(isValid(image,pair.x+1,pair.y,curr,newColor)&&  image[pair.x+1][pair.y] == curr ){
                image[pair.x+1][pair.y] = newColor;
                queue.add(new Pair(pair.x+1,pair.y));

            }
            if(isValid(image,pair.x-1,pair.y,curr,newColor) &&  image[pair.x-1][pair.y] == curr ){
                image[pair.x-1][pair.y] = newColor;
                queue.add(new Pair(pair.x-1,pair.y));

            }
            if(isValid(image,pair.x,pair.y+1,curr,newColor) &&  image[pair.x][pair.y+1] == curr  ){
                image[pair.x][pair.y+1] = newColor;
                queue.add(new Pair(pair.x,pair.y+1));

            }
            if(isValid(image,pair.x,pair.y-1,curr,newColor) &&  image[pair.x][pair.y-1] == curr ){
                image[pair.x][pair.y-1] = newColor;
                queue.add(new Pair(pair.x,pair.y-1));

            }

        }
    }

    public boolean isValid(int [][] image,int i,int j,int curr,int newColor){
        if(i< 0 || i >= image.length || j<0 || j >= image[0].length
            || image[i][j] == newColor )
            return false;
        return true;

    }
}