public class Day {

    public String getDayOfWeek(int day){
        switch (day){
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 7:
                return "Воскресенье";
            default:
                return "Неизвестный день";
        }
    }

    public String dayTime(int hour){
        if (hour > 24 || hour < 0)
            return "Некорректное время";
        else if (hour > 21 || hour < 6)
            return "Ночь";
        else if (hour >= 15)
            return "Вечер";
        else if (hour >= 11)
            return "Обед";
        else
            return "Утро";
    }
}
