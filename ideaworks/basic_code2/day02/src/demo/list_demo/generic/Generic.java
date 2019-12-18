package demo.list_demo.generic;

public class Generic<E> {
    private E name;

    public Generic() {
    }

    public Generic(E name) {
        this.name = name;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
