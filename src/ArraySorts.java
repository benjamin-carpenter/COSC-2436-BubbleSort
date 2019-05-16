import java.util.Arrays;

public class ArraySorts {

    private int _array[];
    /*Method initializes ArraySorts
     * @param int array[]
     * @return nothing
     * @throws Nothing is implemented
     * O(n)=c
     */
    public ArraySorts(int array[]){
        _array = array;
    }
    /*Method This is the bubble sort method used to order numbers from lowest to highest
     * @param int length
     * @return returns the number of time the sorry algorithm compared entrys
     * @throws Nothing is implemented
     * O(n)=nlog n
     */
    public int bubbleSort(int length){
        int b,t;
        int n = length;
        int itemsSorted =0;
        int swaps=0, comparison=0;
        boolean flip = false;

        //best n worst is nlog n
        do {
             flip = false;
            for (b = n-1, t=n-2; t>=itemsSorted;b--,t--){
                if(_array[b] < _array[t]){//compares elements
                    int c = _array[b];
                    int f = _array[t];
                    _array[b] = f;
                    _array[t] = c;
                swaps++;
                flip= true;
                }
                comparison ++;
            }
        }while  (flip == true && itemsSorted != n-1);

        System.out.println("There where "+comparison+" comparisons made, and "+swaps+" swaps made.");
        System.out.println(Arrays.toString(_array));


    return comparison;
    }


}


