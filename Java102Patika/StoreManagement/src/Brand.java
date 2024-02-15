public class Brand implements Comparable<Brand>{
    private String name;
    public Brand(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public int compareTo(Brand o) {
        return this.name.compareTo(o.name);
    }
    @Override
    public String toString() {
        return name;
    }
}
