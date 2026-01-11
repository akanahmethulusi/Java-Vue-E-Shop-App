package at.codefabrik.Java_Vue_E_Shop_App.produkt.repo.elasticSearch;

import at.codefabrik.Java_Vue_E_Shop_App.produkt.entity.ProduktES;
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;

public interface RepositoryProduktES extends ReactiveElasticsearchRepository<ProduktES, String> {
}
