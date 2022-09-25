package work01;

import java.util.*;
public class Equation02 {
    Random r = new Random();
    int x = r.nextInt(10,100);
    int y = r.nextInt(10,100);
    int z = r.nextInt(10,100);
    int ans = 0;
    int flag1 = 0;
    int flag2 = 0;      //0值表示加 1值表示减
    public void firstAdd(){
        flag1 = 0;
        if(r.nextBoolean()){
            while((x+y+z)>100) {
                x = r.nextInt(10, 50);
                y = r.nextInt(10, 50);
                z = r.nextInt(10,50);
            }
            flag2 = 0;
        }else {
            while((x + y) > 100) {
                x = r.nextInt(10, 100);
                y = r.nextInt(10, 100);
            }
            while((x + y - z) < 0){
                z = r.nextInt(10,80);
            }
            flag2 = 1;
        }
    }
    public void firstSub(){
        flag1 = 1;
        if (x < y){
            int temp = 0;
            temp = x;
            x = y;
            y = temp;
        }
        if(r.nextBoolean()){
            while((x - y + z) > 100)
                z = r.nextInt(10,100);
            flag2 = 0;
        }else{
            while(x - y < 10){
                x = r.nextInt(30, 100);
                y = r.nextInt(10, 100);
            }
            while((x - y - z) < 0){
            z = r.nextInt(10,50);
        }
            flag2 = 1;
        }
    }
    public void creat(){
        if(r.nextBoolean())
            this.firstAdd();
        else
            this.firstSub();
    }
    public boolean compare(Equation02 ep){
        if((ep.flag1 == this.flag1)
                &&(ep.flag2 == this.flag2)
                &&(ep.x == this.x)
                &&(ep.y == this.y)
                &&(ep.z == this.z))
            return true;
        return false;
    }
    public String toString() {
        StringBuilder stb = new StringBuilder("");
        switch (this.flag1){
            case 0 : stb.append(x + "+" + y );
                ans = x + y ;
                break;
            case 1 : stb.append(x + "-" + y );
                ans = x - y ;
                break;
            default: return "";
        }
        switch (this.flag2){
            case 0 : stb.append("+" + z + "=");
                ans += z;
                break;
            case 1 : stb.append("-" + z + "=");
                ans -= z;
                break;
            default: return "";
        }
        return stb.toString();
    }
}
