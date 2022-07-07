class Solution {
    public int romanToInt(String s) {
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='M')
            {
                k+=1000;
            }
            else if(s.charAt(i)=='D')
            {
                k+=500;
            }
            else if(s.charAt(i)=='C')
            {
                if(i!=s.length()-1)
                {
                    if(s.charAt(i+1)=='M')
                    {
                    k+=900;
                    i++;
                    }
                    else if(s.charAt(i+1)=='D')
                    {
                    k+=400;
                    i++;
                    }
                    else
                    {
                        k+=100;
                    }
                 }
                else
                {
                    k+=100;
                }
            }
            else if(s.charAt(i)=='L')
            {
                k+=50;
            }
            else if(s.charAt(i)=='X')
            {
                if(i!=s.length()-1)
                {
                   if(s.charAt(i+1)=='C')
                    {
                    k+=90;
                    i++;
                    }
                    else if(s.charAt(i+1)=='L')
                    {
                    k+=40;
                    i++;
                    }
                    else
                    {
                        k+=10;
                    }
                  }
                else
                {
                    k+=10;
                }
            }
            else if(s.charAt(i)=='V')
            {
                k+=5;
            }
            else if(s.charAt(i)=='I')
            {
                if(i<s.length()-1)
                {
                  if(s.charAt(i+1)=='X')
                  {
                     k+=9;
                     i++;
                  }
                  else if(s.charAt(i+1)=='V')
                  {
                    k+=4;
                    i++;
                  }
                    else
                    {
                        k+=1;
                    }
                }
                else
                {
                k+=1;
                }
            }
        }
        return k;
    }
}