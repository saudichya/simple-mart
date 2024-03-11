package com.audichya.SimpleMart;

import com.audichya.SimpleMart.Model.Item;
import com.audichya.SimpleMart.Service.ItemService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SimpleMartApplicationTests {

	@Mock
	ItemService itemService;

	@Test
	void contextLoads() {
	}

	@Test
	void simpleTest() {
		Mockito.when(itemService.getAllItems())
				.thenReturn(List.of());
		List<Item> items = itemService.getAllItems();
		Mockito.verify(itemService).getAllItems();
		assert items.size()==0;
	}

}
