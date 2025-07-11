package Practice.Leetcode;

import java.util.Arrays;

public class SpiralMatrix3 {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] directions = {
                {0,1}, //East
                {1,0}, //South
                {0,-1}, //West
                {-1,0} //North
        };

        int[][] result = new int[rows*cols][2];
        int step = 0; //Kitna move krna ek bar me ek taraf
        int dir = 1; //kis direction me jan h;

        result[0] = new int[]{rStart, cStart};
        int count = 1; //Indexing ke liye and sare add hue ki nhi usko check krne ke liye

        while(count < rows*cols){
            //Jab bhi east ya west jaye, Steps badhane badenge loop execute krne se pehle
            if(dir == 0 || dir == 2) step++;

            for(int i = 0; i < step; i++){
                rStart += directions[dir][0];
                cStart += directions[dir][1];

                //Condition me boundary check krke add kr do answers me
                if(rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols){
                    result[count++] = new int[]{rStart,cStart};
                }
            }

            dir = (dir + 1) % 4;
        }
        return result;
    }

    public static void main(String[] args) {
        SpiralMatrix3 obj = new SpiralMatrix3();
        System.out.println(Arrays.deepToString(obj.spiralMatrixIII(5, 6, 1,4)));

    }
}

