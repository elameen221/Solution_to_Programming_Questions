def find_char_NN(string1, string2):
    ret = ""
    for c in string1:
        for cc in string2:
            if c == cc:
                ret += c
                break
    return ret
    
def find_char_N(string1, string2):
    ret = ""
    infoset = set(list(tring2))
    for c in string1:
        if c in infoset:
            ret += c
    return ret
    
