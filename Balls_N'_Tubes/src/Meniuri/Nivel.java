package Meniuri;

import javax.swing.JFrame;

public class Nivel extends JFrame {

    private static Nivel Nivel_inst = null;

    public static Nivel Singleton() {
        if (Nivel_inst == null) {
            Nivel_inst = new Nivel();
        }
        return Nivel_inst;
    }
}
