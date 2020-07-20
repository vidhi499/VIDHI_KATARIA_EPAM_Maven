package org.maven;

public class Candy extends Sweet {
    int no_of_candies[];

    Candy(int w,int n, int no[], String name[])
    {
        weight = w;
        totalChildren = n;
        no_of_candies = new int[n];
        ChildrenName = new String[n];
        for(int i=0;i<n;i++)
        {
            ChildrenName[i] = name[i];
            no_of_candies[i] = no[i];
        }
    }

    int totalCandies()
    {
        int sum=0;
        for(int i=0;i<no_of_candies.length;i++)
        {
            sum=sum+no_of_candies[i];
        }
        return sum;
    }

    int totalWeight()
    {
        int total=totalCandies();
        return weight*total;
    }

    int get_max_candy()
    {
        int max=no_of_candies[0];
        for(int i=1;i<no_of_candies.length;i++)
        {
            if(no_of_candies[i]>max)
            {
                max=no_of_candies[i];
            }
        }
        return max;
    }

    String getName()
    {
        int max=no_of_candies[0];
        String name=ChildrenName[0];
        for(int i=1;i<no_of_candies.length;i++)
        {
            if(no_of_candies[i]>max)
            {
                max=no_of_candies[i];
                name=ChildrenName[i];
            }
        }
        return name;
    }


    void sort_on_candy()
    {
        int n=no_of_candies.length;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                if(no_of_candies[j]<no_of_candies[j+1])
                {
                    int temp=no_of_candies[j];
                    no_of_candies[j]=no_of_candies[j+1];
                    no_of_candies[j+1]=temp;
                    String str=ChildrenName[j];
                    ChildrenName[j]=ChildrenName[j+1];
                    ChildrenName[j+1]=str;
                }
            }
        }
        System.out.println("After sorting on the basis of Candies: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(ChildrenName[i]+" got "+no_of_candies[i]+" Candies");
        }
    }

    void display()
    {
        for(int i=0;i<totalChildren;i++)
        {
            System.out.println(ChildrenName[i]+" got "+no_of_candies[i]+" Candies");
        }
        System.out.println("Total Candies: "+ totalCandies());
        System.out.println("Total weight of Candies: "+totalWeight());
        System.out.println(getName()+" got maximum number of Candies , i.e, "+get_max_candy());
        sort_on_candy();
    }
}