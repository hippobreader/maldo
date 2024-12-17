def main():
    prices = {}
    while True:
        display_menu()
        choice = input("Enter your choice: ")

        if choice == "1":
            display_all(prices)
        elif choice == "2":
            add_fruit(prices)
        elif choice == "3":
            search_fruit(prices)
        elif choice == "4":
            print("Exiting the Fruit Prices Program. Goodbye!")
            break
        else:
            print("Invalid choice. Please try again.")

def display_menu():
    print("\nWelcome to the Fruit Prices Program!")
    print("1. Display all fruits and prices")
    print("2. Add a new fruit")
    print("3. Search for a fruit's price")
    print("4. Exit")

def add_fruit(prices):
    fruit = input("Enter the fruit name: ").capitalize()
    price = float(input("Enter the price: "))
    prices[fruit] = price
    print(f"'{fruit}: {price}' has been added.")

def search_fruit(prices):
    fruit = input("Enter the fruit name to search: ").capitalize()
    if fruit in prices:
        print(f"The price of {fruit} is {prices[fruit]}.")
    else:
        print(f"{fruit} is not in the list.")

def display_all(prices):
    if prices:
        print("\nFruit Prices:")
        for fruit, price in prices.items():
            print(f"{fruit}: {price}")
    else:
        print("No fruits available.")

main()
