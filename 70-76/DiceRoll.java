import java.util.*;
class DiceRoll{
int roll(){
double random=Math.random() * 6;//because math.random is from 0 to 1
 return (int)Math.ceil(random);
}
public static void main(String[] args){
DiceRoll dice=new DiceRoll();
for(int i=0;i<10;i++)
{
System.out.println(dice.roll());
}
}
}