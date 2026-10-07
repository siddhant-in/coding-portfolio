public class StringTransformer 
{
    public static void main(String[] args) {
        String input = "RS3L2";
        String output = transformString(input);
        System.out.println("Output: " + output);
    }

    public static String transformString(String input) 
	{
        char[] chars = input.toCharArray();
        char[] result = new char[100]; // Assuming max length
        int resultIndex = 0;
        char[] temp = new char[100]; // Temporary storage
        int tempIndex = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                int repeat = chars[i] - '0';
				
                for (int r = 0; r < repeat; r++) {
                    for (int j = 0; j < tempIndex; j++) {
                        result[resultIndex++] = temp[j];
                    }
                }
                tempIndex = 0; // Reset temp storage
            } else {
                temp[tempIndex++] = chars[i];
            }
        }
        for (int j = 0; j < tempIndex; j++) {
            result[resultIndex++] = temp[j];
        }
        return new String(result, 0, resultIndex);
    }
}
