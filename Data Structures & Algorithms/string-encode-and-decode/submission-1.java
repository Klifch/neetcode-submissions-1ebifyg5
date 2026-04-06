class Solution {

    public String encode(List<String> strs) {
        char sep = '%';
        String result = "";
        for (String str : strs) {
            result += "" + str.length() + "" + sep + str;
        }

        return result;
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        char[] arr = str.toCharArray();
        System.out.println(str);


        for (int i = 0; i < str.length(); i++) {
            String len = "";
            if (Character.isDigit(arr[i])) {
                while (arr[i] != '%') {
                    len += arr[i];
                    i++;
                }
                if (arr[i] == '%') {
                    i++;
                    res.add(str.substring(i, i + Integer.valueOf(len)));
                    i += Integer.valueOf(len) - 1;
                }

                len = "";
            }
        }

        return res;
    }
}
