class ParameterizedConstructor_Q32 {
    private int value;

    public ParameterizedConstructor_Q32(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        ParameterizedConstructor_Q32 obj = new ParameterizedConstructor_Q32(42);
        System.out.println("Value: " + obj.value);
    }
}
