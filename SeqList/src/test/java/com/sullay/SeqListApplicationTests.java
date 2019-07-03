package com.sullay;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sullay.data.SeqList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SeqListApplicationTests {

	@Autowired
	SeqList seqList;
	@Test
	public void contextLoads() {
		System.out.println("111");
	}

	@Test
	public void test01() {
		Integer[] data=new Integer[5];
		seqList.setData(data);
		System.out.println(seqList.toString());
	}
	@Test
	public void test02() {
		seqList.setLength(10);
		SeqList.init(seqList);
		System.out.println(seqList.toString());
	}
	@Test
	public void test03() {
		seqList.setLength(1);
		System.out.println(SeqList.listEmply(seqList));
	}

}
