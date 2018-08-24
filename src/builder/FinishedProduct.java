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
public class FinishedProduct 
{
    private String monitor;
    private String processor;
    private String graphicsCard;
    private String ram;
    private String hardDrive;
    private String motherBoard;
    
    public void show()
    {
        if(monitor!=null) System.out.println("Monitor = " + monitor);
        if(processor!=null) System.out.println("Processor = " + processor);
        if(graphicsCard!=null) System.out.println("Grphics Card = " + graphicsCard);
        if(ram!=null) System.out.println("RAM = " + ram);
        if(hardDrive!=null) System.out.println("Hard Drive = " + hardDrive);
        if(motherBoard!=null) System.out.println("Mother Board = " + motherBoard);
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }
}
