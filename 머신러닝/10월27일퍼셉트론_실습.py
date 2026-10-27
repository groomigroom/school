def AND_gate(x1, x2):
    w1 = 0.5
    w2 = 0.5
    b = -0.7
    result = x1*w1 + x2*w2 + b
    if result <= 0:
        return 0
    else:
        return 1
#and gate 
print(AND_gate(0, 0), AND_gate(0, 1), AND_gate(1, 0), AND_gate(1, 1))
