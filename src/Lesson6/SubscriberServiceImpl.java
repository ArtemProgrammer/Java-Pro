package Lesson6;

public class SubscriberServiceImpl implements SubscriberService {
    //Сведения об абонентах, у которых время внутригородских разговоров превышает заданное:
    @Override
    public void checkCityTalkTime(Subscriber[] subscribers, int cityTalkTime) {
        System.out.println("Вывод абонентов, у которых время внутригородских разговоров превышает " + cityTalkTime + ":");
        for (Subscriber s : subscribers) {
            if (s.getCityTalkTime() > cityTalkTime) {
                System.out.println(s.toString());
            }
        }
        System.out.println();
    }

    //Сведения об абонентах, которые пользовались междугородной связью:
    @Override
    public void checkLongDistanceCallTime(Subscriber[] subscribers) {
        System.out.println("Вывод абонентов, которые пользовались междугородной связью:");
        for (Subscriber s : subscribers) {
            if (s.getLongDistanceCallTime() > 0) {
                System.out.println(s.toString());
            }
        }
        System.out.println();
    }
    //Сведения об абонентах по фамиллии на указанную букву:
    @Override
    public void checkInfoByLetter(Subscriber[] subscribers, char letter) {
        System.out.println("Вывод абонентов, фамиллия которых начинается на букву " + letter + ":");
        for (Subscriber s : subscribers) {
            char[] arrLastName = s.getLastName().toCharArray();
            if (arrLastName[0] == letter) {
                System.out.println("Last name: " + s.getLastName().toString() + ". First name: " +
                        s.getFirstName().toString() + ". Patronymic: " + s.getPatronymic().toString() +
                        ". Number of phone: " + s.getNumberPhone().toString() + ". Balance: " + s.getBalance());
            }
        }
        System.out.println();
    }
    //Суммарное потребление трафика города:
    @Override
    public int checkInternetTrafficCity(Subscriber[] subscribers, String city) {
        System.out.println("Вывод суммарного трафика города " + city + ":");
        int sumTraffic = 0;
        for (Subscriber s : subscribers) {
            if (s.getCity().equals(city)) {
                sumTraffic += s.getInternetTraffic();
            }
        }
        return sumTraffic;
    }
    //Вывод абонентов с негативным балансом:
    @Override
    public int checkNegativeBalance(Subscriber[] subscribers) {
        System.out.println("Вывод абонентов с негативным балансом: ");
        int counter = 0;
        for (Subscriber s : subscribers) {
            if (s.getBalance() < 0) {
                ++counter;
            }
        }
        return counter;
    }
}
