import tkinter as tk

def show_entry_fields():
    # Show the input fields for item and amount
    item_label.pack(pady=5)
    item_entry.pack(pady=5)
    amount_label.pack(pady=5)
    amount_entry.pack(pady=5)
    submit_button.pack(pady=5)  # Show submit button

def hide_add():
    # Hide the label, entry box, and button after submitting
    item_label.pack_forget()
    item_entry.pack_forget()
    amount_label.pack_forget()
    amount_entry.pack_forget()
    submit_button.pack_forget()
    
    

def add_expense():
    show_entry_fields()
    item = item_entry.get().capitalize()
    amount = amount_entry.get()
    if item and amount.replace('.', '', 1).isdigit():  # Check if amount is a valid number
        expenses[item] = float(amount)  # Store the expense in the dictionary
        result_label.config(text=f"Expense '{item}' added successfully!")
        item_entry.delete(0, tk.END)  # Clear the entry field
        amount_entry.delete(0, tk.END)
        hide_add()
    else:
        result_label.config(text="Invalid input. Please enter a valid item and amount.")
        hide_add()
def hide_del():
        item_to_del.pack_forget()
        delete_entry.pack_forget()
        delete_button_submit.pack_forget()

def delete_expense_button():
    view_expenses()
    item_to_del.pack(pady=5)
    delete_entry.pack(pady=5)
    delete_button_submit.pack(pady=5)
    
def delete_expense():
    delete_expense_button()    
    item = delete_entry.get().capitalize() 
    if item in expenses.keys():
        del expenses[item]  # Remove the item from the dictionary
        result_label.config(text=f"Expense '{item}' deleted successfully!")
        delete_entry.delete(0, tk.END)  # Clear the entry field
        hide_del()
    else:
        result_label.config(text=f"Item '{item}' not found.")
        hide_del()

def view_expenses():
    if expenses:
        expenses_list = "\n".join([f"{item}: ₱{amount:.2f}" for item, amount in expenses.items()])
        result_label.config(text=expenses_list)
    else:
        result_label.config(text="No expenses recorded.")

def view_total_expenses():
    total = sum(expenses.values())
    result_label.config(text=f"Total Expenses: ₱{total:.2f}")

# Main application
expenses = {}  # Dictionary to store expenses
root = tk.Tk()
root.title("Expense Tracker")
root.geometry("300x400")

# Labels and Entry fields (initially hidden)
item_label = tk.Label(root, text="Item:")
item_entry = tk.Entry(root)
amount_label = tk.Label(root, text="Amount:")
amount_entry = tk.Entry(root)
item_to_del = tk.Label(root, text="Select Item to Delete:")
delete_entry = tk.Entry(root)

# Buttons
tk.Button(root, text="Add Expense", command=show_entry_fields).pack(pady=5)
submit_button = tk.Button(root, text="Submit Expense", command=add_expense)  # Submit button for adding expense
tk.Button(root, text="View Expenses", command=view_expenses).pack(pady=5)
tk.Button(root, text="View Total Expenses", command=view_total_expenses).pack(pady=5)
tk.Button(root, text="Delete Expense", command=delete_expense_button).pack(pady=5)
delete_button_submit = tk.Button(root, text="Delete Expense", command=delete_expense) # Button to delete expense
tk.Button(root, text="Exit", command=root.quit).pack(pady=5)

# Result label
result_label = tk.Label(root, text="", wraplength=300)
result_label.pack(pady=10)

root.mainloop()
