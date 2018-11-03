package zad1;

import java.time.LocalDate;

public class test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2011, 10, 22);
        Employee pracownik = new Employee("Imie", "Nazwisko", date,  999);

        System.out.println(pracownik.toString());

        System.out.println(pracownik.daysOfWork());

        Staff lista = new Staff();

    }
}
