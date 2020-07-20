package org.maven;

public class Chocolate extends Sweet {
    int no_of_chocolate[];

    Chocolate(int w,int n, int no[], String name[])
    {
        weight = w;
        totalChildren = n;
        int i;
        no_of_chocolate = new int[n];
        ChildrenName = new String[n];
        for(i=0;i<n;i++)
        {
            ChildrenName[i] = name[i];
            no_of_chocolate[i] = no[i];
        }
    }

    int totalChocolates()
    {
        int i,sum=0;
        for(i=0;i<no_of_chocolate.length;i++)
        {
            sum=sum+no_of_chocolate[i];
        }
        return sum;
    }

    int totalWeight()
    {
        int total=totalChocolates();
        return weight*total;
    }

    int get_max_chocolate()
    {
        int i,max=no_of_chocolate[0];
        for(i=1;i<no_of_chocolate.length;i++)
        {
            if(no_of_chocolate[i]>max)
            {
                max=no_of_chocolate[i];
            }
        }
        return max;
    }

    String getName()
    {
        int i,max=no_of_chocolate[0];
        String name=ChildrenName[0];
        for(i=1;i<no_of_chocolate.length;i++)
        {
            if(no_of_chocolate[i]>max)
            {
                max=no_of_chocolate[i];
                name=ChildrenName[i];
            }
        }
        return name;
    }

    void sort_chocolate()
    {
        int n=no_of_chocolate.length;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                if(no_of_chocolate[j]<no_of_chocolate[j+1])
                {
                    int temp=no_of_chocolate[j];
                    no_of_chocolate[j]=no_of_chocolate[j+1];
                    no_of_chocolate[j+1]=temp;
                    String str=ChildrenName[j];
                    ChildrenName[j]=ChildrenName[j+1];
                    ChildrenName[j+1]=str;
                }
            }
        }
        System.out.println("After sorting on the basis of Chocolates: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(ChildrenName[i]+" got "+no_of_chocolate[i]+" Chocolates");
        }
    }

    void display()
    {
        int i;
        for(i=0;i<totalChildren;i++)
        {
            System.out.println(ChildrenName[i]+" got "+no_of_chocolate[i]+" Chocolates");
        }
        System.out.println("Total Chocolates: "+ totalChocolates());
        System.out.println("Total weight of Chocolates: "+totalWeight());
        System.out.println(getName()+" got maximum number of Chocolates , i.e, "+get_max_chocolate());
        sort_chocolate();
    }
}