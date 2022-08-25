public class Main {
    public static void main(String[] args) {

        // Задача 1
       System.out.println("Первая задача");
       int a = 584;
       System.out.println("Значение переменной a с типом int равно " + a);
       byte b = 5;
       System.out.println("Значение переменной b с типом byte равно " + b);
       short c = 8566;
        System.out.println("Значение переменной c с типом short равно " + c);
       long d = 658755;
        System.out.println("Значение переменной d с типом long равно " + d);
       float e = 25;
        System.out.println("Значение переменной e с типом float равно " + e);
       double f = 2.5;
        System.out.println("Значение переменной f с типом double равно " + f);

        // Задача 2
        System.out.println("Вторая задача");
        double j = 27.12;
        long m = 987_678_965_549L;
        byte k = 2;
        short n = 786;
        boolean z = false;
        short x = 569;
        short v = -159;
        int s = 27897;
        byte h = 67;

        // Задача 3
        System.out.println("Третья задача");
        short lyudmilaPavlovna = 23;
        short annaSergeevna = 27;
        short ekaterinaAndreevna = 30;
        int totalStudents = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int purchaseOfPaper = 480;
        int student = purchaseOfPaper / totalStudents;
        System.out.println("На каждого ученика рассчитанно " + student + " листов бумаги");

        // Задача 4
        System.out.println("Четвёртая задача");
        short bottlePerformance = 16;
        int oneMinute = bottlePerformance / 2;
        int oneHour = oneMinute * 60;
        short day = 24;
        short months = 30;
        int twentyMinutes = oneMinute * 20;
        System.out.println("За 20 минут машина произвела бутылок " + twentyMinutes + " штук");
        int productivityPerDay = oneHour * day;
        System.out.println("За сутки машина произвела бутылок " + productivityPerDay + " штук");
        int productivityInThreeDays = productivityPerDay * 3;
        System.out.println("За 3 дня машина произвела бутылок " + productivityInThreeDays + " штук");
        int productivityMonths = (oneHour * day) * months;
        System.out.println("За 1 месяц машина произвела бутылок " + productivityMonths + " штук");

        // Задача 5
        System.out.println("Пятая задача");
        short totalPaint = 120;
        short oneWhite = 2;
        short oneBrown = 4;
        int colors = oneWhite + oneBrown;
        int totalClasses = totalPaint / colors;
        int totalWhite = totalClasses * oneWhite;
        int totalBrown = totalClasses * oneBrown;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой красски  и " + totalBrown + " банок коричневой краски");

        // Задача 6
        System.out.println("Шестая задача");
        short bananas = 80;
        short milk = 105;
        short iceCreamSundae = 100;
        short rawEggs = 70;
        double totalWeight = (((bananas * 5) + (milk * 2) + (iceCreamSundae * 2) + (rawEggs * 4) )/ 1000);
        System.out.println("Вес спорт-завтрака, равен: " + totalWeight + " кг.");

        // Задача 7
        System.out.println("Седьмая задача");
        short loseWeight = 7;
        System.out.println("Что - бы похудеть надо сбросить " + loseWeight + " килограмм");
        int gram = 1000;
        int howManyGrams = loseWeight * gram;
        int ifYouEatMore = 250;
        int ifYouEatLess = 500;
        int inNowManyDaysWillHeLoseWeightIfYouEatMore = howManyGrams / ifYouEatMore;
        int inNowManyDaysWillHeLoseWeightIfYouEatLess = howManyGrams / ifYouEatLess;
        System.out.println("Если спрортсмен будет ежедневно терять по " + ifYouEatMore + " грамм, то похудеет через " + inNowManyDaysWillHeLoseWeightIfYouEatMore + " дней");
        System.out.println("Если спрортсмен будет ежедневно терять по " + ifYouEatLess + " грамм, то похудеет через " + inNowManyDaysWillHeLoseWeightIfYouEatLess + " дней");

        // Задача 8
        System.out.println("Восьмая задача");
        int mari = 67760;
        int denis = 83690;
        int kristina = 76230;
        int annualIncomeBeforeTheIncreaseMari = mari * 12;
        int annualIncomeBeforeTheIncreaseDenis = denis * 12;
        int annualIncomeBeforeTheIncreaseKristina = kristina * 12;
        double monthlyIncreaseMari = mari * 1.1;
        double monthlyIncreaseDenis = denis * 1.1;
        double monthlyIncreaseKristina = kristina * 1.1;
        double increasePerYearMari = monthlyIncreaseMari * 12;
        double increasePerYearDenis = monthlyIncreaseDenis * 12;
        double increasePerYearKristina = monthlyIncreaseKristina * 12;
        double differenceMari = increasePerYearMari - annualIncomeBeforeTheIncreaseMari;
        double differenceDenis = increasePerYearDenis - annualIncomeBeforeTheIncreaseDenis;
        double differenceKristina = increasePerYearKristina - annualIncomeBeforeTheIncreaseKristina;
        System.out.println("Маша будет получать " + monthlyIncreaseMari + " годовой доход вырос на " + differenceMari + " рублей");
        System.out.println("Денис будет получать " + monthlyIncreaseDenis + " годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина будет получать " + monthlyIncreaseKristina + " годовой доход вырос на " + differenceKristina + " рублей");
    }
}