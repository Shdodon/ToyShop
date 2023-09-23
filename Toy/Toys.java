package Toy;

public class Toys implements  Comparable<Toys>{
    private Long toyId;
    private String name;
    private Integer frequency;
    private  Integer count = 0;

    public Toys(long toyId, String name, int frequency){
        this.toyId = toyId;
        this.name = name;
        this.frequency = frequency;
    }
    public long getToyId() {
        return toyId;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setToyId(long toyId) {
        this.toyId = toyId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount() {
        this.count += 1;
    }


    @Override
    public String toString() {
        return "Игрушка: " +
                "Id=" + toyId +
                " '" + name + '\'' +
                " шанс выпадения: " + frequency +
                "0% выпала: " + count + " раз(а)."
                ;
    }

    @Override
    public int compareTo(Toys o) {
        return this.toyId.compareTo(o.toyId);
    }
}

