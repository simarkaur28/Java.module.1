public class Salary
{
    public static void main(String[] args)
    {
        double gross, net, DA, HRA, CCA = 240, PF, PT = 100, basic = 25000;
        DA = (basic * .7);
        PF = basic * (10 / 100);
        HRA = basic * (30 / 100);

        gross = DA + HRA + CCA + basic;
        net = gross - PF - PT;
        System.out.println("Gross Salary And Net Salary! " + gross+" " + net);
    }
}
