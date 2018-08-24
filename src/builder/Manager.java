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
public class Manager {
    private FullSet fullSet;

    public void assemble()
    {
        fullSet.newSet();
        fullSet.addGraphicsCard();
        fullSet.addHardDrive();
        fullSet.addMonitor();
        fullSet.addMotherBoard();
        fullSet.addProcessor();
        fullSet.addRam();
    }

    public FinishedProduct getProduct()
    {
        return fullSet.getSet();
    }    
    
    public void setFullSet(FullSet fullSet) {
        this.fullSet = fullSet;
    }
}
