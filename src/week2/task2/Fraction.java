package week2.task2;


public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator;
    private int denominator;

    //TODO : getter and setter
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }


    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }


    public Fraction() {
        this.denominator = 1;
        this.numerator = 1;
    }

    public int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a,
        a = Math.abs(a);
        b = Math.abs(b);
        return (a == b) ? a : (a == 0) ? b : (b == 0) ? a : (a > b) ? gcd(b, a - b) : gcd(a, b - a);

    }

    public int BCLN(int a, int b) {
        // TODO : Tinh boi chung lon nhat a,b

        return (a * b) / gcd(a, b);

    }

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction value = new Fraction();
        value.setDenominator(BCLN(this.denominator, other.getDenominator()));
        value.setNumerator((value.getDenominator() / this.denominator * this.numerator) + (value.getDenominator() / other.getDenominator() * other.getNumerator()));
        return value;

    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction value = new Fraction();
        value.setDenominator(BCLN(this.denominator, other.getDenominator()));
        value.setNumerator((value.getDenominator() / this.denominator * this.numerator) - (value.getDenominator() / other.getDenominator() * other.getNumerator()));
        return value;

    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction value = new Fraction();
        value.setDenominator(this.denominator * other.getDenominator());
        value.setNumerator(this.numerator * other.getNumerator());
        value.setDenominator(value.getDenominator() / gcd(value.getDenominator(), value.getNumerator()));
        value.setNumerator(value.getNumerator() / gcd(value.getDenominator(), value.getNumerator()));
        return value;


    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        // TODO : other chia this
        Fraction value = new Fraction();
        value.setNumerator(this.denominator);
        value.setDenominator(this.numerator);
        value = value.multiply(other);
        return value;
    }
    public boolean equals (Object obj)
    {
        Fraction other = (Fraction) obj;
        return (this.numerator*this.denominator - other.denominator*other.numerator/other.gcd(other.numerator, other.denominator)==0) ? true : false;
    
     }
    
}
