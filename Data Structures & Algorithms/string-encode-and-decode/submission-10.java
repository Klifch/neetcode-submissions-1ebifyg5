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

        int i = 0;

        while (i < str.length()) {
            int sepIndex = str.indexOf("#", i);
            int len = Integer.parseInt(str.substring(i, sepIndex));
            i = sepIndex + 1 + len;
            result.add(str.substring(sepIndex + 1, i));
        }

        return result;
    }
}
