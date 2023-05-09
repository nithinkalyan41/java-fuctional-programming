package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getUrl.get());
        System.out.println();
        System.out.println(getUrls.get());


    }
    static Supplier<String> getUrl = () -> "www.google.com";
    static Supplier<List<String>> getUrls = () -> List.of("www.google.com",
            "www.youtube.com",
            "www.facebook.com");
}
