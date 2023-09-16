package br.com.fiap.pacman;

import java.util.Random;

public class Ghost extends GameObject{

//    criar random

private int movimentacao = 10;
    private int direction;
    public Ghost() {
    }

    public void moviment() {

        int[] direcoes = {0, 90, 180, 270};

        Random random = new Random();

        int indexRandom = random.nextInt(4);

        int numeroAleatorio = direcoes[indexRandom];


        if (numeroAleatorio == 0) {
            setY(getY()-movimentacao);
        } else if (numeroAleatorio == 90) {
            setX(getX()+movimentacao);
        } else if (numeroAleatorio == 180) {
            setY(getY()+movimentacao);
        } else if (numeroAleatorio == 270) {
            setX(getX()-movimentacao);
        }

    }

    public Ghost(int x, int y, float movimentacao) {
        super(x, y);
        if (direction == 0 || direction == 90 || direction == 180 || direction == 270) {
            this.direction = direction;
        } else {
            System.out.println("erro de movimentação");
        }
    }
}
