package NewTonAssinment;
import java.util.*;



class pair{
    
    int first;
    int second;
    pair(int f, int s)
    {
        this.first = f;
        this.second = s;
    }
}

public class Kclosestpoints {
    
    static class pair1{
        int first;
        int second;
        long third;
     }

public static ArrayList<pair> kNeighbourPoints(ArrayList<pair> points, pair P, int K)
{
        ArrayList<pair1> ans = new ArrayList<pair1>();

        for(int i=0; i<points.size(); i++){
            pair oldPair = points.get(i);

            pair1 freshPair = new pair1();
            freshPair.first = oldPair.first;
            freshPair.second = oldPair.second;

            long xDist = oldPair.first - P.first;
            long yDist = oldPair.second - P.second;

            freshPair.third = xDist*xDist + yDist*yDist;

            ans.add(freshPair);
        }

        Collections.sort(ans, new Comparator<pair1>(){
             @Override
             public int compare(pair1 p1, pair1 p2)
             {
                 return p1.third < p2.third? -1:1;
             }
         });

        ArrayList<pair> finalAns = new ArrayList<pair>();

        for(int i=0; i<K; i++){
            pair1 oldPair = ans.get(i);

            pair newpair = new pair(oldPair.first,oldPair.second);

            finalAns.add(newpair);
        }


        return finalAns;

 }


}
