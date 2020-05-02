# 表达式太长时会炸掉
try:
    print(eval(input())%10000)
except Exception:
    print(0)
