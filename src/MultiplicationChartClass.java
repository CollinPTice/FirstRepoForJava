public class MultiplicationChartClass implements MultiplicationChartInterface {


    private int numTemp;
    private int count;

    public MultiplicationChartClass(int num)
    {
        numTemp = num;

    }

    @Override
    public void displayChart() {

        count = 0;

        System.out.print(" X |   ");
        for(int y = 1; y <= numTemp; y++)
        {
            if(y >= 9)
                System.out.print(y + "  ");

            else
                System.out.print(y + "   ");
        }
        System.out.println();

        System.out.print("---|");
        for(int y = 1; y <= numTemp; y++)
        {
            System.out.print("----");
        }
        System.out.println();

        for(int i = 1; i <= numTemp; i++)
            {
                if(i < 10)
                    System.out.print(" " + i +" |");

                else
                    System.out.print(i + " |");

                for(int x = 1; x <= numTemp ; x++)
                {
                    int result = 0;
                    result = (i)*(x);

                    if(result >= 100)
                        System.out.print(" " + result);

                    else if (result >= 10)
                        System.out.print("  " + result);

                    else
                        System.out.print("   " + result);

                    count++;
                    if(count == numTemp)
                    {
                        System.out.println();
                        count = 0;
                    }
                }
            }

    }
}
