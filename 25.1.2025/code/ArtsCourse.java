class Course {
    void details() {
        System.out.println("General course details.");
    }
}

class ScienceCourse extends Course {
    void details() {
        System.out.println("This is a Science course.");
    }
}

class ArtsCourse extends Course {
    void details() {
        System.out.println("This is an Arts course.");
    }

    public static void main(String[] args) {
        Course course;

        course = new ScienceCourse();
        course.details();

        course = new ArtsCourse();
        course.details();
    }
}
