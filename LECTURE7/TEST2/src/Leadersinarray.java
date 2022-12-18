public class Leadersinarray {
    public static void leaders(int[] input){
        for (int i = 0; i < input.length; i++)
        {
            for (int j = i; j < input.length; j++)
            {
                if (input[i] < input[j])
                {
                    break;
                }

                if (j == input.length- 1)
                    System.out.println(input[i]+" ");
            }
        }

    }
}
