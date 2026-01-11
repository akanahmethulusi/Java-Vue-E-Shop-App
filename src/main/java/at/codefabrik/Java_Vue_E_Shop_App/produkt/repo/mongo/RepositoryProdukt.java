package at.codefabrik.Java_Vue_E_Shop_App.produkt.repo.mongo;

import at.codefabrik.Java_Vue_E_Shop_App.produkt.entity.Produkt;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RepositoryProdukt extends ReactiveMongoRepository<Produkt, String> {
}
