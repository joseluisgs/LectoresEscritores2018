/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectoresescritores;

/**
 *
 * @author link
 */
public class LectoresEscritores {
    private static RecursoEL RW = new RecursoEL();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int veces = 7;
        Lector l1= new Lector(1,veces, RW);
        l1.start();
        Lector l2= new Lector(2,veces, RW);
        l2.start();
        Escritor e1= new Escritor(1,veces, RW);
        e1.start();
        Escritor e2= new Escritor(1,veces, RW);
        e2.start();
    }
    
}
