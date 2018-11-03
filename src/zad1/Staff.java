package zad1;

public class Staff {
    private Employee[] personel;

    public void add(Employee newEmployee) {
        int n = personel.length;
        personel[n + 1] = newEmployee;
    }

    public void remove(int id) {
        int n = personel.length;
        for (int i = 0; i < n; i++) {
            if (personel[i].getId() == id) {
                personel[i] = null;
            }
        }
    }

}
