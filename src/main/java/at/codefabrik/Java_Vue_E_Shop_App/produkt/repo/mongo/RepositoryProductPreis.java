package at.codefabrik.Java_Vue_E_Shop_App.produkt.repo.mongo;

import at.codefabrik.Java_Vue_E_Shop_App.produkt.entity.ProduktPreis;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RepositoryProductPreis extends ReactiveMongoRepository<ProduktPreis, String> {
}
