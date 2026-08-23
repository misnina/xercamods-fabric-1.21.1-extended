package xerca.xercapaint;


public enum CanvasType {
    SMALL, LARGE, LONG, TALL, EXTRA_LARGE, EXTRA_LONG, EXTRA_TALL, SUPER_LARGE, SUPER_TALL, SUPER_LONG;

    public byte toByte() {
        return switch (this) {
            case SMALL -> 0;
            case LARGE -> 1;
            case LONG -> 2;
            case TALL -> 3;
            case EXTRA_LARGE -> 4;
            case EXTRA_LONG -> 5;
            case EXTRA_TALL -> 6;
            case SUPER_LARGE -> 7;
            case SUPER_TALL -> 8;
            case SUPER_LONG -> 9;
        };
    }

    public static CanvasType fromByte(byte x) {
        return switch (x) {
            case 1 -> LARGE;
            case 2 -> LONG;
            case 3 -> TALL;
            case 4 -> EXTRA_LARGE;
            case 5 -> EXTRA_LONG;
            case 6 -> EXTRA_TALL;
            case 7 -> SUPER_LARGE;
            case 8 -> SUPER_TALL;
            case 9 -> SUPER_LONG;
            default -> SMALL;
        };
    }

    public static int getWidth(CanvasType canvasType) {
        return switch (canvasType) {
            case SMALL, TALL -> 16;
            case LARGE, LONG, EXTRA_TALL -> 32;
            case EXTRA_LARGE, EXTRA_LONG, SUPER_TALL -> 48;
            case SUPER_LARGE, SUPER_LONG -> 64;
        };
    }

    public static int getHeight(CanvasType canvasType) {
        return switch (canvasType) {
            case SMALL, LONG -> 16;
            case LARGE, TALL, EXTRA_LONG -> 32;
            case EXTRA_LARGE, EXTRA_TALL, SUPER_LONG -> 48;
            case SUPER_LARGE, SUPER_TALL -> 64;
        };
    }
}
