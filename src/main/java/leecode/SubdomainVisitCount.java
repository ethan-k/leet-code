package leecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubdomainVisitCount {
    public static void main(String[] args) {
        String[] input = new String[]{"9001 discuss.leetcode.com"};
        subdomainVisits(input);
    }

    public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> result = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (String cpdomain : cpdomains) {
            String[] fistSplit = cpdomain.split(" ");
            Integer count = Integer.valueOf(fistSplit[0]);
            String[] subDomains = fistSplit[1].split("\\.");
            for (int i = 0; i < subDomains.length; i++) {
                String domain = subDomains[i];
                for (int j = i + 1; j < subDomains.length; j++) {
                    domain += "." + subDomains[j];
                }
                map.put(domain, map.getOrDefault(domain, 0) + count);
            }
        }
        map.entrySet().forEach(stringIntegerEntry -> {
            result.add(stringIntegerEntry.getValue() + " " + stringIntegerEntry.getKey());
        });
        return result;
    }
}
