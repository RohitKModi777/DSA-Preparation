/**** Leetcode -134 ***/
/*
1. Intuition (Problem ko kaise sochna hai?)
Humein circular route mein ek starting petrol pump find karna hai jahan se hum poora circle complete kar sakein.

Har station par:
- gas[i] = jitna petrol milta hai.
- cost[i] = next station tak jaane mein jitna petrol lagta hai.
*/

/*  Main observation:
Agar kisi station par pahunchne ke baad hamara petrol negative ho jaata hai (totalFuel < 0), toh hum apne current starting station se journey complete nahi kar sakte.
Lekin important greedy observation ye hai:
Agar hum station startIndex se i tak aaye aur beech mein petrol negative ho gaya, toh startIndex se lekar i tak koi bhi station valid starting point nahi ho sakta.
Isliye hum directly i + 1 se dobara start karte hain.
*/

/* 
  Approach –
Step 1: Check whether journey is possible
- Sabhi stations ka total petrol calculate karo.
- Sabhi stations ka total travel cost calculate karo.
- Agar totalGas < totalCost, toh journey impossible hai. Return -1.
Step 2: Find the starting station
- totalFuel current journey ka petrol track karega.
- startIndex possible starting station store karega.
- Har station par gas[i] - cost[i] add karo.
- Agar totalFuel < 0, toh current starting point invalid hai.
- startIndex = i + 1 karo aur totalFuel = 0 reset karo.
Step 3: Return startIndex.
  */


class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        // STEP 1: Check if completing the circular journey is possible.
        int totalGas = 0;
        int totalCost = 0;

        for (int g : gas) totalGas += g;
        for (int cg : cost) totalCost += cg;

        // If total petrol available < total petrol required,
        // completing the circle is impossible.
        if (totalGas < totalCost) return -1;

      
        int totalFuel = 0;  
        int startIndex = 0;

        for (int i = 0; i < gas.length; i++) {

            totalFuel += gas[i] - cost[i];
            if (totalFuel < 0) {
                startIndex = i + 1;
                totalFuel = 0;
            }
        }
        return startIndex;
    }
}
