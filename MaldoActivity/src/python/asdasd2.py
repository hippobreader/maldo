import tkinter as tk

def show_entry_fields():
    # Show the input fields for item and amount
    item_label.pack(pady=5)
    item_entry.pack(pady=5)
    amount_label.pack(pady=5)
    amount_entry.pack(pady=5)
    submit_button.pack(pady=5)

def add_expense():
    item = item_entry.get()
    amount = amount_entry.get()
    
    if item and amount.replace('.', '', 1).isdigit():  # Check if amount is a valid number
        expenses[item] = float(amount)
        result_label.config(text="Expense added successfully!")
        item_entry.delete(0, tk.END)  # Clear the entry field
        amount_entry.delete(0, tk.END)  # Clear the entry field
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

# Main application
expenses = {}
root = tk.Tk()
root.title("Simple Expense Tracker")

# Labels and Entry fields (initially hidden)
item_label = tk.Label(root, text="Item:")
item_entry = tk.Entry(root)
amount_label = tk.Label(root, text="Amount:")
amount_entry = tk.Entry(root)

# Buttons
tk.Button(root, text="Add Expense", command=show_entry_fields).pack(pady=5)
submit_button = tk.Button(root, text="Submit Expense", command=add_expense)  # Submit button for adding expense
tk.Button(root, text="View Expenses", command=view_expenses).pack(pady=5)
tk.Button(root, text="View Total Expenses", command=view_total_expenses).pack(pady=5)
tk.Button(root, text="Clear", command=clear_result).pack(pady=5)
tk.Button(root, text="Exit", command=root.quit).pack(pady=5)

# Result label
result_label = tk.Label(root, text="", wraplength=300)
result_label.pack(pady=10)

root.mainloop()