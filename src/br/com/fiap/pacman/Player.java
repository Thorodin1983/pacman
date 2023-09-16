package br.com.fiap.pacman;

public class Player extends GameObject{

    private int life;
    private int direction;
    private int movimentacao = 10;

    private boolean invencible;

    public Player(){
    }


    public Player(int x, int y, int direction) {
        super(x, y);
        if (direction == 0 || direction == 90 || direction == 180 || direction == 270) {
            this.direction = direction;
        } else {
            System.out.println("erro de movimentação");
        }
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;

        if (direction == 0) {
            setY(getY()-movimentacao);
        } else if (direction == 90) {
            setX(getX()+movimentacao);
        } else if (direction == 180) {
            setY(getY()+movimentacao);
        } else if (direction == 270) {
            setX(getX()-movimentacao);
        }
    }

    public int getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(int movimentacao) {
        if(movimentacao == 0 || movimentacao == 90 || movimentacao == 180 || movimentacao == 270) {
            this.movimentacao = movimentacao;
        }
    }

    public boolean isInvencible() {
        return invencible;
    }

    public void setInvencible(boolean invencible) {
        this.invencible = invencible;
    }
}
