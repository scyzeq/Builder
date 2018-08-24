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
public abstract class FullSet {
    
    protected FinishedProduct finishedProduct;
    
    public void newSet()
    {
        finishedProduct = new FinishedProduct();
    }
    
    public FinishedProduct getSet()
    {
        return finishedProduct;
    }
            
    public abstract void addMonitor();
    public abstract void addGraphicsCard();
    public abstract void addHardDrive();
    public abstract void addMotherBoard();
    public abstract void addProcessor();
    public abstract void addRam();
    
}
