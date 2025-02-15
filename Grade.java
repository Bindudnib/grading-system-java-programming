public class Grade {
    private String subject;
    private double value;

    public Grade(String subject, double value) {
        this.subject = subject;
        this.value = value;
    }

    public String getSubject() {
        return subject;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return subject + ": " + value;
    }
}
