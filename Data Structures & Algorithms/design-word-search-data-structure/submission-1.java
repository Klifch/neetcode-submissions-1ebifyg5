class WordDictionary {
    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode curr = root;
        int index = 0;
        for (char c : word.toCharArray()) {
            index = c - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new TrieNode();
            }
            curr = curr.children[index];
        }
        curr.isWord = true;
    }

    public boolean search(String word) {
        return isDotWord(word, root, 0);
    }

    private boolean isDotWord(String word, TrieNode node, int ind) {
        TrieNode curr = node;

        for (int i = ind; i < word.length(); i++) {
            char c = word.charAt(i);

            if (c == '.') {
                for(TrieNode child : curr.children) {
                    if (child != null && isDotWord(word, child, i + 1)) {
                        return true;
                    }
                }
                return false;
            } else {
                if (curr.children[c - 'a'] == null) {
                    return false;
                }
                curr = curr.children[c - 'a'];
            }
        }
        return curr.isWord;
    }
}

class TrieNode {
    boolean isWord;
    TrieNode[] children = new TrieNode[26];
}
