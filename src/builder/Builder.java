/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author AJuda
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Manager manager = new Manager();
        
        FullSet fullSetI = new SetI();
        FullSet fullSetII = new SetII();
        
        manager.setFullSet(fullSetI);
        manager.assemble();
        FinishedProduct setI = manager.getProduct();
        
        System.out.println("\n\n");
        manager.setFullSet(fullSetII);
        manager.assemble();
        FinishedProduct setII = manager.getProduct();
        
        
        System.out.println("\nBasic set:");
        setI.show();
        
        System.out.println("\nAdvanced choosen set");
        setII.show();
        
        
    }
    
}
