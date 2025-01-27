class Sport {
    void play() {
        System.out.println("Playing a sport.");
    }
}

class Football extends Sport {
    void play() {
        System.out.println("Playing football.");
    }
}

class Cricket extends Sport {
    void play() {
        System.out.println("Playing cricket.");
    }

    public static void main(String[] args) {
        Sport sport1 = new Football();
        Sport sport2 = new Cricket();

        sport1.play();
        sport2.play();
    }
}
