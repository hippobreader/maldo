import tkinter as tk

def add_expense():
    
    tk.Label(root, text="Item:").pack(pady=5)
    item_entry = tk.Entry(root)
    item_entry.pack(pady=5)

    tk.Label(root, text="Amount:").pack(pady=5)
    amount_entry = tk.Entry(root)
    amount_entry.pack(pady=5)
    
    item = item_entry.get()
    amount = amount_entry.get()
    
    if item and amount.replace('.', '', 1).isdigit():  # Check if amount is a valid number
        expenses[item] = float(amount)
        result_label.config(text="Expense added successfully!")
        item_entry.delete(0, tk.END)  # Clear the entry field
        amount_entry.delete(0, tk.END)  # Clear the entry field
        submit_button = tk.Button(root, text="Submit Expense", command=lambda: submit_expense(item_entry.get(), amount_entry.get()))
        submit_button.pack(pady=5)
    else:
        result_label.config(text="Invalid input. Please enter a valid item and amount.")

def view_expenses():
    if expenses:
        expenses_list = "\n".join([f"{item}: ${amount:.2f}" for item, amount in expenses.items()])
        result_label.config(text=expenses_list)
    else:
        result_label.config(text="No expenses recorded.")

def view_total_expenses():
    total = sum(expenses.values())
    result_label.config(text=f"Total Expenses: ${total:.2f}")

def clear_result():
    result_label.config(text="")
    
def submit_expense(item, amount):
    # Logic to handle the submitted expense
    print(f"Item: {item}, Amount: {amount}")
# Main application
expenses = {}
root = tk.Tk()
root.title("Simple Expense Tracker")

# Input fields

# Buttons
tk.Button(root, text="Add Expense", command=add_expense).pack(pady=5)
tk.Button(root, text="View Expenses", command=view_expenses).pack(pady=5)
tk.Button(root, text="View Total Expenses", command=view_total_expenses).pack(pady=5)
tk.Button(root, text="Clear", command=clear_result).pack(pady=5)
tk.Button(root, text="Exit", command=root.quit).pack(pady=5)

# Result label
result_label = tk.Label(root, text="", wraplength=300)
result_label.pack(pady=10)

root.mainloop()