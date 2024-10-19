public class Main {
    public static void main(String[] args) {
        CustomArrayListGenerics<String> list = new CustomArrayListGenerics<>();

        list.add("rakesh");
        list.add("rakesh");
        list.add("rakesh");
        list.print();

        list.remove();
        list.print();

        System.out.println("Element at index 1: " + list.get(1));
    }
}
