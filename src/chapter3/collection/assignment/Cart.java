package chapter3.collection.assignment;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    // 속성
    private List<Product> cart = new ArrayList<>();

    // 생성자

    // 기능
    // 상품 추가 기능
    public  void addProduct(Product product) {
        cart.add(product);
        System.out.println(product.getName() + " 가 장바구니에 추가 되었습니다.");
    }

    // 상품 제거 기능
    public void removeProduct(String removeProductName) {
        boolean removed = false;

        for (Product product : cart) {
            String foundProductName = product.getName();
            if (foundProductName.equals(removeProductName)) {
                cart.remove(product);
                System.out.println(product.getName() + "가 장바구니에서 제거 되었습니다.");
                break;
            }  // else { sout("해당 상품이 장바구니에 없습니다.") }
        }
        if (!removed) {
            System.out.println("해당 상품이 장바구니에 없습니다.");
        }
    }

    // 장바구니 목록 출력 기능
    public void printCart() {
        if (cart.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
        } else {
            for (Product product : cart) {
                System.out.println(product.getName() + ": " + product.getPrice());
            }
        }
    }

    // 장바구니 총 상품 가격 조회 기능
    public void calculateTotalPrice() {
        int total = 0;
        for (Product product : cart) {
            total += product.getPrice();
        }
        System.out.println("총 금액은: " + total);
    }
}
