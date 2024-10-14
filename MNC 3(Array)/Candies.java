/*1)
Problem Statement –A chocolate factory is packing chocolates into the packets. The
chocolate packets here represent an array of N number of integer values. The task is to find
the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).
Example 1 :
N=8 and arr = [4,5,0,1,9,0,5,0] There are 3 empty packets in the given set. These 3 empty
packets represented as O should be pushed towards the end of the array
Input :
8 – Value of N
[4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by
newline
Output:
4 5 1 9 5 0 0 0*/



/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		    System.out.println("Enetr the value");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < N) {
            arr[count++] = 0;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
*/

/*
/*2)
Given an integer array Arr of size N the task is to find the count of elements whose value is
greater than all of its prior elements.
Note : 1st element of the array should be considered in the count of the result.
For example,
Arr[]={7,4,8,2,9}
As 7 is the first element, it will consider in the result.
8 and 9 are also the elements that are greater than all of its previous elements.
Since total of 3 elements is present in the array that meets the condition.
Hence the output = 3.
Example 1:
Input
5 -> Value of N, represents size of Arr
7-> Value of Arr[0]
4 -> Value of Arr[1]
8-> Value of Arr[2]
2-> Value of Arr[3]
9-> Value of Arr[4]
Output :
3
Example 2:
5 -> Value of N, represents size of Arr
3 -> Value of Arr[0]
4 -> Value of Arr[1]
5 -> Value of Arr[2]
8 -> Value of Arr[3]
9 -> Value of Arr[4]
Output :
5*/




/*import java.util.Scanner;
public class IntegerArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		        System.out.println("Enetr the value");

        int N = sc.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        int count = 1;  
        int max = arr[0];
        
        for (int i = 1; i < N; i++) {
            if (arr[i] > max) {
                count++;
                max = arr[i];
            }
        }
        
        System.out.println(count);
    }
}


/*3)
An intelligence agency has received reports about some threats. The reports consist of
numbers in a mysterious method. There is a number “N” and another number “R”. Those
numbers are studied thoroughly and it is concluded that all digits of the number ‘N’ are
summed up and this action is performed ‘R’ number of times. The resultant is also a single
digit that is yet to be deciphered. The task here is to find the single-digit sum of the given
number ‘N’ by repeating the action ‘R’ number of times.
If the value of ‘R’ is 0, print the output as ‘0’.
Example 1:
Input :
99 -> Value of N
3 -> Value of R
Output :
9 -> Possible ways to fill the cistern.
Explanation:
Here, the number N=99
1)Sum of the digits N: 9+9 = 18
2)Repeat step 2 ‘R’ times i.e. 3 tims (9+9)+(9+9)+(9+9) = 18+18+18 =54
3)Add digits of 54 as we need a single digit 5+4
Hence , the output is 9.
Example 2:
Input :
1234 -> Value of N
2 -> Value of R
Output :
2 -> Possible ways to fill the cistern
Explanation:
Here, the number N=1234
1)Sum of the digits of N: 1+2+3+4 =10
2)Repeat step 2 ‘R’ times i.e. 2 times (1+2+3+4)+(1+2+3+4)= 10+10=20
3)Add digits of 20 as we need a single digit. 2+0=2
Hence, the output is 2.
Constraints:
0<N<=1000
0<=R<=50
The Input format for testing
The candidate has to write the code to accept 2 input(s)
First input- Accept value for N (positive integer number)
Second input: Accept value for R(Positive integer number)
The output format for testing
The output should be a positive integer number or print the message (if any) given in the
problem statement. (Check the output in Example 1, Example 2).*/

/*import java.util.Scanner;
public class Main {
    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		        System.out.println("Enetr the value");
        int N = sc.nextInt();
        int R = sc.nextInt();
        if (R == 0) {
            System.out.println(0);
            return;
        }
        int digitSum = sumDigits(N);
        int result = digitSum * R;
        while (result > 9) {
            result = sumDigits(result);
        }
        System.out.println(result);
    }
} 


/*4)Problem Statement
Particulate matters are the biggest contributors to Delhi pollution. The main reason behind
the increase in the concentration of PMs include vehicle emission by applying Odd Even
concept for all types of vehicles. The vehicles with the odd last digit in the registration
number will be allowed on roads on odd dates and those with even last digit will on even
dates.
Given an integer array a[], contains the last digit of the registration number of N vehicles
traveling on date D(a positive integer). The task is to calculate the total fine collected by the
traffic police department from the vehicles violating the rules.
Note : For violating the rule, vehicles would be fined as X Rs.
Example 1:
Input :
4 -> Value of N
{5,2,3,7} -> a[], Elements a[0] to a[N-1], during input each element is separated by a new line
12 -> Value of D, i.e. date
200 -> Value of x i.e. fine
Output :
600 -> total fine collected
Explanation:
Date D=12 means , only an even number of vehicles are allowed.
Find will be collected from 5,3 and 7 with an amount of 200 each.
Hence, the output = 600.
Example 2:
Input :
5 -> Value of N
{2,5,1,6,8} -> a[], elements a[0] to a[N-1], during input each element is separated by new
line
3 -> Value of D i.e. date
300 -> Value of X i.e. fine
Output :
900 -> total fine collected
Explanation:
Date D=3 means only odd number vehicles with are allowed.
Find will be collected from 2,6 and 8 with an amount of 300 each.
Hence, the output = 900
Constraints:
->0<N<=100
->1<=a[i]<=9
->1<=D <=30
->100<=x<=5000
The input format for testing
The candidate has to write the code to accept 4 input(s).
First input – Accept for N(Positive integer) values (a[]), where each value is separated by a
new line.
Third input – Accept value for D(Positive integer)
Fourth input – Accept value for X(Positive integer )
The output format for testing
The output should be a positive integer number (Check the output in Example 1, Example e)
if no fine is collected then print ”0”*/


/*import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		        System.out.println("Enetr the value");

        int N = sc.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        int D = sc.nextInt();
        int fine = sc.nextInt();
        
        int totalFine = 0;
        for (int i = 0; i < N; i++) {
            if ((D % 2 == 0 && arr[i] % 2 != 0) || (D % 2 != 0 && arr[i] % 2 == 0)) {
                totalFine += fine;
            }
        }
        
        System.out.println(totalFine);
    }
}


/*5)Problem Statement – An automobile company manufactures both a two wheeler (TW) and a
four wheeler (FW). A company manager wants to make the production of both types of
vehicle according to the given data below:
a)1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
b)2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as
per the given data.
Example :
Input :
200 -> Value of V
540 -> Value of W
Output :
TW =130 FW=70
Explanation:
130+70 = 200 vehicles
(70*4)+(130*2)= 540 wheels
Constraints :
a)2<=W
b)W%2=0
c)V<W
Print “INVALID INPUT” , if inputs did not meet the constraints.
The input format for testing
The candidate has to write the code to accept two positive numbers separated by a new line.
a)First Input line – Accept value of V.
b)Second Input line- Accept value for W.
*/

/*import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		        System.out.println("Enetr the value");

        int V = sc.nextInt();  
        int W = sc.nextInt();  
        
        if (W % 2 != 0 || V > W || 2 * V > W) {
            System.out.println("INVALID INPUT");
            return;
        }
        
        int FW = (W - 2 * V) / 2;
        int TW = V - FW;
        
        System.out.println("TW =" + TW + " FW=" + FW);
    }
}


/*6)There is a JAR full of candies for sale at a mall counter. JAR has the capacity N, that is JAR
can contain maximum N candies when JAR is full. At any point of time. JAR can have M
number of Candies where M<=N. Candies are served to the customers. JAR is never remain
empty as when last k candies are left. JAR if refilled with new candies in such a way that
JAR get full.
Write a code to implement above scenario. Display JAR at counter with available number of
candies. Input should be the number of candies one customer can order at point of time.
Update the JAR after each purchase and display JAR at Counter.
Output should give number of Candies sold and updated number of Candies in JAR.
If Input is more than candies in JAR, return: “INVALID INPUT”
Given,
N=10, where N is NUMBER OF CANDIES AVAILABLE
K =< 5, where k is number of minimum candies that must be inside JAR ever.
Example 1:(N = 10, k =< 5)
Input Value
3
Output Value
NUMBER OF CANDIES SOLD : 3
NUMBER OF CANDIES AVAILABLE : 7
Example : (N=10, k<=5)
Input Value
0
Output Value
INVALID INPUT NUMBER OF
CANDIES LEFT : 10*/



import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		        System.out.println("Enetr the value");

        int N = 10;  
        int M = N;   
        int k = 5;  
        
        int order = sc.nextInt();
        if (order < 1 || order > M) {
            System.out.println("invalid  : " + M);
        } else {
            M -= order;
            System.out.println("number of candy sold : " + order);
            System.out.println("number of candy available : " + M);
        }
    }
}


/*7)
A party has been organised on cruise. The party is organised for a limited time(T). The
number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as
elements of the array. The task is to find the maximum number of guests present on the
cruise at any given instance within T hours.
Example 1:
Input :
a)5 -> Value of T
b)[7,0,5,1,3] -> E[], Element of E[0] to E[N-1], where input each element is separated by
new line
c)[1,2,1,3,4] -> L[], Element of L[0] to L[N-1], while input each element is separate by new
line.
Output :
8 -> Maximum number of guests on cruise at an instance.
Explanation:
1st hour:
Entry : 7 Exit: 1
No. of guests on ship : 6
2nd hour :
Entry : 0 Exit : 2
No. of guests on ship : 6-2=4
Hour 3:
Entry: 5 Exit: 1
No. of guests on ship : 4+5-1=8
Hour 4:
Entry : 1 Exit : 3
No. of guests on ship : 8+1-3=6
Hour 5:
Entry : 3 Exit: 4
No. of guests on ship: 6+3-4=5
Hence, the maximum number of guests within 5 hours is 8.
Example 2:
Input:
4 -> Value of T
[3,5,2,0] -> E[], Element of E[0] to E[N-1], where input each element is separated by new
line.
[0,2,4,4] -> L[], Element of L[0] to L[N-1], while input each element in separated by new line
Output:
6
Cruise at an instance
Explanation:
Hour 1:
Entry: 3 Exit: 0
No. of guests on ship: 3
Hour 2:
Entry : 5 Exit : 2
No. of guest on ship: 3+5-2=6
Hour 3:
Entry : 2 Exit: 4
No. of guests on ship: 6+2-4= 4
Hour 4:
Entry: 0 Exit : 4
No. of guests on ship : 4+0-4=0
Hence, the maximum number of guests within 5 hours is 6.
The input format for testing
The candidate has to write the code to accept 3 input.
First input- Accept value for number of T(Positive integer number)
Second input- Accept T number of values, where each value is separated by a new line.
Third input- Accept T number of values, where each value is separated by a new line.
The output format for testing
The output should be a positive integer number or a message as given in the problem
statement(Check the output in Example 1 and Example 2)
Constraints:
a)1<=T<=25
b)0<= E[i] <=500
c)0<= L[i] <=500*/



/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		        System.out.println("Enetr the value");

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        int oddSum = 0, evenSum = 0;
        
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i]; 
            } else {
                oddSum += arr[i];   
            }
        }
        
        int absDiff = Math.abs(oddSum - evenSum);
        System.out.println(absDiff);
    }
}



/*8)Problem Statement
We want to estimate the cost of painting a property. Interior wall painting cost is Rs.18 per
sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.
Take input as
1. Number of Interior walls
2. Number of Exterior walls
3. Surface Area of each Interior 4. Wall in units of square feet
Surface Area of each Exterior Wall in units of square feet
If a user enters zero as the number of walls then skip Surface area values as User may
don’t want to paint that wall.
Calculate and display the total cost of painting the property
Example 1:
6
3
12.3
15.2
12.3
15.2
12.3
15.2
10.10
10.10
10.00
Total estimated Cost : 1847.4 INR
Note: Follow in input and output format as given in above example*/



/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		        System.out.println("Enetr the value");


        int N = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        boolean areSame = true;

        for (int i = 0; i < N; i++) {
            if (A[i] != B[i]) {
                areSame = false;
                break;
            }
        }
        if (areSame) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}



/*9)
Problem Statement
We want to estimate the cost of painting a property. Interior wall painting cost is Rs.18 per
sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.
Take input as
1. Number of Interior walls
2. Number of Exterior walls
3. Surface Area of each Interior 4. Wall in units of square feet
Surface Area of each Exterior Wall in units of square feet
If a user enters zero as the number of walls then skip Surface area values as User may
don’t want to paint that wall.
Calculate and display the total cost of painting the property
Example 1:
6
3
12.3
15.2
12.3
15.2
12.3
15.2
10.10

10.10
10.00
Total estimated Cost : 1847.4 INR
Note: Follow in input and output format as given in above exampl*/



/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		        System.out.println("Enetr the value");

        int N = sc.nextInt();
        int[] Arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            Arr[i] = sc.nextInt();
        }
        
        int maxPower = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            while (Arr[i] % 2 == 0 && Arr[i] > 0) {
                Arr[i] /= 2;
                count++;
            }
            maxPower = Math.max(maxPower, count);
        }
        
        System.out.println(maxPower);
    }
}


/*10)
Ques. Write a code to check whether no is prime or not. Condition use function check() to
find whether entered no is positive or negative ,if negative then enter the no, And if yes pas
no as a parameter to prime() and check whether no is prime or not?
a)Whether the number is positive or not, if it is negative then print the message “please enter
the positive number”
b)It is positive then call the function prime and check whether the take positive number is
prime or not.
*/


/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		        System.out.println("Enetr the value");

        int N = sc.nextInt();
        int[] Arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            Arr[i] = sc.nextInt();
        }
        
        int X = sc.nextInt();
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            if (Arr[i] == X) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
*/