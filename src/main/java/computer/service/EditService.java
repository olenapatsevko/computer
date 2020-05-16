package computer.service;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class EditService {
    private static EditService instance;



    public static EditService getInstance(){
        if (instance == null){
            instance = new EditService();
        }
        return instance;
    }


    }
