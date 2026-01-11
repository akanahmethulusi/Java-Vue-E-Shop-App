package at.codefabrik.Java_Vue_E_Shop_App.produkt.entity;

public class ProduktImage {
    private ImageType imageType;
    private String url;

    enum ImageType{
        FEATURE, NORMAL;
    }
}
