package leetcode.tree;

public class Trie {
  String word = null;
  Trie[] children;

  public Trie() {
    this.children = new Trie[26];
  }

  /**
   * Inserts a word into the trie.
   */
  public void insert(String word) {
    Trie node = this;
    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      if (node.children[ch - 'a'] == null) {
        node.children[ch - 'a'] = new Trie();
      }
      node = node.children[ch - 'a'];
    }
    node.word = word;
  }

  /**
   * Returns if the word is in the trie.
   */
  public boolean search(String word) {
    Trie node = this;

    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      if (node.children[ch - 'a'] == null) {
        return false;
      }
      node = node.children[ch - 'a'];
    }

    return node.word != null;
  }

  /**
   * Returns if there is any word in the trie that starts with the given prefix.
   */
  public boolean startsWith(String prefix) {
    Trie node = this;
    for (int i = 0; i < prefix.length(); i++) {
      char ch = prefix.charAt(i);
      node = node.children[ch - 'a'];
      if (node == null)
        return false;
    }


    if (node.word != null)
      return true;

    for (Trie t : node.children) {
      if (t != null)
        return true;
    }

    return false;
  }
}
