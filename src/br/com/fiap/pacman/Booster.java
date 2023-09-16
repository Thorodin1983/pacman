package br.com.fiap.pacman;

public class Booster extends Item{

    private int rounds;
    public Booster(int x, int y, boolean isVisible) {
        super(x, y, isVisible);
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
}
