package at.codefabrik.Java_Vue_E_Shop_App.produkt.entity;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collation = "product")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Produkt {
    private String id;
    private String name;
    private String code;
    private String description;
    private String companyId;
    private String features;
    private String categoryId;
    private List<ProduktImage> produktImage;
    private Boolean active;
}
