package at.codefabrik.Java_Vue_E_Shop_App.produkt.service;

import at.codefabrik.Java_Vue_E_Shop_App.produkt.entity.ProduktES;
import at.codefabrik.Java_Vue_E_Shop_App.produkt.model.ProduktResponse;
import at.codefabrik.Java_Vue_E_Shop_App.produkt.repo.elasticSearch.RepositoryProduktES;
import at.codefabrik.Java_Vue_E_Shop_App.produkt.repo.mongo.RepositoryProdukt;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class ServiceProdukt {
    private final RepositoryProduktES repositoryProduktES;
    private final RepositoryProdukt repositoryProdukt;

    /*
    public Flux<ProduktES> findAll() {
        return repositoryProduktES.findAll();
    }
     */

    public Flux<ProduktES> getByPaging(Pageable pageable) {
        // 1- Abfragen von ElasticSearch
        // 2- Handhaben die calc Field
        // 3- Bring von Redis, was field braucht wird
        // 4- Verwandel zu Response-Objekt.

        return null;
    }

    public Flux<ProduktResponse> save(){
        //1- Schreib zu MongoDB
        //2- update elasticsearch
        //3- update redis
        //4- drech die Antwort von Elasticsearch durch
        //5- Verwandel zu Response-Objekt
        return null;
    }
}
