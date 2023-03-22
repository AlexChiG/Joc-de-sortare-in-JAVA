package Meniuri;

public class Main {

    public static void main(String args[]) {
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Start single_instance = Start.Singleton();
                 single_instance.setVisible(true);
            }
        });
    }
    

}
