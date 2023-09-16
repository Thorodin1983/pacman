package br.com.fiap.pacman;

public class GameObject {
    private int x;
    private int y;
    private int screenSize;



    public GameObject() {
    }

    public GameObject(int x, int y) {
        if((x >= 0) && (y >= 0)) {
            this.x = x;
            this.y = y;
        }

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x >= 0) {
            this.x = x;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y >= 0) {
            this.y = y;
        }

    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
