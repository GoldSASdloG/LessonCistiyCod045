public class Human {
    private double weight;
    private double height;

    public Human() {
    }

    public Human(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    // нужно создавать конструкторы новые не переписывая старый
    // а создавать новые с перегрузкой
    // тогда и старый конструктор будет работать и новый
    // это и есть принцип Open-closed — (принцип открытости / закрытости)
    // поэтому если чтото меняешь лучше добавь например конструктор
    // и старое работает и новое
}
