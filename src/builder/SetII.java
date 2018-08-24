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
public class SetII extends FullSet{
    
    
    @Override
    public void addMonitor()
    {
        finishedProduct.setMonitor("LG 30");
    }
    
    @Override
    public void addProcessor()
    {
        Scanner in = new Scanner(System.in);
        int x;
        
        
        
        while(true)
        {
            System.out.println("Choose your processor: " 
                + "\n(1) Intel i5"
                + "\n(2) Intel i7"
                + "\n(3) Specialy ordered AMD");
            
            x = in.nextInt();
            
            if(x == 1)
                finishedProduct.setProcessor("Intel i7");
            else if (x == 2)
                finishedProduct.setProcessor("Intel i5");
            else if (x == 3)
                finishedProduct.setProcessor("AMD");
            else
                System.out.println("No such product with this ID choose again");
                    
            if(x>0 && x<4)
                break;
        }
    }
    
    @Override
     public void addGraphicsCard()
     {
         Scanner in = new Scanner(System.in);
         int x;
         
         
         System.out.println("Do you want wariant with graphics card or without:"
            + "\n(1) Yes"
            + "\n(0) No");
         x = in.nextInt();
         if(x == 1)
             finishedProduct.setGraphicsCard("GTX");
         else
             finishedProduct.setGraphicsCard("Integrated graphics");
     }
     
    @Override
     public void addHardDrive()
     {
        Scanner in = new Scanner(System.in);
        int x;
         
         
        System.out.println("Do you want wariant with HHD or SSD: "
            + "\n(1) HDD"
            + "\n(0) SSD");
        x = in.nextInt();
         if(x == 1)
             finishedProduct.setHardDrive("HDD");
         else
             finishedProduct.setHardDrive("SSD");
     }
     
    @Override
     public void addMotherBoard()
     {
         finishedProduct.setMotherBoard("Gigabyte");
     }
     
    @Override
     public void addRam()
     {
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
