package ua.edu.znu.shapecalc;

import javax.swing.JOptionPane;

/**
 * This class Main starts app.
 */

public final class ShapeCalc {
    private ShapeCalc() {
}

    /**
     * Main function.
     * @param args line comment args.
     */

    public static void main(final String[] args) {
        String first;
        String second;
        double choice;
        double radius;
        double width;
        double area;
        double length;
        String value = " ";

        value = JOptionPane.showInputDialog("Please chose one of the options:" + "\n"
                + "a)Enter 1 to calculate the area of the Circle" + "\n"
                + "b)Enter 2 to calculate the area of the Triangle" + "\n"
                + "c)Enter 3 to calculate the area of the Square" + "\n"
                + "d)Enter 4 to calculate the area of the Rectangle" + "\n"
                + "e)Enter 5 to calculate the area of the Cube" + "\n"
                + "f)Enter 6 to exit the program");
        choice = Double.parseDouble(value);

        while (choice != '6') {
            if (choice == 1) {
                first = JOptionPane.showInputDialog("Enter the value of radius");
                radius = Double.parseDouble(first);
                area = Math.PI * radius * radius;
                JOptionPane.showMessageDialog(null, "The area of the Circle:    " + area, "result",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (choice == '2') {
                first = JOptionPane.showInputDialog("Enter the value of lenght");
                second = JOptionPane.showInputDialog("Enter the value of width");
                length = Double.parseDouble(first);
                width = Double.parseDouble(second);
                area = (width * length) / 2;
                JOptionPane.showMessageDialog(null, "The area of triangle:     " + area, "result",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (choice == '3') {
                first = JOptionPane.showInputDialog("Enter the value of length");
                length = Double.parseDouble(first);
                area = length * length;
                JOptionPane.showMessageDialog(null, "The area of the square:    " + area, " result",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (choice == '4') {
                first = JOptionPane.showInputDialog("Enter the value of length");
                second = JOptionPane.showInputDialog("Enter the value of width");
                length = Double.parseDouble(first);
                width = Double.parseDouble(second);
                area = width * length;
                JOptionPane.showMessageDialog(null, "The area of the rectangle:     " + area, "result",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (choice == '5') {
                first = JOptionPane.showInputDialog("Enter the value of length");
                length = Double.parseDouble(first);
                area = '6' * length;
                JOptionPane.showMessageDialog(null, "The area of the cube:  " + area, "result",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            value = JOptionPane.showInputDialog("Please chose one of the options:" + "\n"
                    + "a)Enter 1 to calculate the area of the Circle" + "\n"
                    + "b)Enter 2 to calculate the area of the Triangle" + "\n"
                    + "c)Enter 3 to calculate the area of the Square" + "\n"
                    + "d)Enter 4 to calculate the area of the Rectangle" + "\n"
                    + "e)Enter 5 to calculate the area of the Cube" + "\n"
                    + "f)Enter 6 to exit the program");

            choice = Double.parseDouble(value);
        }
        System.out.println("Program terminated\n");
        System.exit(0);
    }
}
