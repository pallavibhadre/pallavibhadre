package assigment;

public class RemoveOccure {
	static final int a = 256;
    static int[] getCharCountArray(String str)
    
    {
        int count[] = new int[a];
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
 
        return count;}
    static String removeDirtyChars(String str, String str2) {
        int count[] = getCharCountArray(str2);
        int ip = 0, res = 0;
 
        char arr[] = str.toCharArray();
 
        while (ip != arr.length)
        {
            char temp = arr[ip];
            if (count[temp] == 0) {
                arr[res] = arr[ip];
                res++;
            }
            ip++;
        }
        str = new String(arr);
        return str.substring(0, res);
    }
    public static void main(String[] args)
    {
        String str = "It is a long established fact that reader will be distracted by readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and webpage editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many websites still in their infancy.";
        String str2 = "is";
        System.out.println(removeDirtyChars(str,str2));
    }
}

