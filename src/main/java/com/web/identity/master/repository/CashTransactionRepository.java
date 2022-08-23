package com.web.identity.master.repository;

import com.web.identity.master.entity.CashTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Regan Shakya <reganshakya@gmail.com>
 * @Date Aug 23, 2022
 */
public interface CashTransactionRepository extends JpaRepository<CashTransaction, Integer>{

}
