package chapter3.generic;

public class GenericBox<T> {
    // 속성
    private T item;

    // 생성자
    public GenericBox(T item) {
        this.item = item;
    }

    // 기능
    public T getItem() {
        return item;
    }

    // 일반 메서드
    public void printBox(T item) {
        System.out.println(item);
    }

    // 제네릭 메서드
    public <S> void printBox2(S item) {
        System.out.println(item);
    }



}
