package moon.ioo;

public class Hotel {
    // Поля класса //
    String name;
    String description;
    int free_rooms;
    int rating;

    // Методы класса //
    // Модификатор доступа || ??? || возвращаемое значение || имя || (аргументы)
    public static void main(String[] args) {
    }

    public void booking() {
        free_rooms--;
    }

    public void unbooking() {
        free_rooms++;
    }

    public void increaseRating() {
        rating++;
    }

    public void downgradeRating() {
        rating--;
    }

    public void printHotelInformation() {
        System.out.println("Название отеля: " + name);
        System.out.println("Описание отеля: " + description);
        System.out.println("Свободных номеров: " + free_rooms);
        System.out.println("Рейтинг: " + rating);
        System.out.println("Будем рады, если Вы остановитесь в отеле " + name);
        System.out.println();
    }
}