/**The wealth of each customer is:  
- Customer 1: `1 + 2 + 3 = 6`  
- Customer 2: `3 + 2 + 1 = 6`  
- Customer 3: `4 + 0 + 6 = 10`  

The richest customer has a wealth of **10**.  

---

## Approach
The program uses a **nested loop** to iterate through each customer's bank accounts and calculate their total wealth.  
- Outer loop: Iterates through customers.  
- Inner loop: Sums up the wealth for a specific customer across all banks.  

At each step, the maximum wealth is updated using the `Math.max()` function.

---

## Code Implementation
Here is the solution implemented in Java: **/


class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0; // Track the maximum wealth among all customers
        
        for (int customer = 0; customer < accounts.length; customer++) {
            int customerWealth = 0; // Sum of wealth for the current customer
            
            for (int bank = 0; bank < accounts[customer].length; bank++) {
                customerWealth += accounts[customer][bank]; // Add current bank's wealth
            }
            
            maxWealth = Math.max(maxWealth, customerWealth); // Update the maximum wealth
        }
        
        return maxWealth; // Return the richest customer's wealth
    }
}
