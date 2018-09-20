package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator;
    private int denominator;


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


    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction fraction;
        int ms,ts;
        ms=other.getDenominator();
        ts=other.getNumerator();
        fraction.setDenominator(this.denominator*ms);
        fraction.setNumerator(other.getNumerator()*this.denominator+this.numerator*other.getDenominator());
        return fraction;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction fraction;
        fraction.setDenominator(this.denominator*other.denominator);
        fraction.setNumerator(this.numerator*this.denominator-other.getNumerator()*other.getDenominator());
        return fraction;

    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction fraction;
        fraction.setDenominator(this.denominator*other.getDenominator());
        fraction.setNumerator(other.numerator*this.numerator);
        return fraction;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction fraction;
        fraction.setDenominator(this.denominator*other.getNumerator());
        fraction.setNumerator(other.getDenominator()*this.numerator);
        return fraction;
    }

    public boolean equals(Fraction other){
        Fraction fraction = this.subtract(other);
        return (fraction.numerator<0)?false:true;

    }
}
