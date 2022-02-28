package com.lutador;

public class Ufc {

    public static void main(String[] args) {
    Lutador l[] = new Lutador[6];
    l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f,
            68.9f, 11, 2, 1);
    l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f,
            57.8f, 14, 2, 3);
    l[2] = new Lutador("Aclecio", "Argentina", 25, 1.48f,
                95.8f, 17, 0, 5);
    l[3] = new Lutador("Pedro", "Irlanda", 19, 1.98f,
                135.45f, 4, 2, 3);
    l[4] = new Lutador("Joao", "Grecia", 39, 1.70f,
                80f, 15, 5, 5);
    l[5] = new Lutador("Mateus", "Japao", 23, 1.61f,
                72.5f, 8, 2, 4);


    Luta UEC01 = new Luta();
    UEC01.marcarLuta(l[0], l[0] );
    UEC01.lutar();

    Luta UEC02 = new Luta();
    UEC02.marcarLuta(l[1], l[5]);
    UEC02.lutar();

    l[0].status();
    l[1].status();

    }
}
