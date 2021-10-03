package com.pd.algorithms;

import java.util.*;

public class Divisors {

	public List<Integer> findDivisors(int num) {

		Set<Integer> div = new HashSet<Integer>();

		div.add(1);

		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0)
				div.add(i);

		}

		div.add(num);

		return new ArrayList<>(div);
	}

}
