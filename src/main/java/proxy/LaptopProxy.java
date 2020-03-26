package proxy;

import computer.entity.Laptop;

import java.util.logging.Logger;

public class LaptopProxy extends  Laptop {

    private static final Logger LOGGER = Logger.getLogger(LaptopProxy.class.getName());
    protected LaptopProxy(Builder builder){
    super(builder);
}


    @Override
    public void increment() {
        LOGGER.info("entered increment method");
       super.increment();
        LOGGER.info("increasing screen value to"+ super.getScreen());
    }

    @Override
    public String toString() {
        LOGGER.info("to string method");
        return super.toString();
    }

    @Override
    public double getScreen() {
        LOGGER.info("getting screen");
        return super.getScreen();
    }

    @Override
    public double getWeight() {
        LOGGER.info("get weight method ");
        return super.getWeight();
    }

    @Override
    public double getBattery() {
        return super.getBattery();
    }

    @Override
    public void setScreen(double screen) {
        super.setScreen(screen);
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    @Override
    public void setBattery(double battery) {
        super.setBattery(battery);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    protected boolean canEqual(Object other) {
        return super.canEqual(other);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getProcessorFrequency() {
        return super.getProcessorFrequency();
    }

    @Override
    public int getQuantityOfKernel() {
        return super.getQuantityOfKernel();
    }

    @Override
    public int getComputerDataStorage() {
        return super.getComputerDataStorage();
    }

    @Override
    public int getComputerMemory() {
        return super.getComputerMemory();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setProcessorFrequency(int processorFrequency) {
        super.setProcessorFrequency(processorFrequency);
    }

    @Override
    public void setQuantityOfKernel(int quantityOfKernel) {
        super.setQuantityOfKernel(quantityOfKernel);
    }

    @Override
    public void setComputerDataStorage(int computerDataStorage) {
        super.setComputerDataStorage(computerDataStorage);
    }

    @Override
    public void setComputerMemory(int computerMemory) {
        super.setComputerMemory(computerMemory);
    }


}
