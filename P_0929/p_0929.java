import java.util.ArrayList;
import java.util.HashMap;

public class p_0929 {
    public static void main(String[] args) {
        System.out.println(numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
        System.out.println(numUniqueEmails(new String[]{"a@leetcode.com","b@leetcode.com","c@leetcode.com"}));
    }

    public static int numUniqueEmails(String[] emails) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int result = 0;
        String local, domain;
        for(String email : emails) {
            String[] email_split = email.split("@");
            local = email_split[0];
            domain = email_split[1];

            if(local.contains("+")) {
                local = local.split("\\+")[0];
            }
            if(local.contains(".")) {
                sb.setLength(0);
                for(String i : local.split("\\.")) {
                    sb.append(i);
                }
                local = sb.toString();
            }

            if(!map.containsKey(domain)) {
                map.put(domain, new ArrayList<>());
            } else if(map.get(domain).contains(local)) {
                continue;
            }
            map.get(domain).add(local);

            result++;
        }

        return result;
    }
}