package Service;

import Toy.Toys;
import ToysComparator.ToyComparator;
import View.ViewConsole;
import Writer.WriteFile;


import java.util.*;

public class ToysService {
    private Queue<Toys> toyQueue = new PriorityQueue<>();
    public Queue<Toys> getAllToys(){
        return toyQueue;
    }
    public void create(long toyId, String name, int frequency){
        Toys toys = new Toys(toyId, name, frequency);
        toyQueue.add(toys);
    }

    public void getToysWithProbability(Queue<Toys> toyQueue){
        WriteFile writeFile = new WriteFile();
        Random rand = new Random();
        int sum = 0;
        for (Toys q: toyQueue) {
            int r = rand.nextInt(1,11);
            sum += q.getFrequency();
            if (sum >= r){
                sum = 0;
                q.setCount();
               writeFile.FileWriter("Игрушка с Id: " + q.getToyId() + " ВЫПАЛА!");
                System.out.println("Игрушка с Id: " + q.getToyId() + " ВЫПАЛА!");
            }
            else {
                sum = 0;
                writeFile.FileWriter("Игрушка с Id: " + q.getToyId() + " не выпала!");
                System.out.println("Игрушка с Id: " + q.getToyId() + " не выпала!");
            }
        }
        writeFile.FileWriter("");
    }
    public List<Toys> getSortedByToysId(){
        List<Toys> toys = new ArrayList<>(getAllToys());
        toys.sort(new ToyComparator<Toys>());
        return toys;
    }
    public void printToys(List<Toys> toys){
        ViewConsole console = new ViewConsole();
        console.ArrayPrint(toys);
    }
}
