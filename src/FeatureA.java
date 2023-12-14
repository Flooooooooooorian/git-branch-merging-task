import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FeatureA{

    public static void main(String[] args) {
        System.out.println("Hallo, das ist der Code von <Name>");
        List<String> nameSpelling = new ArrayList<>();
        String name = "Jakob Schneider";
        nameSpelling = Arrays.stream(name.split("")).toList();
        nameSpelling.stream().forEach(System.out::println);
    }
}
