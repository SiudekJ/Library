import javax.swing.plaf.synth.SynthOptionPaneUI;

public class library {
    public static void main(String[] args) {
        final String appName = "Bibloteka v.01";
        String title = "Zbrodnia i Kara";
        String author = "Dostojewski";
        int releaseDate = 2014;
        int pages = 399;
        String publisher = "Znak";
        String isbn = "128304009";

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece to:");
        System.out.println(title);
        System.out.println( author);
        System.out.println(releaseDate );
        System.out.println(pages);
        System.out.println(isbn);
        System.out.println( publisher);

    }
}
