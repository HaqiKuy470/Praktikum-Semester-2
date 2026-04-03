class Lingkaran {
    double radius;

    Lingkaran() {
        radius = 1.0;
    }

    Lingkaran(double r) {
        radius = r;
    }

    double luas() {
        return radius * radius * Math.PI;
    }
}
