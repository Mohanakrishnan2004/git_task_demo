class AddNumbers
{
    int add(int a, int b)
    {
        return a + b;
    }

    float add(float a, float b)
    {
        return a + b;
    }

    public static void main(String args[])
    {
        AddNumbers obj = new AddNumbers();

        int r1 = obj.add(5, 4);
        System.out.println("Sum: " + r1);

        float r2 = obj.add(3.5f, 10.2f);
        System.out.println("Sum: " + r2);

        float r3 = obj.add(8.0f, 9.5f);
        System.out.println("Sum: " + r3);
    }
}