package ProgWithClasses;

import java.awt.*;

public class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;
    private double side12;
    private double side23;
    private double side13;

    public Triangle(Point p1, Point p2, Point p3){
        point1=p1;
        point2=p2;
        point3=p3;
        side12=Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
        side23=Math.sqrt((p3.x-p2.x)*(p3.x-p2.x)+(p3.y-p2.y)*(p3.y-p2.y));
        side13=Math.sqrt((p3.x-p1.x)*(p3.x-p1.x)+(p3.y-p1.y)*(p3.y-p1.y));
    }

    public double getPerimeter(){
        return side12+side23+side13;
    }

    public double getSquare(){
        double p=getPerimeter();
        double s;
        s=Math.sqrt(p*(p-side12)*(p-side23)*(p-side13));
        return s;
    }

    public Point getCrossMPoint(){
        Point p=new Point(0,0);
        Point m23=getMPoint(23);
        Point m12=getMPoint(12);
        double a1=point1.y-m23.y;
        double a2=point3.y-m12.y;
        double b1=m23.x-point1.x;
        double b2=m12.x-point3.x;
        double d=Math.abs(a1*b2+a2*b1);
        if(d!=0){
            double c1=m23.y*point1.x+m23.x*point1.y;
            double c2=m12.y*point3.x+m12.x*point3.y;
            p.x=(int)((b1*c2-b2*c1)/d);
            p.y=(int)((a2*c1-a1*c2)/d);
        }
        return p;
    }

    private Point getMPoint(int i){
        Point p=new Point(0,0);
        if(i==12){
            p.x=(point1.x+point2.x)/2;
            p.y=(point1.y+point2.y)/2;
        }
        if(i==23){
            p.x=(point2.x+point3.x)/2;
            p.y=(point2.y+point3.y)/2;
        }if(i==13){
            p.x=(point1.x+point3.x)/2;
            p.y=(point1.y+point3.y)/2;
        }
        return p;
    }
}
