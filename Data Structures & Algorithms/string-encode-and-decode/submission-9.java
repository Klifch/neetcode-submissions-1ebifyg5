class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length()).append("#").append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder(str);

        int i = 0;

        while (i < sb.length()) {
            int sepIndex = sb.indexOf("#", i);
            int len = Integer.parseInt(sb.substring(i, sepIndex));
            i = sepIndex + 1 + len;
            result.add(sb.substring(sepIndex + 1, i));
        }

        return result;
    }
}
