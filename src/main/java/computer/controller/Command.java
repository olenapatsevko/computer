package computer.controller;

import computer.entity.Laptop;

import java.util.List;

public interface Command {

     void execute(List<Laptop> laptops);
}
