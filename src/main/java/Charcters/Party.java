package Charcters;

public class Party {

    private AlignmentType alignment;
//    private ArrayList<Item> items;

    public Party(AlignmentType alignment) {
        this.alignment = alignment;
    }

    public AlignmentType getAlignment() {
        return this.alignment;
    }
}
