package com.parallel_processing;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class DemoParallel {
	public static void main(String[] args) {
		long[] sum = new long[] {0L};
		
		// there is some race condition
		
//		System.out.println(Runtime.getRuntime().availableProcessors());
		
//		LongStream.range(1, 1_000_000).forEach((long value) -> sum[0] += value);
//		System.out.println(sum[0]);
		
		long start = System.currentTimeMillis();
		
		long sumUsingReduction =  LongStream.rangeClosed(1, 25)
							.parallel().reduce(1, (long x, long y)-> x*y);
									
		
		long end = System.currentTimeMillis();
		System.out.println(sumUsingReduction);
		
		System.out.println("time :" + (end-start));
		

		
//		AtomicLong atomicLong = new AtomicLong();
//		LongStream.rangeClosed(1, 1_000_000)
//		.parallel()
//		.forEach(value -> atomicLong.addAndGet(value));
//		System.out.println(atomicLong);
		
	}
}
