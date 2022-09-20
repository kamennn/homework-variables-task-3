public class Main {
    public static void main(String[] args) {
        //задача 6//
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println(boxer1);
        System.out.println(boxer2);
        var TotalWeight = boxer1 + boxer2;
        System.out.println(TotalWeight);
        var WeightDifference = boxer1 - boxer2;
        System.out.println(WeightDifference);
        //задача 7//
        var WeightDifference2 = boxer2 % boxer1;
        System.out.println(WeightDifference2);
        //задача 8//
        var TotalHours = 640;
        var OneEmployee = 8;
        System.out.println(TotalHours);
        System.out.println(OneEmployee);
        var TotalEmployees = TotalHours / OneEmployee;
        System.out.println("Всего работников в компании " + TotalEmployees + " человек");
        var MoreWorkers = TotalEmployees + 94;
        System.out.println(MoreWorkers);
        var TotalHours2 = TotalHours / MoreWorkers;
        System.out.println("Если в компании работает " + MoreWorkers + " человек, то всего " + TotalHours2 + " часа работы может быть поделено между сотрудниками");
    }
}