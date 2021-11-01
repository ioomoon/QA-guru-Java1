package moon.ioo;



public class TypeHotel {
    public static void main(String[] args){
        Hotel cosmos = new Hotel();
        cosmos.name = "Космос";
        cosmos.description = "Фешенабельный отель в центре столицы";
        cosmos.free_rooms = 15;
        cosmos.booking();
        cosmos.booking();
        cosmos.increaseRating();
        cosmos.increaseRating();
        cosmos.downgradeRating();
        cosmos.aboutHotel();

        Hotel moscow = new Hotel();
        moscow.name = "Москва";
        moscow.description = "Отель, который погрузит Вас в атмосферу Москвы 19-го века";
        moscow.free_rooms = 30;
        moscow.booking();
        moscow.unbooking();
        moscow.increaseRating();
        moscow.increaseRating();
        moscow.aboutHotel();
    }

}
