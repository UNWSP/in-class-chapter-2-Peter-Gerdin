//  Peter Gerdin, Sep 1, 2022

import javax.swing.JOptionPane;
public class calcTwinsTix {
    public static void main(String[] args){
        //  ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
        final int TICKET_COST = 75;   final int PROCESSING_FEE = 20;  final double SALES_TAX = .07;
            double FinalCost = 0;  double CostBeforeTax = 0;  double tax = 0;

                String input = JOptionPane.showInputDialog("Enter the number of Twins Tickets", null);
                    int NumberOfTickets = Integer.parseInt(input);

            //  --------------------------------------------------------------------------------

                    CostBeforeTax  =  (NumberOfTickets  * TICKET_COST  +  PROCESSING_FEE);
                tax = CostBeforeTax * SALES_TAX;
        FinalCost = CostBeforeTax + tax;

        JOptionPane.showMessageDialog(null, "Total cost for " + input + " tickets is $" +
                String.format("%,.1f",FinalCost));
        //  ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    }
}
