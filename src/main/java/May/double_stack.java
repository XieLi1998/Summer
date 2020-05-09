package May;

/**
 * Created by xieli on 2020/5/9.
 */
public class double_stack {
    private int length;
    private int top1,top2;
    private int[] nums;

    public double_stack(int length){
        this.length=length;
        nums=new int[length];
        top1=-1;
        top2=length;
    }

    //定义两个栈的push和pop
    public boolean push1(int a){
        if (top1+1==top2){
            return false;
        }else {
            nums[++top1]=a;
            return true;
        }
    }

    public boolean push2(int a){
        if (top2-1==top1){
            return false;
        }else {
            nums[--top2]=a;
            return true;
        }
    }

    public boolean pop1(){
        if (top1==-1){
            return false;
        }else {
            top1--;
            return true;
        }
    }

    public boolean pop2(){
        if (top1==length){
            return false;
        }else {
            top1++;
            return true;
        }
    }
}
