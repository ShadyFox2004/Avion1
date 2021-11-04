public class Passager {
    private int age;
    private double poids;

    // Default values

    public static final int DEFAULT_AGE = 18;
    public static final double DEFAULT_POIDS = 180;

    // Constructors

    public Passager() {
        this(DEFAULT_AGE, DEFAULT_POIDS);
    }

    public Passager(int age, double poids){
        setAge(age);
        setPoids(poids);
    }

    // Getters and Setters

    public void setAge(int age) {
    }

    public void setPoids(double poids) {
    }



    public int getAge() {
        return this.age;
    }

    public double getPoids() {
        return this.poids;
    }

    // Validators

    public static boolean ageIsValid(int age) {
        return false;
    }

    public static boolean poidIsValid(double poid) {
        return false;
    }
}
