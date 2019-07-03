package com.sullay.data;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class SeqList<T> {
	private T[] data;
	private int length;
	public static void init(SeqList list) {
		list.length=0;
	}
	
	public static Boolean listEmply(SeqList list) {
		return list.length==0;
	}
}
