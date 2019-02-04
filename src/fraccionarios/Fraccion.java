package fraccionarios;

import java.math.BigDecimal;

public final class Fraccion implements Comparable<Fraccion> {

    private int num, den;

    public Fraccion() {
        num = 0;
        den = 1;
    }

    public Fraccion(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Error: No se puede dividir entre cero");
        }

        num = x;
        den = y;
    }

    public Fraccion(double decimal) {
        String txtDen = Double.toString(decimal).split("\\.")[1];
        BigDecimal n = BigDecimal.valueOf(decimal);
        this.den = (int) Math.pow(10, txtDen.length());
        n = n.multiply(new BigDecimal(this.den));
        this.num = n.intValue();
    }

    public Fraccion(String n) {
        String[] f = n.split("/");
        if (f.length == 2 && f[1].equals("0")) {
            throw new ArithmeticException("Error: No se puede dividir entre cero");
        }
        this.num = Integer.parseInt(f[0]);
        this.den = (f.length == 1) ? 1 : Integer.parseInt(f[1]);
    }

    public Fraccion sumar(Fraccion b) {
        Fraccion c = new Fraccion();
        c.num = this.num * b.den + b.num * this.den;
        c.den = this.den * b.den;
        return c;
    }

    public Fraccion restar(Fraccion b) {
        Fraccion c = new Fraccion();
        c.num = this.num * b.den - b.num * this.den;
        c.den = this.den * b.den;
        return c;
    }

    public Fraccion multiplicar(Fraccion b) {
        return new Fraccion(this.num * b.num, this.den * b.den);
    }

    public Fraccion inversa() {
        return new Fraccion(this.den, this.num);
    }

    public Fraccion dividir(Fraccion b) {
        return this.multiplicar(b.inversa());
    }

    private int mcd() {
        int u = Math.abs(num);
        int v = Math.abs(den);

        if (v == 0) {
            return u;
        }

        int r;

        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    public Fraccion simplificar() {
        int dividir = mcd();
        num /= dividir;
        den /= dividir;
        if (den < 0) {
            num *= -1;
            den *= -1;
        }
        return this;
    }

    public static Fraccion decimalFraccionario(double decimal) {
        return new Fraccion(decimal);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.num;
        hash = 83 * hash + this.den;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        final Fraccion other = (Fraccion) obj;
        return (this.doubleValue() == other.doubleValue())
                || (this.num == other.num && this.den == other.num);
    }

    @Override
    public String toString() {
        String texto = num + "/" + den;
        return texto;
    }

    public byte byteValue() {
        return (byte) intValue();
    }

    public short shortValue() {
        return (short) intValue();
    }

    public int intValue() {
        return num / den;
    }

    public long longValue() {
        return num / den;
    }

    public float floatValue() {
        return (float) num / den;
    }

    public double doubleValue() {
        return (double) num / den;
    }

    @Override
    public int compareTo(Fraccion o) {
        return new Double(this.doubleValue()).compareTo(o.doubleValue());
    }
}
