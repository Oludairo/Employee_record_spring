package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Bvn;

import java.util.List;

public interface BvnRepository {
    Bvn save(Bvn bvn);
    Bvn findBvn();
    void delete(Bvn bvn);
    List<Bvn>findAll();
}
