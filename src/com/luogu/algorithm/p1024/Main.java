package com.luogu.algorithm.p1024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().trim().split("\\s+");
        reader.close();
        double a = Double.parseDouble(line[0]);
        double b = Double.parseDouble(line[1]);
        double c = Double.parseDouble(line[2]);
        double d = Double.parseDouble(line[3]);
        double A = b*b - 3*a*c;
        double B = b*c - 9*a*d;
        double C = c*c - 3*b*d;
        double t = (2*A*b - 3*a*B) / (2*sqrt(A*A*A));
        double theta = acos(t);
        double x1 = (-b-2*sqrt(A)*cos(theta/3)) / (3*a);
        double x2 = (-b + sqrt(A)*(cos(theta/3) - sqrt(3)*sin(theta/3))) / (3*a);
        double x3 = (-b + sqrt(A)*(cos(theta/3) + sqrt(3)*sin(theta/3))) / (3*a);
        System.out.printf("%.2f %.2f %.2f", x1, x2, x3);
    }

}
