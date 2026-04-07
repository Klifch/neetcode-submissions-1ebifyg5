class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int aim = 0;
        int l = 0;
        int total = 0;
        int[] comp = new int[26];
        int[] freq = new int[26];

        for (char ch : s1.toCharArray()) {
            aim += ch;
            comp[ch - 'a']++;
        }

        System.out.println(aim);

        for (int r = 0; r < s2.length(); r++) {
            System.out.println("Processing r val = " + s2.charAt(r) + " At index + " + r + " Total before: " + total);
            total += s2.charAt(r);
            freq[s2.charAt(r) - 'a']++;
            // store.put(r, (r > 0 ? store.get(r - 1).add(s2.charAt(r)) : new HashSet(s2.charAt(r))));
            System.out.println("Total after = " + total);

            if (r - l + 1 > s1.length()) {
                total -= s2.charAt(l);
                freq[s2.charAt(l) - 'a']--;
                System.out.println("Check on size worked, total after subst of old l = " + total);
                System.out.println("Check on size worked, moving l from index = " + l);
                l++;
                System.out.println("To index l = " + l);
            }

            if (total == aim && Arrays.equals(comp, freq)) {
                System.out.println("total == aim check worked total = " + total + " at l = " + l + " and r = " + r);
                return true;
            }
        }

        return false;
    }
}
