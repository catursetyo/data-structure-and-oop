package polymorphism;

class Noodle {
    public void cook() {
        System.out.println("Memasak mie instan biasa...");
    }
}

class Gacoan extends Noodle {
    @Override
    public void cook() {
        System.out.println("Memasak Mie Gacoan level 6...");
    }
}

class Indomie extends Noodle {
    @Override
    public void cook() {
        System.out.println("Merebus Indomie al dente...");
    }
}