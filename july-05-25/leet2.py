class Solution:
    def concatHex36(self, n: int) -> str:
        l= n ** 2
        m = n ** 3

        hexp = hex(l)[2:].upper()

        ba = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        baz = ""
        num = m
        if num == 0:
            baz= "0"
        else:
            while num > 0:
                baz = ba[num % 36]+ baz
                num //= 36

        return hexp+baz©leetcode