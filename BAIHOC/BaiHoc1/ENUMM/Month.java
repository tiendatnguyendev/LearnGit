package BAIHOC.BaiHoc1.ENUMM;
// Số lượng giá trị hữu hiệu thì sử dụng Enum, vd: tháng, giới tính, mùa, thứ trong tuần.
public enum Month {
    January(31),
    February(29),
    March(30),
    April(30),
    May(31),
    June(30),
    July(31),
    August(31),
    Septemper(30),
    October(31),
    November(30),
    December(31);
    private final int numDay;
    Month (int numDay) {
        this.numDay = numDay;
    }

    public int getNumberDay(){
        return numDay;
    }
}
