package RandomPractice;
import java.util.*;

 class coincount {
     public static void main(String args[]) {

             int answer = 0;
             int money = 1999;
             int[] costs = {2,11, 20, 100, 200, 600};
             Coins[] cChk = new Coins[costs.length];

             for (int i = 0; i < costs.length; i++) {
                 double coinv = 0;
                 double ratio = 0;

                 switch (i) {
                     case 0:
                         coinv = 1;
                         ratio = (double)costs[i] / coinv;
                         break;
                     case 1:
                         coinv = 5;
                         ratio = (double)costs[i] / coinv;
                         break;

                     case 2:
                         coinv = 10;
                         ratio = (double)costs[i] / coinv;
                         break;
                     case 3:
                         coinv = 50;
                         ratio = (double)costs[i] / coinv;
                         break;
                     case 4:
                         coinv = 100;
                         ratio = (double)costs[i] / coinv;
                         break;
                     case 5:
                         coinv = 500;
                         ratio = (double)costs[i] / coinv;
                         break;
                 }
                 cChk[i] = new Coins((int)coinv, costs[i], ratio);
             }

             Arrays.sort(cChk);

             for(int i = 0; i < cChk.length; i++){
                 int ct = money/cChk[i].coin;
                 answer += cChk[i].cost * ct;
                 money = money % cChk[i].coin;
             }
         System.out.println(answer);



     }

         static class Coins implements Comparable<Coins> {
             int coin, cost;
             double costRatio;

             public Coins(int coin, int cost, double costRatio) {
                 this.coin = coin;
                 this.cost = cost;
                 this.costRatio = costRatio;
             }

             @Override
             public int compareTo(Coins c) {
                 if (c.costRatio == this.costRatio)
                     return this.cost - c.cost;
                 else if (this.costRatio - c.costRatio > 0)
                     return 1;
                 else
                     return -1;
             }
         }

}
