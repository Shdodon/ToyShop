package View;

import Toy.Toys;

import java.util.List;

public class ViewConsole {
    public void ArrayPrint(List<Toys> toys){
        for (int i = 0; i < toys.size(); i++) {
            System.out.println(toys.get(i).getToyId());
        }
    }
}
