

This classic kata guides you step by step through the implementation of a calculator that receives a `String` as input.
It is a good exercise on refactoring and incremental implementation. It is also a good candidate for practising TDD.

## First step 

Create a function `sum` that takes a `String` and returns a `String`:

    String sum(String number)

>* The method can take 0, 1 or 2 numbers separated by comma, and returns their sum.
>* An empty string will return "0".
>* Example of inputs: `""`, `"1"`,`"1,2"`, `"1.1,2.2"`.

## Second step

>* If the result end by "6" add 3000
>* Example : Input = `"142,34"` => output = `"3176"`
>* If the last 2 digits of the result are the same, multiple the result by 2
>* Examples :
>* * Input =  `"624,20"` => output = `"1288"`
>* * Input =  `"700"` => output = `"1400"`
>* * Input =  `"711,10000"` => output = `"21422"`

## Third step

>* Allow the sum method to handle new lines between numbers (instead of commas).

>* the following input is ok: "1\n2,4" (will equal 7)
>* the following input is NOT ok: "1,\n" (not need to prove it - just clarifying)

## Fourth step
>* Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2

## Sixth step (fifth step omitted)

>* Calling sum with negative numbers will return the message "Negative not allowed : " listing all negative numbers that were in the list of numbers.

>* "-1,2" is invalid and should return the message "Negative not allowed : -1"
>* "2,-4,-5" is invalid and should return the message "Negative not allowed : -4, -5"