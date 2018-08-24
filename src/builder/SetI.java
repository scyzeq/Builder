/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.Scanner;

/**
 *
 * @author AJuda
 */
public class SetI extends FullSet{
    
    public void addMonitor() {
        finishedProduct.setMonitor("Dell 20");
    }

    @Override
    public void addGraphicsCard(){
        finishedProduct.setGraphicsCard("Radeon");
    }

    public void addHardDrive() {
        finishedProduct.setHardDrive("HDD");
    }

    public void addMotherBoard() {
        finishedProduct.setMotherBoard("Gigabyte");
    }

    public void addProcessor() {
        finishedProduct.setProcessor("Intel i7");
    }

    public void addRam() {
        Scanner in = new Scanner(System.in);
        int x;
        
        while(true)
        {
            System.out.println("Choose your Ram: "
                    + "\n(1) 2 GB "
                    + "\n(2) 4 GB"
                    + "\n(3) 8 GB");
            x = in.nextInt();
            
            if(x == 1)
                finishedProduct.setRam("2 GB");
            else if (x == 2)
                finishedProduct.setRam("4 GB");
            else if (x == 3)
                finishedProduct.setRam("8 GB");
            else
                System.out.println("No such product with this ID choose again");
            
            if(x>0 && x<4)
                break;
        }
    }
    
    
}
