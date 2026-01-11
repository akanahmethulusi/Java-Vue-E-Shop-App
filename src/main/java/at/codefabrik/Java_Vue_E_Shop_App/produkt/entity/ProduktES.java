package at.codefabrik.Java_Vue_E_Shop_App.produkt.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "produkt")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class ProduktES {
    private String id;
    private String name;
    private String code;
    private String description;
    private CompanyES seller;
    private String features;
    private CategoryES category;
    private Boolean active;
}
