public class Subscriber implements SubscriberObserver {

    private String name;

    public Subscriber(String name) {
        this.name = name;   
    }

    public String getName() {
        return name;
    }   

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news update.");
    }
}
