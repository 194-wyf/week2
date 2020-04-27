package com.wyf.util;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.wyf.common.domain.TPSService;
import com.wyf.common.utils.DateUtil;
import com.wyf.common.utils.RandNumUtil;
import com.wyf.common.utils.ZHStringUtil;

public class UtilTest {

	@Test
	public void test() throws ParseException {
//		循环创建对象
		
		
		for (int i = 0; i < 100; i++) {
			TPSService tps = new TPSService();
//			给id赋值
			tps.setId(new BigInteger(String.valueOf(i+1)));
//			专家姓名属性值调用ZHStringUtil的getZHName()
			tps.setName(ZHStringUtil.getZHName());
//			年龄属性值调用RandomUtil.random()创建，必须在1-100岁之间
			tps.setAge(RandNumUtil.random(0, 101));
//			薪酬是3万到8万，小数点后2位的随机数
			
			tps.setMoney(RandNumUtil.getValue(30000, 80000, 2));
//			聘用日期属性值模拟2012年1月1日至今任意随机时间
			SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
			Date c = s.parse("2012-01-01");
			tps.setDate(DateUtil.random(c, new Date()));
			
			System.out.println(tps);
		}
	}

}
