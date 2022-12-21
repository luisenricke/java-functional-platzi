package com.platzi.chaining;

public class Chaining {

    static class Chainer {
        public Chainer create() {
            System.out.println("created");
            return this;
        }

        public Chainer destroy() {
            System.out.println("destroyed");
            return this;
        }
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("one")
                .append("two")
                .append("three");

        Chainer chainer1 = new Chainer();
        Chainer chainer2 = chainer1.create();
        Chainer chainer3 = chainer1.destroy();
    }
}
