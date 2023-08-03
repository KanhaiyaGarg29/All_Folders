package generics;

import java.util.Arrays;

public class customGenericArrayList<T> {
    private Object[] data;
    private static int default_size=10;
    private int size=0;  //also working as index value

    public customGenericArrayList(){
        this.data=new Object[default_size];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    private boolean isFull(){
        return size==data.length;
    }
    private void resize(){
        Object[] temp=new Object[data.length*2];
        //copy the current items int the new array
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public T remove(){
        T removed=(T)(data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public int size(){
        return size;
    }
    public void set(int index,T value){
        data[index]=value;
    }
    @Override
    public String toString(){
        return "CustomArrayList{"+"data="+Arrays.toString(data)+", size="+size+'}';
    }
    public static void main(String[] args) {
        customGenericArrayList<Integer>list=new customGenericArrayList<>();
        // list.add(45);
     for(int i=0;i<14;i++){
        list.add(2*i);
     }
     System.out.println(list);
    }
}
