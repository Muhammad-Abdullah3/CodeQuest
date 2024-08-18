def spam():
    eggs = 'spam local'
    print(eggs) #Prints 'spam local'
def bacon():
    eggs = 'bacons local'
    print(eggs) # prints 'bacons local'
    spam() # Prints 'spam local'
    print(eggs) # Prints 'bacon local'
eggs = 'global'
bacon()
print(eggs)