
public class SelectionSearch_10
{
    public static int search(int arr[], int item)
    {
        for (int i=0; i<=arr.length;i++)
        {
            if(arr[i]==item)
            {
                return (i);
            } 
        }
        return 0;
    }
    public static void main()
    {
        int arr[]={10,2,3,4,5,6,7,8,9,11};
        int item =11;
        int result = search(arr,item);
        if (result == 0)
        {
            System.out.println("Item not found in the list");            
        }
        else 
        {
            System.out.println("Item found at "+result+" index" ); 
        }
    }
}
