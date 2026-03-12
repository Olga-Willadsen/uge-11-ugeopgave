package opgave_2;

import java.util.ArrayList;

public class PaintJob {
    String name;
    ArrayList <Shape> surfaces = new ArrayList();
    ArrayList <Shape> deductions = new ArrayList();


    void addSurface (Shape s){
        surfaces.add(s);
    }

    void addDeductions (Shape s){
        deductions.add(s);
    }

    double getTotalSurface(){
        double sum=0;
        for (Shape s:surfaces){
                sum+=s.getArea();}
        return sum;
    }

    double getTotalDeductions(){
        double sum=0;
        for (Shape s:deductions){
            sum+=s.getArea();
        }
        return sum;
    }

    double getPaintableArea(){
        double sum=0;
        sum=getTotalSurface()-getTotalDeductions();
        return sum;
    }


    void printSummary(){
        System.out.println("=== "+this.name+ " needs a paintjob ===");
        System.out.println(getTotalSurface()+" kvm is the total surface of the room, but ");
        System.out.println(getTotalDeductions()+" kvm are windows and doors ");
        System.out.println(getPaintableArea()+" kvm is the total are needing to be painted");

    }

    public void paintJobGenerator(){
        surfaces.add(new Rectangle(3.5, 2.38));
        surfaces.add(new Rectangle(5.6, 2.38));
        deductions.add(new Square(1.2));
        deductions.add(new Square(1.2));

    }


}

//Lav en klasse PaintJob med:
//
//Felt: name (String) — fx "Stue"
//Felt: surfaces (ArrayList<Shape>) — flader der skal males (vægge, loft)
//Felt: deductions (ArrayList<Shape>) — flader der ikke skal males (vinduer, døre)
//Metoder:
//
//void addSurface(Shape s)
//void addDeduction(Shape s)
//double getTotalSurface() — sum af areal i surfaces
//double getTotalDeductions() — sum af areal i deductions
//double getPaintableArea() — overflader minus fradrag
//void printSummary() — printer en oversigt (se eksempel nedenfor)
