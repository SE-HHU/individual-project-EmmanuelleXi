package work01;

import java.util.*;
public class Equation01 {           //class Equation01 做两位数运算
    Random r = new Random();
    int x = r.nextInt(10, 100);
    int y = r.nextInt(10, 100);
    int ans = 0;
    int flag = 0;
    public void add() {                 
        while((x+y)>100) {
            x = r.nextInt(10, 100);
            y = r.nextInt(10, 100);
        }
        ans = x + y;
        flag = 0;
    }
    public void sub(){
        if (x < y){
            int temp = 0;
            temp = x;
            x = y;
            y = temp;
        }
        ans = x -y;
        flag = 1;
    }
    public void creat(){             //把 add（）和 sub（）包装到create（）里，增加代码简洁性
        if(r.nextBoolean())
            this.add();
        else
            this.sub();
    }
    public boolean compare(Equation01 ep){
        if((ep.flag == this.flag)     //前面运行的运行中有与本次运行结果相同的算式
            &&(ep.x == this.x)
            &&(ep.y == this.y))
            return true;                //出现重复返回true
        return false;                    //不重复返回false
    }
    public String toString(){
        StringBuilder stb = new StringBuilder("");
        if(this.flag == 0)                                        //把算式存入tostring（）
            stb.append(x+"+"+y+"=");
        else if(this.flag == 1)
            stb.append(x+"-"+y+"=");
        return stb.toString();
    }
}
