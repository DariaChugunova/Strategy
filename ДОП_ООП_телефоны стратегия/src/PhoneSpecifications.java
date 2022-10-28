public class PhoneSpecifications {
    public static void main(String[] args) {
        Phones phones = new smartphone();
        phones.display();
        phones.phone_ring();
        phones.phone_screen();
        System.out.println();

        Phones phones1 = new pushbuttontelephone();
        phones1.display();
        phones1.phone_ring();
        phones1.phone_screen();
        System.out.println();

        Phones phones2 = new landlinephone();
        phones2.display();
        phones2.phone_ring();
        phones2.phone_screen();
        System.out.println();

        Phones phones3 = new toyphone();
        phones3.display();
        phones3.phone_ring();
        phones3.phone_screen();
        System.out.println();

        System.out.println("Разработали кнопочный телефон с сенсерным экраном");
        Phones phones4 = new pushbuttontelephone();
        phones4.display();
        phones4.setScreen(new touch_screen());
        phones4.phone_ring();
        phones4.phone_screen();

    }
}
