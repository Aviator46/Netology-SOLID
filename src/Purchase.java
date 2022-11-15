// Добавлены геттеры и сеттеры. Вроде не исправление, но пусть будет.

public class Purchase {
    protected String title;
    protected int count;

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }

    public int getCount() {
        return count;
    }

    public void setCount() {
        this.count = count;
    }
}