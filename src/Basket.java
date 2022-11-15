import java.util.Map;
//работа с корзиной вынесена в отдельный класс по принципу единственной ответственности
public class Basket {
    protected Purchase[] purchases;

    public Basket(int productCount) {
        purchases = new Purchase[productCount]; //убрано магическое число
    }

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases[i].title.equals(title)) {
                purchases[i].count += count;
                return;
            }
        }
    }

    public long sum(Map<String, Integer> prices) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < purchases.length; i++) {
            Purchase purchase = purchases[i];
            if (purchase == null) continue;
            System.out.println("\t" + purchase.getTitle() + " " + purchase.getCount() + " шт. в сумме " + (purchase.getCount() * prices.get(purchase.getTitle())) + " руб.");
            sum += purchase.getCount() * prices.get(purchase.getTitle());
        }
        return sum;
    }
}

/* В принципе можно было бы улучшить код, добавив реализацию на уровне абстракций
и интерфейсов. Однако по условию прямо запрещено лезть ручками вглубь и переписывать
с нуля или менять логику работы программы, поэтому кмк хватит этой пары наиболее
заметных исправлений. И в целом "работает - не трогай".
*/