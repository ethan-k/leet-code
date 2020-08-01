package leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

public class LoggerRateLimiter {
  /**
   * Initialize your data structure here.
   */
  Map<String, Integer> timeTracker = new HashMap<>();

  public LoggerRateLimiter() {

  }

  /**
   * Returns true if the message should be printed in the given timestamp, otherwise returns false.
   * If this method returns false, the message will not be printed.
   * The timestamp is in seconds granularity.
   */
  public boolean shouldPrintMessage(int timestamp, String message) {
    if (!timeTracker.containsKey(message)) {
      timeTracker.put(message, timestamp);
      return true;
    } else {
      int lastLoggedTime = timeTracker.get(message);
      if (timestamp - lastLoggedTime >= 10) {
        timeTracker.put(message, timestamp);
        return true;
      }
      return false;
    }
  }
}
