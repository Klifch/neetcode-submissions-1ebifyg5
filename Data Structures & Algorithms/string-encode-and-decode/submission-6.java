class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        
        for (String s : strs) {
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        char[] charArr = str.toCharArray();
        int counter = 0;
        Integer lenSub = 0;

        for (int i = 0; i < charArr.length; i++) {
            counter = 0;
            while (charArr[i] != '#') {
                counter++;
                i++;
            }
            lenSub = Integer.parseInt(str.substring(i - counter, i));
            i++;

            result.add(str.substring(i, i + lenSub));
            i += lenSub - 1;
        }

        return result;
    }
}
