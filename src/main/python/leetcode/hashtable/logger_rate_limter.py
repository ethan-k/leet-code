class Logger:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.tracker = {}

    def shouldPrintMessage(self, timestamp: int, message: str) -> bool:

        if message not in self.tracker:
            self.tracker[message] = timestamp
            return True
        else:
            if timestamp - self.tracker[message] >= 10:
                self.tracker[message] = timestamp
                return True
            return False
