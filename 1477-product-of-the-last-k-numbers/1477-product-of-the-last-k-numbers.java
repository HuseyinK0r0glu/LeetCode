import java.util.*;

class ProductOfNumbers {

    List<Integer> numbers;
    List<Integer> prefixProduct;
    int lastProduct;
    int lastIndexOfZeros = -1;

    public ProductOfNumbers() {
        numbers = new ArrayList<>();
        prefixProduct = new ArrayList<>();
        lastProduct = 1;
    }

    public void add(int num) {
        numbers.add(num);
        if(num == 0){
            lastProduct = 1;
            lastIndexOfZeros = numbers.size() - 1;
        }else {
            lastProduct = lastProduct * num;
        }
        prefixProduct.add(lastProduct);
    }

    public int getProduct(int k) {
        if(numbers.size() - k <= lastIndexOfZeros) return 0;
        if(k == 1) return numbers.getLast();
        if(k == numbers.size()) return lastProduct;
        return prefixProduct.getLast() / prefixProduct.get(prefixProduct.size() - 1 - k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */