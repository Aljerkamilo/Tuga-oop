public class Layout {
    private char[][] area;
    private char icon;
    private int maxX = 0;
    public int getMaxX() {
        return maxX;
    }

    private int maxY = 0;

    public int getMaxY() {
        return maxY;
    }

    public char[][] getArea() {
        return area;
    }

    public Layout(int maxX, int maxY, char icon) {
        this.maxX = maxX;
        this.maxY = maxY;
        this.icon = icon;
        area = new char[maxX][maxY];
        for(int i = 0; i < maxX; i++) {
            for(int j = 0; j < maxY; j++) {
                area[i][j] =this.icon;
            }
        }
    }

    
}

