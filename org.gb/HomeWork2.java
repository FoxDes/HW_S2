class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        if (newColor != image[sr][sc])
            fill(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }

    public void fill(int[][] newImage, int sr, int sc, int newColor, int oldColor) {

        if (sr < 0 || sc < 0 || sr >= newImage.length || sc >= newImage[0].length || newImage[sr][sc] != oldColor)
            return;

        if (newImage[sr][sc] == oldColor) {
            newImage[sr][sc] = newColor;
        }
        fill(newImage, sr, sc + 1, newColor, oldColor);
        fill(newImage, sr, sc - 1, newColor, oldColor);
        fill(newImage, sr + 1, sc, newColor, oldColor);
        fill(newImage, sr - 1, sc, newColor, oldColor);
    }
}
