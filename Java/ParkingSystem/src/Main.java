import db.TariffDb;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(1739282052174L);
        String sDate = date.toString();
        System.out.println(date.toString());
        System.out.println((new Date().getTime() - date.getTime()) / 1000 / 60);
    }
}