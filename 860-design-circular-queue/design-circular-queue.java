class MyCircularQueue {
    int size;
    int f;
    int r;
    int[] arr;

    public MyCircularQueue(int k) {
        arr=new int[k];
    }
    
    public boolean enQueue(int value) {
        if(size==arr.length)return false;
        else{
            arr[r++]=value;
            size++;
        }
        if(r==arr.length)r=0;
        return true;
    }
    
    public boolean deQueue() {
        if(size==0)return false;
        else{
            f++;
            size--;
        }
        if(f==arr.length)f=0;
        return true;
    }
    
    public int Front() {
        if(size==0)return -1;
        return arr[f];
    }
    
    public int Rear() {
        if(size==0)return -1;
        return arr[(r-1+arr.length)%(arr.length)];
    }
    
    public boolean isEmpty() {
        return (size==0);
    }
    
    public boolean isFull() {
        return (size==arr.length);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */