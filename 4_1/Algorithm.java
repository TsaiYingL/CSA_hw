public class Algorithm {
    public static int digitCounter(int num)
    {
        int i = 0;
        int count = num;
        while (count!=0)
        {
            count /= 10;
            i++;
        }
        return i;
    }

    public static boolean divisible(int num1, int num2)
    {
        while (num1 > 0)
        {
            if (num1<num2)
            {
                return false;
            }
            num1 -=num2;
        }
        return true;
    }

    public static int oddSum(int min, int max)
    {
        int sum = 0;
        for (int i = min; i <= max; i++)
        {
            if (i % 2 == 1)
            {
                sum += i;
            }
        }
        return sum;
    }

    public static int multipleOfTen(int min, int max)
    {
        int sum = 0;
        for(int i = min; i <= max; i++)
        {
            if (i % 10 == 0)
            {
                sum += i;
            }
        }
        return sum;
    }

    public static int digitSum(int num)
    {
        int i = 0;
        while (num != 0)
        {
            i += num%10;
            num /=10;
        }
        return i;
    }

    public static int powerTwo(int num)
    {
        int i = 0;
        int twoToPower = 0;
        while(Math.pow(2,i)<=num)
        {
            twoToPower = (int)Math.pow(2,i);
            i++;
        }
        return twoToPower;
    }

    public static int countEven(int num)
    {
        int i = 0;
        while (num > 0)
        {
            if ((num%10)%2 == 0)
            {
                i++;
            }
            num /= 10;
        }
        return i;
    }

    public static int onesDigit(int num)
    {
        return num%10;
    }

    public static int deleteOnesDigit(int num)
    {
        return num/10;
    }
}