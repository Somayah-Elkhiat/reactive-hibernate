package hibernate.reactive.service;

import hibernate.reactive.entity.BoutiqaatTvProduct;
import hibernate.reactive.entity.Boutiqaattv;
import hibernate.reactive.model.TvListRequest;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

@Service
public interface BoutiqaattvService {

    Mono<Boutiqaattv> getById(Long id);

    Mono<Boutiqaattv> saveTv(Boutiqaattv tv);

    Flux<Boutiqaattv> getTvs();

    Mono<Set<BoutiqaatTvProduct>> getProducts(Long tvId);

    Mono<List<Boutiqaattv>> getTvs(TvListRequest request, Integer pageIndex, Integer pageSize);

    void mapProductToTv(Long tvId, List<Integer> mapProducts) throws ExecutionException, InterruptedException;

    void unmapProductToTv(Long tvId, List<Integer> mapProducts) throws ExecutionException, InterruptedException;
}
