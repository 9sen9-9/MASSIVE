//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println(lastName+" "+firstName+" "+middleName+" "+"Ф.И.О. сотрудника");

        System.out.println("Task2");
        String fullName1 = "Ivanov Ivan Ivanovich";
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета —"+ fullName1.toUpperCase());
        System.out.println("Task3");
        String fullName3 = "Иванов Семён Семёнович";
        String fullName4 = fullName3.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника —"+fullName4);


    }
}
