public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println(" ");
        byte a = 5;
        short b = 100;
        int c = 2105;
        long d = 40000;
        float e = 0.05f;
        double f = 0.52625;
        System.out.println("Значение переменной с типом byte равно " + a);
        System.out.println("Значение переменной с типом short равно " + b);
        System.out.println("Значение переменной с типом int равно " + c);
        System.out.println("Значение переменной с типом long равно " + d);
        System.out.println("Значение переменной с типом float равно " + e);
        System.out.println("Значение переменной с типом double равно " + f);
        //Задание 2
        System.out.println(" ");
        double g = 27.12;
        long k = 987_678_965_549l;
        float l = 2.786f;
        boolean m = false;
        short n = 569;
        short o = -159;
        int p = 27897;
        byte r = 67;
        //Задание 3
        System.out.println(" ");
        short totalPaper = 480;
        byte klassLP = 23;
        byte klassAS = 27;
        byte klassEA = 30;
        int totalNumberOfStudents = klassLP + klassAS + klassEA;
        int numberOfSheets = totalPaper / totalNumberOfStudents;
        System.out.println("На каждого ученика рассчитано " + numberOfSheets + " листов бумаги");
        //Задание 4
        System.out.println(" ");
        byte machinePerformance1minute = 16 / 2;
        System.out.println("За одну минуту работы машины произвела бутылок " + machinePerformance1minute + " штук");
        int machinePerformance20minute = machinePerformance1minute * 20;
        System.out.println("За двадцать минут работы машины произвела бутылок " + machinePerformance20minute + " штук");
        int machinePerformanceDay = machinePerformance1minute * 1440;
        System.out.println("За одни сутки работы машины произвела бутылок " + machinePerformanceDay + " штук");
        int machinePerformance3day = machinePerformanceDay * 3;
        System.out.println("За трое суток работы машины произвела бутылок " + machinePerformance3day + " штук");
        int machinePerformance1month = machinePerformanceDay * 30;
        System.out.println("За 1 месяц работы машины произвела бутылок " + machinePerformance1month + " штук");
        //Задание 5
        System.out.println(" ");
        byte totalNumberOfPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        byte totalPaint1klass = (byte) (brownPaint + whitePaint);
        byte totalKlass = (byte) (totalNumberOfPaint / totalPaint1klass);
        int totalWhitePaint = whitePaint * totalKlass;
        int totalBrownPaint = brownPaint * totalKlass;
        System.out.println("В школе, где " + totalKlass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
        //Задание 6
        System.out.println(" ");
        byte banana1Weight = 80;
        int weightBananas = banana1Weight * 5;
        byte milk1Weight = 105;
        int weightMilk = milk1Weight * 2;
        byte iceCream1 = 100;
        int weightIceCream = iceCream1 * 2;
        byte egg = 80;
        int weightEggs = egg * 4;
        int weightSportsBreakfast = weightBananas + weightMilk + weightIceCream + weightEggs;
        float weightSportsBreakfastKg = weightSportsBreakfast / 1000f;
        System.out.println(weightSportsBreakfast + " грамм");
        System.out.println(weightSportsBreakfastKg + " килограмм");
        //задание 7
        System.out.println(" ");
        short totalWeight = 7000;
        short weightLossPerDay1 = 250;
        short weightLossPerDay2 = 500;
        int numberOfDaysForWeightLoss1 = totalWeight / weightLossPerDay1;
        int numberOfDaysForWeightLoss2 = totalWeight / weightLossPerDay2;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то ему понадобится " + numberOfDaysForWeightLoss1 + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то ему понадобится " + numberOfDaysForWeightLoss2 + " дней");
        int averageNumberOfDaysToLoseWeight = (numberOfDaysForWeightLoss1 + numberOfDaysForWeightLoss2) / 2;
        System.out.println(averageNumberOfDaysToLoseWeight + " может потребоваться дней в среднем, чтобы добиться результата похудения");
        //задание 8
        System.out.println(" ");
        int salaryMaria = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int yearSalaryMaria = salaryMaria * 12;
        int yearSalaryDenis = salaryDenis * 12;
        int yearSalaryKristina = salaryKristina * 12;
        int totalYearSalary = yearSalaryMaria + yearSalaryDenis + yearSalaryKristina;
        float newSalaryMaria = salaryMaria * 0.1f + salaryMaria;
        float newSalaryDenis = salaryDenis * 0.1f + salaryDenis;
        float newSalaryKristina = salaryKristina * 0.1f + salaryKristina;
        float newYearSalaryMaria = newSalaryMaria * 12;
        float newYearSalaryDenis = newSalaryDenis * 12;
        float newYearSalaryKristina = newSalaryKristina * 12;
        float totalNewYearSalary = newYearSalaryMaria + newYearSalaryDenis + newYearSalaryKristina;
        float differenceBetweenIncomes = totalNewYearSalary - totalYearSalary;
        float differenceBetweenSalariesMaria = newYearSalaryMaria - yearSalaryMaria;
        float differenceBetweenSalariesDenis = newYearSalaryDenis - yearSalaryDenis;
        float differenceBetweenSalariesKristina = newYearSalaryKristina - yearSalaryKristina;
        System.out.println("Маша теперь получает " + newSalaryMaria + " рублей. Годовой доход вырос на " + differenceBetweenSalariesMaria + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differenceBetweenSalariesDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + differenceBetweenSalariesKristina + " рублей");
        System.out.println("Разницу между годовым доходом с нынешней зарплатой и после повышения составляет " + differenceBetweenIncomes + " рублей");
    }
}