import java.util.Arrays;

class CustomArrayList{

    Object data[];
    private int DEFAULT_SIZE=10;
    private int index=0;

    public CustomArrayList(Object data[]){
        this.data=new Object[DEFAULT_SIZE];
    }

    public void add(Object n){
        if(isFull()) {
            resize();
        }

        data[index++]=n;
    }

    private boolean isFull(){
        return data.length==DEFAULT_SIZE;
    }

    private void resize(){
        Object newData[]=new Object[DEFAULT_SIZE*2];
        for (int i = 0; i < data.length; i++) {
            newData[i]=data[i];
        }
        data=newData;
    }

    public void remove(){
        if(index>0){
            index--;
            data[index]=0;
        }else {
            System.out.println("Array is empty, nothing to remove.");
        }
    }

    public void print(){
        Object ArrayToPoint[]=Arrays.copyOfRange(data,0,index);
        System.out.println(Arrays.toString(ArrayToPoint));
    }

    public int size(){
        return index;
    }
}