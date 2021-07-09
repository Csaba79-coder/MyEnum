public enum MyEnum {
    FIRST("First", 1),
    SECOND("Second", 2),
    THIRD("Third", 3);

    public final String label;
    public final int num;

    MyEnum(String label, int num) {
        this.label = label;
        this.num = num;
    }

    public MyEnum getEnumByLabel(String label) {
        for (MyEnum myEnum : values()) {                // values() returns MyEnums[] with all available enum
            if (myEnum.label.equalsIgnoreCase(label))
                return myEnum;
        }
        return null;
    }

    public MyEnum getEnumByNum(int num) {
        for (MyEnum myEnum : values()) {
            if (myEnum.num == num)
                return myEnum;
        }
        return null;
    }
}
