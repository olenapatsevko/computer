package proxy;

import computer.entity.Laptop;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LaptopProxy {
    private final Laptop laptop;
    private final Logger logger = Logger.getLogger(Laptop.class.getName());

    public LaptopProxy(Laptop laptop) {
        this.laptop = laptop;
    }

    public void increment() {
        logger.info("entered increment method");
        laptop.increment();
        logger.info("increasing screen value to"+ laptop.getScreen());
    }
}
