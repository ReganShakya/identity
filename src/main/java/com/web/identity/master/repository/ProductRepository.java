package com.web.identity.master.repository;

import com.web.identity.master.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Regan Shakya <reganshakya@gmail.com>
 * @Date Aug 25, 2022
 */
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
