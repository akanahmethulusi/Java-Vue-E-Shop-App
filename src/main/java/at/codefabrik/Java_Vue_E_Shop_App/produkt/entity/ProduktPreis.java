package at.codefabrik.Java_Vue_E_Shop_App.produkt.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "product_price")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class ProduktPreis {
    private String id;
    private String productId;
    private String money_symbol;
    private String price;
}
