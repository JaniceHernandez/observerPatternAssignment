public class Publisher {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        Subscriber subscriber1 = new Subscriber("1st Person");
        Subscriber subscriber2 = new Subscriber("2nd Person");
        Subscriber subscriber3 = new Subscriber("3rd Person");
        Subscriber subscriber4 = new Subscriber("4th Person");

        newsAgency.registerSubscriber(subscriber1);
        newsAgency.registerSubscriber(subscriber2);
        newsAgency.registerSubscriber(subscriber3);
        newsAgency.registerSubscriber(subscriber4);

        newsAgency.setNews("An Earthquake hits northern region!");

        newsAgency.removeSubscriber(subscriber2);

        newsAgency.setNews("Election is coming up!");
    }
}
