package leecode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AccountsMerge {
	public static void main(String[] args) {

	}

//	public List<List<String>> accountsMerge(List<List<String>> accounts) {
//		// [
//		// 	["John", "johnsmith@mail.com", "john00@mail.com"],
//		// 	["John", "johnnybravo@mail.com"],
//		// 	["John", "johnsmith@mail.com", "john_newyork@mail.com"],
//		// 	["John", "john00@mail.com", "john_newyork@mail.com"],
//		// 	["Mary", "mary@mail.com"]
//		// ]
//		//
//		// [johnmsith@mail.com, john
//		// 같은 이메일 분류
//		//
//		Set<String> uniqueEmails = accounts.stream().flatMap(strings -> strings.stream()).filter(s -> s.contains("@")).collect(Collectors.toSet());
//		uniqueEmails.forEach(s -> {
//			accounts.stream().filter(strings -> strings.contains(s));
//		});
//
//
//	}
}
