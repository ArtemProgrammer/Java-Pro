package Lesson6;
public class Main {
    public static void main(String[] args) {
        SubscriberServiceImpl subscriberServiceImpl1 = new SubscriberServiceImpl();
        subscriberServiceImpl1.checkCityTalkTime(SubscriberArray.getSubscribers(), 200);
        subscriberServiceImpl1.checkLongDistanceCallTime(SubscriberArray.getSubscribers());
        subscriberServiceImpl1.checkInfoByLetter(SubscriberArray.getSubscribers(), 'D');
        System.out.println("Суммарный трафик: " +
                subscriberServiceImpl1.checkInternetTrafficCity(SubscriberArray.getSubscribers(), "Odessa"));
        System.out.println();
        System.out.println("Количество абонентов с отрицательным балансом: " +
                subscriberServiceImpl1.checkNegativeBalance(SubscriberArray.getSubscribers()));
    }
}
