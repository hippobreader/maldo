dict = {}
def add():
    item = input("Enter Item: ").capitalize()
    price = int(input("Enter price: "))
    quantity = int(input("Enter quantity: "))
    dict[item] = {"Price":price,"Quantity":quantity}
    print("Item added")
def updateQuantity():
    item = input("Enter the item: ").capitalize()
    if item in dict.keys():
        newquan = int(input("Enter new quantity: "))
        dict[item]["Quantity"] = newquan
    else:
        print(f"{item} is not found")
def updatePrice():
    item = input("Enter the item: ").capitalize()
    if item in dict.keys():
        newpri = int(input("Enter new price: "))
        dict[item]["Price"] = newpri
    else:
        print(f"{item} is not found")
def display():
    if dict:
        for x, y in dict.items():
            print(f"Item: {x}\nQuantity: {y['Quantity']}\nPrice: {y['Price']}")
    else:
        print("No Items Available")
def exit():
    print("Good Bye") 
    
def main():
    while True:
        print("\n1. Add new item")
        print("2. Update quantity")
        print("3. Update price")
        print("4. Display all items")
        print("5. Exit")
        choice = int(input("Select number: "))
        print()
        if choice == 1:       
            add()
        elif choice == 2:
            updateQuantity()
        elif choice == 3:
            updatePrice()
        elif choice == 4:
            display()   
        elif choice == 5:
            exit()  
            break

main()