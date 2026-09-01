package course.week2;

public final class LegacyOrderFormatter {
    private LegacyOrderFormatter() {
    }

    static String statusLabel(int status) {
        String label;
        switch (status) {
            case 1:
                label = "CREATED";
                break;
            case 2:
                label = "PAID";
                break;
            case 3:
                label = "SHIPPED";
                break;
            default:
                label = "UNKNOWN";
        }
        return label;
    }

    static String normalizeId(Object id) {
        if (id instanceof String) {
            String value = (String) id;
            return value.trim().toUpperCase();
        }
        return "INVALID";
    }

    static String json(String id, int status) {
        return "{\n" +
                "  \"id\": \"" + id + "\",\n" +
                "  \"status\": \"" + statusLabel(status) + "\"\n" +
                "}";
    }

    public static void main(String[] args) {
        System.out.println(statusLabel(2));
        System.out.println(statusLabel(99));
        System.out.println(normalizeId(" order-1 "));
        System.out.println(json("ORDER-1", 1));
    }
}
