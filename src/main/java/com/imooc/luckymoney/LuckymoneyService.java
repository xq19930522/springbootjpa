package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.math.BigDecimal;

/**
 * Created by xuqing
 * 2020年7月12日11:00:58
 *
 */
@Service
public class LuckymoneyService {

	@Autowired
	private LuckmoneyRepository repository;

	/**
	 * 事务 指数据库事务
	 * 扣库存 > 创建订单
	 */
	@Transactional
	public void createTwo() {
		Luckymoney luckymoney1 = new Luckymoney();
		luckymoney1.setProducer("徐庆");
		luckymoney1.setMoney(new BigDecimal("520"));
		repository.save(luckymoney1);

		Luckymoney luckymoney2 = new Luckymoney();
		luckymoney2.setProducer("徐庆");
		luckymoney2.setMoney(new BigDecimal("1314"));
		repository.save(luckymoney2);
	}
}
