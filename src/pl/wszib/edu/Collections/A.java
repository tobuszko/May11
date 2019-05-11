package pl.wszib.edu.Collections;

import java.util.Objects;

public class A {
    private int x;
    private String y;


    public A(int x, String y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return x == a.x &&
                Objects.equals(y, a.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
