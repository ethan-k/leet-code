package leetcode.backtracking;

import java.util.*;

class Trie {

  Trie[] children;
  String word;

  Trie() {
    this.children = new Trie[26];
  }
}

class AddAndSearchWord {

  /**
   * Initialize your data structure here.
   */

  Trie root;

  public AddAndSearchWord() {
    root = new Trie();
  }

  /**
   * Adds a word into the data structure.
   */
  public void addWord(String word) {
    Trie cur = root;
    for (int i = 0; i < word.length(); i++) {
      if (cur.children[word.charAt(i) - 'a'] == null) {
        cur.children[word.charAt(i) - 'a'] = new Trie();
      }
      cur = cur.children[word.charAt(i) - 'a'];
    }
    cur.word = word;
  }

  /**
   * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
   */
  public boolean search(String word) {

    Trie search = root;
    Queue<Trie> q = new LinkedList<>();
    q.offer(root);

    return search(q, 0, word);
  }

  public boolean search(Queue<Trie> q, int cur, String word) {

    if (cur == word.length()) {
      while (!q.isEmpty()) {
        if (q.poll().word != null)
          return true;
      }
      return false;
    }

    Queue<Trie> tmp = new LinkedList<>();
    while (!q.isEmpty()) {
      Trie curT = q.poll();
      if (word.charAt(cur) == '.') {
        for (Trie t : curT.children) {
          if (t != null) {
            tmp.add(t);
          }
        }
      } else if (curT.children[word.charAt(cur) - 'a'] != null) {
        tmp.add(curT.children[word.charAt(cur) - 'a']);
      }
    }

    if (!tmp.isEmpty())
      return search(tmp, cur + 1, word);


    return false;
  }
}