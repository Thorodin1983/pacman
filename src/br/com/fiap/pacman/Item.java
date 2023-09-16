package br.com.fiap.pacman;

public class Item extends GameObject{
    private boolean isVisible;


    public Item(boolean isVisible) {
        this.isVisible = isVisible;
    }

    public Item(int x, int y, boolean isVisible) {
        super(x, y);
        this.isVisible = isVisible;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }
}
