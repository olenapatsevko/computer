package computer.service;

import computer.entity.Laptop;
import computer.view.View;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateService {
   private View view;

   public Laptop create(){
       return new Laptop(view.inputString("name"),
               view.inputInt("processorFrequency"),
               view.inputInt("quantityOfKernel"),
               view.inputInt("computerDataStorage"),
               view.inputInt("computerMemory"),
               view.inputDouble("screen"),
               view.inputDouble("weight"),
               view.inputDouble("battery"));
   }
}
