stuff = {'rope':1,'torch':6,'gold coin':42,'dagger':1,'arrow':12}
dragonloot = ['gold coin','torch','rope','dagger','sword','emerald']
def addInventory(inv,newItems):
    print("Inventory")
    item_total = 0
    for i in newItems():
        for k,v in inv.items():
            if(k==i):
                v+=1
def displayInventory(inv):
    #code
    print("Inventory")
    item_total = 0
    for k,v in inv.items():
        print(str(v)+' '+k)
        item_total+=v
    print("Total number of items: " + str(item_total))

addInventory(stuff,dragonloot)