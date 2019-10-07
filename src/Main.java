import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args)
    {
        Book b1 = new Book();
        Book b2 = new Book("1984", "Джордж Оруэлл", Collections.singletonList("Всем жопа"));

        b2.setText(Arrays.asList("Был яркий холодный апрельский день, часы били тринадцать.",
                "Уинстон Смит, прижав подбородок к груди и ежась от омерзительного ветра, быстро скользнул " +
                        "в стеклянные двери Дома Победы, но все же вихрь песка и пыли успел ворваться вместе с ним."));

        System.out.println(b1);
        System.out.println(b2);
    }

}
