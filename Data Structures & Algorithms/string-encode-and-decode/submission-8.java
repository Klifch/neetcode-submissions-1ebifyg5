class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length()).append('#').append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {

        StringBuilder sb = new StringBuilder(str);
        List<String> result = new ArrayList<>();

        while (sb.length() != 0) {
            int sepIndex = sb.indexOf("#");
            int len = Integer.parseInt(sb.substring(0, sepIndex));

            result.add(sb.substring(sepIndex + 1, sepIndex + 1 + len));
            sb.delete(0, sepIndex + 1 + len);
        }

        return result;
    }
}
