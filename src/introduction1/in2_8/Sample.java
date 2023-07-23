public class Sample {
    private var value;

        // varはローカル変数にしか使えない
    public Sample(var value) {
        this.value = value;
    }

    public void test() {
        System.out.println(value);
    }
}
