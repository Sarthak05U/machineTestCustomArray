public class DynamicArray <T>{
    private static int defaultSize =8;
    private T [] array ;
    private T [] newArray;
    private int noOfElements;

    DynamicArray() {
        array = (T[]) new Object[defaultSize];
    }

    public void addElements(T []newElements){
        if(newElements.length >= array.length || newElements.length > ((array.length)-noOfElements)){
                newArray =(T[]) new Object[defaultSize*2];
            defaultSize=defaultSize*2;
                for(int i=0;i<newElements.length;i++){
                    newArray[i] = newElements[i];
                    noOfElements++;
                }
                array = newArray;
        }
        else {
            for (int i = 0; i < newElements.length; i++) {
                array[i] = newElements[i];
                noOfElements++;
            }
        }
    }

    public boolean removeElements(int index){
        if(index > array.length){
            throw new IndexOutOfBoundsException("Index is out of bound for array");
        }
        array[index]=null;
        for(int i=index;i<noOfElements;i++){
            array[i] = array[i+1];
            noOfElements--;
        }
        if(noOfElements <= (1/4)*(array.length)){
            newArray = (T[]) new Object[defaultSize /2];
            for(int i=0;i < newArray.length;i++){
                newArray[i] = array[i];
            }
            array = newArray;
            defaultSize = defaultSize /2;
        }
        return true;
    }

    public void display(){
        int i=0;
        while(array[i] != null){
            System.out.println(array[i]+"\t");
            i++;
        }
    }

    public T getElement(int index){
        if(index > array.length){
            throw new IndexOutOfBoundsException("Index is out of bound for array");
        }
        return (array[index]);
    }

    public int getSize(){
        return noOfElements;
    }
}
