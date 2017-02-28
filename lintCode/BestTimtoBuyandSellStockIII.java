/**
 * 
 */
package scu.wsn.lx;

/**
 * @author LX
 * 2017年1月6日
 */
public class BestTimtoBuyandSellStockIII {
	 class Block{
         int start;
         int end;
          boolean fill; 
          public Block(int s,int e,boolean f){
              this.start = s;
              this.end = e;
              this.fill = f;
          }
     }
    public int maxProfit(int[] prices) {
        // write your code here
        if(prices.length>0){
            Block block = new Block();
            //第一次卖出的最大利润
            int max = getMax(prices,0,prices.length-1,block);
            //第二次的最大利润
            ArrayList<Block> list = new ArrayList<>();
            list.add(block);
            list.add(new Block(0,block.start-1,false));
            list.add(new Block(block.end+1,prices.length-1;false));
            int maxSub = 0;  
           for(int i = 0; i < list.size(); ++i){  
            int tmp;  
            if(list.get(i).fill){  
                tmp = -getMin(prices, list.get(i).start,list.get(i).end, tmpSub);  
            }else{  
                tmp = getMax(prices, list.get(i).start, list.get(i).end, tmpSub);  
            }  
            if(tmp > maxSub){  
                maxSub = tmp;  
            }  
        }  
        return max + maxSub;  
        }
        return 0;
    }
    
    
    int getMax(int prices[],int start,int end, Block block){
        if(start < end){
            block.fill = true;
            int max = 0;
            int currIndex = start;
            for(int i = start;i< end;i++){
                if(prices[i]< prices[currIndex])
                    currIndex = i;
                else{
                    int temp = prices[i] - prices[currIndex];
                    if(temp > max){
                        max = temp;
                        block.start = i;
                        block.end = currIndex;
                    }
                }
            }
            return max;
        }
        return 0;
    }
    
    int getMin(int prices[],int start,int end, Block block){
         if(start < end){
            block.fill = true;
            int min = 0;
            int currIndex = start;
            for(int i = start;i< end;i++){
                if(prices[i] > prices[currIndex])
                    currIndex = i;
                else{
                    int temp = prices[i] - prices[currIndex];
                    if(temp < min){
                        min = temp;
                        block.start = i;
                        block.end = currIndex;
                    }
                }
            }
            return min;
        }
        return 0;
    }
}
