//by JK 23-10-19
package com.kinahan.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.kinahan.rentAnix.Trader;

public interface TradersRepository extends MongoRepository <Trader, String>{
	Trader findBy_id(ObjectId traderId);
}
