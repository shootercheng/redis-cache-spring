package com.redis.chache;

import com.redis.chache.model.City;
import com.redis.chache.model.Province;
import com.redis.chache.service.DictCacheService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CacheApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private DictCacheService dictCacheService;

	@Test
	public void testCountry(){
		List<Province> cnpros = new ArrayList<>();
		cnpros.add( new Province("cn",1,"sc","SiChuan"));
		cnpros.add(new Province("cn", 2,"gd","GuangDong"));
		List<Province> ukpros = new ArrayList<>();
		ukpros.add(new Province("uk",1,"ld","London"));
		ukpros.add(new Province("uk",1,"mp","Metropolitan "));
		// TODO batch
		dictCacheService.putCountry("cn", cnpros);
		dictCacheService.putCountry("uk", ukpros);
		List<Province> cnList = dictCacheService.getCountry("cn");
		Assert.assertEquals(cnpros.size(), cnList.size());
		List<Province> ukList = dictCacheService.getCountry("uk");
		Assert.assertEquals(ukpros.size(), ukList.size());
	}

	@Test
	public void testCity(){
		List<City> cts = new ArrayList<>();
		cts.add(new City("sc","1","cd","ChengDu"));
		dictCacheService.putProvinces("sc", cts);
		List<City> cacheCts = dictCacheService.getCitys("sc");
		Assert.assertEquals(cts.size(), cacheCts.size());
	}

	@Test
	public void testSystem(){
		String tk = UUID.randomUUID().toString();
		dictCacheService.putSystem("1", tk);
		String token = dictCacheService.getToken("1");
		Assert.assertEquals(tk, token);
	}

}
