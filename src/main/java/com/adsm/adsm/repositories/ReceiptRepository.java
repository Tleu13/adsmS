package com.adsm.adsm.repositories;

import com.adsm.adsm.model.Receipt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiptRepository extends CrudRepository<Receipt,Long> {
}
