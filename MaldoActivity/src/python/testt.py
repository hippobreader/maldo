dict = {
    "Apple": {
        "Quantity" : 10,
        "Price" : 30
    }
}    
while True:
    print("\n1. List Available Items\n2. Add new item\n3. Update item stock\n4. Update item price\n5. Exit")
    choice = int(input("\nSelect number: "))
    print("\n")
    if choice == 1:
        for product, details in dict.items():
            print(f"\nProduct: {product} \nQuantity: {details['Quantity']}\nPrice: {details['Price']} " )
    elif choice == 2:
        while True:
            product = input("\nItem name: "). capitalize()
            if product not in dict.keys():
                quantity = input("\nItem Quantity: ")
                price = input("\nItem Price: ")
                dict[product] = {"Quantity" : quantity, "Price" : price}
                print("\nAdd successfully")
                break 
            else :
                print("\nItem Already Exist")    
    elif choice == 3:
        while True:
            product = input("\nItem Name: " ).capitalize()
            if product in dict.keys():
                dict[product]["Quantity"] = input("\nEnter Quantity: ")
                print("\nUpdate successfully")
                break
            else:
                print("\nItem not found")
    elif choice == 4:
        while True:
            product = input("\nItem Name: " ).capitalize()
            if product in dict.keys():
                dict[product]["Price"] = input("\nEnter Price: ")
                print("\nUpdate successfully")
                break
            else:
                print("\nItem not found")
    elif choice == 5:
        print("\nGood bye Godbless 🙂")
        break