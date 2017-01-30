package com.abh.java.innerclass;

public class OuterClass {
    public InnerClass output = new InnerClass();

    class InnerClass {
        public void print() {
            System.out.println("In Class");
        }
    }

    class VolumeCalulator {
        double getVolume(int r) {
            return r * r;
        }

        double getVolume(int l, int b, int h) {
            return l * b * h;
        }
    }

    public VolumeCalulator calc() {
        return new VolumeCalulator();
    }

    public OuterClass() {
        // output = new InnerClass();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.output.print();
    }

}
